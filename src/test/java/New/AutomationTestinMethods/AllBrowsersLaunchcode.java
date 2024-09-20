package New.AutomationTestinMethods;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowsersLaunchcode {

	public static void main(String[] args) throws InterruptedException {
	
		//ChromeBroswer
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.google.com/");
		
		Thread.sleep(1000);
		
		driver.quit();
		
		//FireFox Browser
		WebDriver driver1 = new FirefoxDriver();
		
		driver1.get("https://www.google.com/");
		
		Thread.sleep(1000);
		
		driver.quit();	
		
		//InternetExplorer Browser
		WebDriver driver2 = new InternetExplorerDriver();	
		
		driver2.get("https://www.google.com");
		
		Thread.sleep(1000);
		
		driver.quit();
		
}
}