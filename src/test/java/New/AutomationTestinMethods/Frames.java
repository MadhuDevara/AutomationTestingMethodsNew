package New.AutomationTestinMethods;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
	
			
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_top']")));
		
		Thread.sleep(2000);
						
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
			
		
		
	}

}
