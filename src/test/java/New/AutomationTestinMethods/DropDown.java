// SELECTING FROM AND TOO LOCATION AND SELECTING DATE

package New.AutomationTestinMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		
        // Open the dropdown practice page
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // Select the origin station (Bangalore - BLR)
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000); // Wait for the dropdown to update

        // Select the destination station (Chennai - MAA)
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();

        // Select the current date from the calendar (assuming it is highlighted)
        driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight')]")).click();

        // Select round trip option
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        // Check if the return date input is enabled
        boolean isReturnDateEnabled = driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
        System.out.println("Is return date enabled: " + isReturnDateEnabled);

        // Close the browser
        driver.quit();
		
	}

}

        
        /*
		 * driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //
		 * //a[@value='MAA'] - XAPTH FOR CHENNAI // //a[@value='BLR'] - XPATH FOR
		 * BANGLORE // for selecting required XPATH (//a[@value='MAA'] )[2]
		 * 
		 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).
		 * click(); driver.findElement(By.xpath("//a[@value='BLR']")).click();
		 * Thread.sleep(2000);
		 * 
		 * // driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); ( Example
		 * For // index)
		 * 
		 * // Parent child traverse relation ship xpath or element
		 * //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']
		 * //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']
		 * //a[@value='MAA']
		 * 
		 * driver.findElement(By.
		 * xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"
		 * )) .click();
		 * 
		 * driver.findElement(By.
		 * xpath("//a[contains(@class,'ui-state-default ui-state-highlight')]")).click()
		 * ;
		 * 
		 * driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']"))
		 * .click();
		 * driver.findElement(By.id("input[id='ctl00_mainContent_view_date2']")).
		 * isEnabled();
		 */
