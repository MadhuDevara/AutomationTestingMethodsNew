package New.AutomationTestinMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
	
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.amazon.in/");
		
	   Actions a=new Actions(driver);
	   WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		// Adding methods and creating composite action
	   a.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
			.click().keyDown(Keys.SHIFT).sendKeys("One Plus").doubleClick().build().perform();
		
		//Move to specific element
	   a.moveToElement(move).contextClick().build().perform();
	   

	   driver.findElement(By.id("nav-search-submit-button")).click();
			/* 
		 * driver.findElement(By.id("a-autoid-1-announce")).click();
		 */

	}

}
