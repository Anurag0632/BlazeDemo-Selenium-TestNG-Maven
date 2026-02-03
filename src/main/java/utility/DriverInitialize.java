package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverInitialize {

	protected WebDriver driver;
	public String browserName;

	public WebDriver initializeDriver(String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {

			driver = new EdgeDriver();

		} else if (browserName.equalsIgnoreCase("Safari")) {

			driver = new SafariDriver();
		}

		else {
			throw new RuntimeException("invalid browser" + browserName);

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		return driver;

	}

	public void closeDriver() {
		if (driver != null) {
			driver.quit();
		}
	}

}
