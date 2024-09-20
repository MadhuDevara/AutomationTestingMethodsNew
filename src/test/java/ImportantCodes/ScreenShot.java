package ImportantCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShot {

    public static void main(String[] args) throws InterruptedException {

    	WebDriver driver = new ChromeDriver();

        try {
            // Navigate to a website
            driver.get("https://www.gmail.com");
            
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // Take the screenshot
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Specify the location to save the screenshot
            File destinationFile = new File("C:\\Users\\Madhu Devarakonda\\Pictures\\Screenshots\\sample001.png");

            // Copy the screenshot to the desired location
            FileHandler.copy(screenshot, destinationFile);

            System.out.println("Screenshot saved at: " + destinationFile.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("An error occurred while saving the screenshot: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
