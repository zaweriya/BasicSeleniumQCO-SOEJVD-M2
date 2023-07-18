package javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUntilElement {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver =new ChromeDriver();
										
		//maximize the window
		driver.manage().window().maximize();
									
		//load the URL
		driver.get("https://www.selenium.dev/downloads/");
		
		WebElement clickOn = driver.findElement(By.xpath("//img[@alt='BrowserStack']"));
		WebElement scrollUntil=driver.findElement(By.xpath("//h2[@class='selenium text-center']"));
		Thread.sleep(3000);
		
		//scroll until the element reference
		JavascriptExecutor js= (JavascriptExecutor) driver;
				
		js.executeScript("arguments[0].scrollIntoView();", scrollUntil);
		
		Thread.sleep(3000);
		clickOn.click();

	}

}
