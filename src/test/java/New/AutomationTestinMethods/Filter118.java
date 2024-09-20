
//120 Filter the webTable

package New.AutomationTestinMethods;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;

public class Filter118 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		
		//5 Results
		 List<WebElement> filteredList = veggies.stream().filter(veggie -> veggie.getText().contains("Rice"))
	                .collect(Collectors.toList());
		
	    //List<WebElement>filteredList, veggies.stream().filter(veggie->veggie.getText().contains("Rice")).
		//collect(Collectors.toList());
		
		//1RESULTS 
		Assert.assertEquals(veggies.size(),filteredList.size());
				
	}

}
