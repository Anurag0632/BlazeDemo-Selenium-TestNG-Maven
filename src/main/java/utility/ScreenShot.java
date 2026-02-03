package utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentTest;

public class ScreenShot {
	public static void takeScreenShot(WebDriver driver, ExtentTest test) {

		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir") + "//ScreenShot//" + System.currentTimeMillis() + ".png";

		try {

			File dest = new File(path);
			FileHandler.copy(screenShot, dest);
			test.addScreenCaptureFromPath(path);
		} catch (Exception e) {

			System.out.println("ScreenShot failed : " + e.getMessage());

		}
	}

}
