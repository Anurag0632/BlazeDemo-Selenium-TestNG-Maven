package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.PurchasePage;
import pages.ReservePage;

public class HomeReservePurchase extends BaseClass {

	@Test
	public void homeReserveAndPurchasePage() {

		// Home Page

		HomePage hp = new HomePage(driver);
		hp.selectDeparturCity("Boston");
		hp.selectDestinationCity("Buenos Aires");
		hp.submitButton();

		// Reserve Page

		ReservePage rp = new ReservePage(driver);

		rp.selectFlightButton();

		// Purchase Page

		PurchasePage pp = new PurchasePage(driver);
		pp.fillPersonalDetails("Anurag", "41 23 Sector 37", "Noida", "U.P.", "201301");
		pp.cardDetails("American Express", "9432560075126994", "03", "2029", "Anurag Kumar Maurya");
		pp.submitButton();

	}
}
