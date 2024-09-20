package New.AutomationTestinMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To set browser to accept the certificates
		FirefoxOptions options= new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		
		
		WebDriver driver = new FirefoxDriver(options);	
		
		driver.get("https://expired.badssl.com/");;
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
