package functional;

import org.testng.annotations.Test;

import dataProviders.SendPositiveData;

import org.testng.AssertJUnit;

import org.testng.Assert;

import pages.ConfirmationPage;
import pages.HomePage;
import pages.PurchasePage;
import pages.ReservePage;
import tests.BaseClass;

public class FlightBookingTestWithDetail extends BaseClass {

	@Test(groups = "functional", dataProvider = "supplyData", dataProviderClass = SendPositiveData.class)
	public void flightBookingsWithDataDriven(String Departure, String Destination, String Name, String Address,
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

		ConfirmationPage cp = new ConfirmationPage(driver);
		String url = cp.url();

		AssertJUnit.assertTrue(url.contains("confirmation"));

		String Actual = cp.statusMessage();
		String Expected = "Thank you for your purchase today!";
		Assert.assertEquals(Actual, Expected);
		System.out.println(Actual);

	}
}
