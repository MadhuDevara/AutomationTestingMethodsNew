
package New.AutomationTestinMethods;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class actionClassDemo {

	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	Actions a=new Actions(driver);
	WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
	
	// Adding methods and creating composite action
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
		.click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	
	//Move to specific element
	a.moveToElement(move).contextClick().build().perform();
	
	//Drag and Drop
	// driver will now get the capabilities of action class methods
	// We need to build entire action and it is ready to execute
	// perform is execution
	// Moves to specific element
	// below argument takes webElement and lets define in variable
	
	a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
	
		
	}

}
