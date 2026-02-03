package listners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import tests.BaseClass;
import utility.ExtentReport;
import utility.ScreenShot;

public class TestListner implements ITestListener {

	private static ExtentTest test;
	private ExtentReports reports;
	private WebDriver driver;

	@Override

	public void onStart(ITestContext context) {
		ExtentReport extent = new ExtentReport();
		extent.reportSetUp();
		reports = ExtentReport.reports;
	}

	@Override
	public void onTestStart(ITestResult result) {
		test = reports.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));

	}

	@Override
	public void onTestFailure(ITestResult result) {
		driver = BaseClass.getDriver();
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
		test.fail(result.getThrowable());
		ScreenShot.takeScreenShot(driver, test);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.ORANGE));

	}

	@Override
	public void onFinish(ITestContext context) {

		reports.flush();
	}

}
