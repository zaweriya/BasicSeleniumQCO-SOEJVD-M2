package javaScriptExecutorInterface;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollActions {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
								
		//maximize the window
		driver.manage().window().maximize();
							
		//load the URL
		driver.get("https://www.selenium.dev/downloads/");
				
		//scroll down action
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1000);", "");
		Thread.sleep(3000);
		
		//scroll up action
		js.executeScript("window.scrollBy(0,-1000);", "");
		Thread.sleep(3000);
		
		//scroll right action
		js.executeScript("window.scrollBy(200,0);", "");
		Thread.sleep(3000);
				
		//scroll left action
		js.executeScript("window.scrollBy(-200,0);", "");
		Thread.sleep(3000);
				
		//scroll until bottom of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);", "");
		
		
	}

}
