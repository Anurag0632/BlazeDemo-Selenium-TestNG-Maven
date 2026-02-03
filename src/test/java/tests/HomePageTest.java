package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest extends BaseClass {

	@Test
	public void homePageTest() {
		HomePage hp = new HomePage(driver);
		hp.selectDeparturCity("Boston");
		hp.selectDestinationCity("Buenos Aires");
		hp.submitButton();

	}
}
