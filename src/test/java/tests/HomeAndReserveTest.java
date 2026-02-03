package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ReservePage;

public class HomeAndReserveTest extends BaseClass {

	@Test
	public void homeAndReservePage() {

		// Home Page

		HomePage hp = new HomePage(driver);
		hp.selectDeparturCity("Boston");
		hp.selectDestinationCity("Buenos Aires");
		hp.submitButton();

		// Reserve Page

		ReservePage rp = new ReservePage(driver);
		rp.selectFlightButton();
	}

}
