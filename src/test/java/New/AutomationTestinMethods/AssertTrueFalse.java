
package New.AutomationTestinMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertTrueFalse {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();	
		
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
	Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
	Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());

	Assert.assertTrue(driver.findElements(By.cssSelector("input[type='checkbox']")).size()>0);
	
	
	
	
	}

}
