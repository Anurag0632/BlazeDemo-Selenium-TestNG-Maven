package utility;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public static ExtentReports reports;

	public void reportSetUp() {

		ExtentSparkReporter spark = new ExtentSparkReporter(
				System.getProperty("user.dir") + "//Reports//BlazeDemo//" + System.currentTimeMillis() + "Extent.html");

		spark.config().setDocumentTitle("Project Report");
		spark.config().setReportName("BlazeDemo");
		spark.config().setTheme(Theme.DARK);
		spark.config().setTimeStampFormat("dd-MM-yyyyHH:mm:ss");

		reports = new ExtentReports();
		reports.attachReporter(spark);

		reports.setSystemInfo("Project Name", "Blaze Demo");
		reports.setSystemInfo("OS", "Windows");
		reports.setSystemInfo("OS Version", "11 25H2");
		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("Browser Version", "v144");
		reports.setSystemInfo("Tools Used", " Selenium , TestNG , Maven ");
		reports.setSystemInfo("Project Structure", "Page Object Model (Page Factory)");
		reports.setSystemInfo("SDET", "Anurag Maurya");

	}
}
