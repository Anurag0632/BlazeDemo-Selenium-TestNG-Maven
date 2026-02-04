package negative;

import org.testng.annotations.Test;

import dataProviders.DataWithNonNumericCCDetail;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pages.HomePage;
import pages.PurchasePage;
import pages.ReservePage;
import tests.BaseClass;

public class FlightBookingTestWithNonNumericCCDetails extends BaseClass {

	@Test(groups = "negative", dataProvider = "supplyData", dataProviderClass = DataWithNonNumericCCDetail.class)
	public void testWithNonNumericCCDetail(String Departure, String Destination, String Name, String Address,
			String City, String State, String ZipCode, String text, String CardNumber, String month, String year,
			String nameoncard) {
		HomePage hp = new HomePage(driver);

		hp.selectDeparturCity(Departure);
		hp.selectDestinationCity(Destination);
		hp.submitButton();

		ReservePage rp = new ReservePage(driver);

		rp.selectFlightButton();

		PurchasePage pp = new PurchasePage(driver);
		pp.fillPersonalDetails(Name, Address, City, State, ZipCode);
		pp.cardDetails(text, CardNumber, month, year, nameoncard);
		pp.submitButton();

		new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("confirmation"));

		String url = driver.getCurrentUrl();

		Assert.assertFalse(url.contains("confirmation"),
				"BUG is present: WebPage navigateed to confirmation page even when credit card number are non numeric");
	}
}
