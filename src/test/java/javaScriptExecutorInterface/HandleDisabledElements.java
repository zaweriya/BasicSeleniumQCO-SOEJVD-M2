package javaScriptExecutorInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledElements {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
								
		//maximize the window
		driver.manage().window().maximize();
							
		// wait for 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//load the url
		driver.get("https://demoapp.skillrary.com/");

		//identify the disabled elements
		WebElement disabledTextfield = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		//enter data into disabled textfield using js executor
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].value='QSPIDERS'", disabledTextfield);
		//js.executeScript("arguments[0].click()", disabledTextfield);
		
		
		
		
	}

}
