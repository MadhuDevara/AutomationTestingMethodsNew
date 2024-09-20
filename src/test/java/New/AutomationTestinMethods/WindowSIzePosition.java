package New.AutomationTestinMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSIzePosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com");
	
    
	// Set the browser window size to 1024x768
	
	Dimension dimension = new Dimension(1000, 1000);
	
	driver.manage().window().setSize(dimension);
	
	driver.manage().window().fullscreen();
	
	
    // Set the browser window position to x=300, y=200
	
	Point position = new Point(300, 200);

	driver.manage().window().setPosition(position);

	driver.manage().window().fullscreen();

	Thread.sleep(2000);
	
	driver.quit();
	
	
		
	}

}
