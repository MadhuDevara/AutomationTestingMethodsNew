package ImportantCodes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActionMethods1 {

	
	@Test(priority=1)
	public static void main(String[] args) 
		{
	
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
			.click().sendKeys("One Plus").doubleClick().build().perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("nav-search-submit-button")).click();
		}

			
		
	@Test(priority=2)
	private static void softAssert() {
		// TODO Auto-generated method stub
		
		SoftAssert softAssertion = new SoftAssert();
		System.out.println("softAssert Method was started");
		
		softAssertion.assertTrue(true);
		
		System.out.println("softAssert Method Was executed");
		
		softAssertion.assertAll();
		
	}

}
