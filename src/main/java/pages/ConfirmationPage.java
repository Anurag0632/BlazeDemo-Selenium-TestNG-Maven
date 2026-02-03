package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Waits;

public class ConfirmationPage {
	
	protected WebDriver driver;
	private Waits wait;
	
	@FindBy (xpath="//h1")
	protected WebElement confirmationMsg;
	
	public ConfirmationPage(WebDriver driver) {
		this.driver=driver;
		this.wait=new Waits(driver);
		PageFactory.initElements(driver, this);
	}
	public String url() {
		wait.waitForUrlContains("confirmation");
		return driver.getCurrentUrl();
	}
	
	public String statusMessage() {
		 return confirmationMsg.getText();
		
	}

}
