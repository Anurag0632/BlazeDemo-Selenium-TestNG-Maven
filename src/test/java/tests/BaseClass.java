package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.DriverInitialize;

public class BaseClass extends DriverInitialize {

	protected static WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setup() {
		driver = initializeDriver("Chrome");
		driver.get("https://blazedemo.com/");
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	public static WebDriver getDriver() {
		return driver;// this is a single global browser reference
						// it dose not open browser itself ..it only points to a browser once
						// initialized
	}

}
