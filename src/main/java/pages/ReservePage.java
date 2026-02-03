package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Waits;

public class ReservePage {

	protected WebDriver driver;
	private Waits wait;

	@FindBy(css = "[class$='btn-small']")
	private List<WebElement> chooseTheFlight;

	public ReservePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new Waits(driver);
		PageFactory.initElements(driver, this);
	}

	public void selectFlightButton() {
		wait.waitForClickability(chooseTheFlight.get(0));
		chooseTheFlight.get(0).click();
	}

}
