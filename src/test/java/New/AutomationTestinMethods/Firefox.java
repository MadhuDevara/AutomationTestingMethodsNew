//CODE WORKING

package New.AutomationTestinMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.youtube.com/");

	}
}
