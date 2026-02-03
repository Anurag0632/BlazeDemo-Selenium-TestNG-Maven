package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PurchasePage {

	protected WebDriver driver;

	@FindBy(id = "inputName")
	private WebElement name;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "state")
	private WebElement state;

	@FindBy(name = "zipCode")
	private WebElement zipcode;

	@FindBy(id = "cardType")
	private WebElement cardDD;

	@FindBy(id = "creditCardNumber")
	private WebElement cardNumber;

	@FindBy(id = "creditCardMonth")
	private WebElement ccMonth;

	@FindBy(id = "creditCardYear")
	private WebElement ccYear;

	@FindBy(id = "nameOnCard")
	private WebElement nameOnCard;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	public PurchasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void fillPersonalDetails(String Name, String Address, String City, String State, String ZipCode) {

		name.sendKeys(Name);
		address.sendKeys(Address);
		city.sendKeys(City);
		state.sendKeys(State);
		zipcode.sendKeys(ZipCode);

	}

	public void cardDetails(String text, String CardNumber, String month, String year, String nameoncard) {
		Select sc = new Select(cardDD);
		sc.selectByVisibleText(text);

		cardNumber.sendKeys(CardNumber);
		ccMonth.sendKeys(month);
		ccYear.sendKeys(year);
		nameOnCard.sendKeys(nameoncard);
	}

	public void submitButton() {
		submit.click();
	}

}
