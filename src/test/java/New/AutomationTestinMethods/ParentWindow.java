//Instructor example
//Complete the Assignment and Post the code here

package New.AutomationTestinMethods;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentWindow {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get("http://the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Multiple Windows")).click();
	driver.findElement(By.cssSelector("a[href*='windows']")).click();
	
	Set<String> abc=driver.getWindowHandles();
	Iterator<String> it=abc.iterator();
	String parentWindow=it.next();
	driver.switchTo().window(it.next());
	
	System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
	driver.switchTo().window(parentWindow);
	System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

}

}



