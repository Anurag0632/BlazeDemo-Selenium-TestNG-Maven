package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	protected WebDriver driver;
	protected WebDriverWait Wait;

	public Waits(WebDriver driver) {
		this.driver = driver;
		this.Wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	public void waitForClickability(WebElement element) {
		Wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitForUrlContains(String text) {
		Wait.until(ExpectedConditions.urlContains(text));
	}

	public void waitForVisiblity(WebElement element) {
		Wait.until(ExpectedConditions.visibilityOf(element));

	}

}
