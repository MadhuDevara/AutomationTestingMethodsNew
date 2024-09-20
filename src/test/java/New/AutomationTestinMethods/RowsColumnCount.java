/*
1.Code to count no of rows and columns
2.Step by step flow from Html code
*/
package New.AutomationTestinMethods;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class RowsColumnCount {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
		//tr represents row and th for columns
		
		WebElement table = driver.findElement(By.id("product"));
		
		System.out.println(table.findElements(By.tagName("tr")).size());
		
		System.out.println(table.findElements(By.tagName("tr"))
				.get(0).findElements(By.tagName("th")).size());
		
		List<WebElement> secondrow=table.findElements(By.tagName("tr"))
				.get(2).findElements(By.tagName("td"));
		
		System.out.println(secondrow.get(0).getText());
		
		System.out.println(secondrow.get(1).getText());
		
		System.out.println(secondrow.get(2).getText());
	

	}

}
