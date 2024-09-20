// window activities back and forward

package New.AutomationTestinMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserActivities {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		// navigating to another webcite
		// in get it has inbuilt wait mechanism
		driver.navigate().to("https://rahulshettyacademy.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().forward();

	}

}
