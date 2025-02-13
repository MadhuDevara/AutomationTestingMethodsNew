
package New.AutomationTestinMethods; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GetUrl {
	
	ExtentReports extent;
	
	@BeforeTest
	public void testing() 
	{ 
		String path = System.getProperty("user.dir")+"\\reports\\index1.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Testing Url Test");
		reporter.config().setDocumentTitle("Url Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Maddy");
	}
	
	@Test
	public void main() 
	{
		ExtentTest test = extent.createTest("main");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		extent.flush();
	}
}
