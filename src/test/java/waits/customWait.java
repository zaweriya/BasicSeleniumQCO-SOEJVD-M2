package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class customWait {
	public static void main(String[] args) throws InterruptedException {
		
		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 3: Load the URL - Demo Vtiger App
		driver.get("http://localhost:8888");

		// Step 4: identify UserName in Demo Vtiger and provide the data
		driver.findElement(By.name("user_name")).sendKeys("admin");

		// Step 5: identify UserName in Demo Vtiger and provide the data
		driver.findElement(By.name("user_password")).sendKeys("manager");

		// Step 6: Click on Login Button
		WebElement element = driver.findElement(By.id("submitButton"));
		
		//Custom Wait
		waitAndClick(element);

	}

	public static void waitAndClick(WebElement element) throws InterruptedException {
		int count = 0;
		while (count < 10) // true true 10seconds
		{
			try {
				element.click(); // exception
				break;
			} catch (Exception e) {
				Thread.sleep(1000); // polling 1 sec
				count++; // 1 2
			}
		}
	}
}
