package New.AutomationTestinMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("madhu");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("madhu@gmail.com");
	driver.findElement(By.id("exampleInputPassword1")).sendKeys("Madhu");
	
	driver.findElement(By.id("exampleCheck1")).click();
	
	WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
	Select dropdown = new Select(staticdropdown);
	dropdown.selectByVisibleText("Male");
	
	driver.findElement(By.id("inlineRadio1")).click();
	
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	
	System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
	
	
	
	
	
	
	}

}
