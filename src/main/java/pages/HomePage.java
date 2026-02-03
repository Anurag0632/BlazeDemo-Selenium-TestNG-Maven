package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Waits;

public class HomePage {

	protected WebDriver driver;
	private Waits wait;

	@FindBy(name = "fromPort")
	private WebElement departureCityDD;
	@FindBy(name ="toPort")
	private WebElement destinationCityDD;

	@FindBy(css = "input[type='submit']")
	private WebElement findFlightsButton;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		this.wait=new Waits(driver);
		PageFactory.initElements(driver, this);
	}

	public void selectDeparturCity(String city) {

		Select sc = new Select(departureCityDD);
		wait.waitForVisiblity(departureCityDD);
		sc.selectByValue(city);
	}

	public void selectDestinationCity(String city) {

		Select sc = new Select(destinationCityDD);
		sc.selectByValue(city);
	}

	public void submitButton() {

		findFlightsButton.click();

	}

}
