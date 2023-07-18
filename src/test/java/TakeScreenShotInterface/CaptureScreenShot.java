package TakeScreenShotInterface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
				
		//maximize the window
		driver.manage().window().maximize();
				
		//load the url
		driver.get("http://localhost:8888/");
				
		//identify username in demo vTiger
		WebElement usernameEle = driver.findElement(By.name("user_name"));
		usernameEle.sendKeys("admin");
				
		//identify password in demo Vtiger
		WebElement passwordEle = driver.findElement(By.name("user_password"));
		passwordEle.sendKeys("admin");
				
		//click on loginbutton
		WebElement loginEle = driver.findElement(By.id("submitButton"));
		loginEle.click();
				
		System.out.println("Home page displayed");
	
		//take screen shot of home page
		
		//cast the TakesScreenshot interface to the driver
		TakesScreenshot ts=(TakesScreenshot) driver;
	
		//call get screen shot method
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//create a folder to store the screen shots
		File dstLocation = new File(".\\Screenshots\\Screenshot1.png");
		
		//copy the screenshot from src to dst
		Files.copy(src, dstLocation);
		
		System.out.println("screen shot taken");

	}
}