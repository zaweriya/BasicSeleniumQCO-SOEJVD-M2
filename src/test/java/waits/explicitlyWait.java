package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitlyWait {

	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//wait for 10sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//load the url
		driver.get("http://localhost:8888/");
		
		//identify username in demo vTiger
		WebElement usernameEle = driver.findElement(By.name("user_name"));
		usernameEle.sendKeys("admin");
		
		//identify password in demo Vtiger
		WebElement passwordEle = driver.findElement(By.name("user_password"));
		passwordEle.sendKeys("admin");
		
		//click on loginbutton
		 driver.findElement(By.id("submitButton")).click();
		
		
		WebElement ele =driver.findElement(By.id("Organizations"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//wait until the element is visible
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		//wait until the element is clickable 
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Organizations")));//by locator
		wait.until(ExpectedConditions.elementToBeClickable(ele));//by webelement
		
		//wait until the home page title is visible
		wait.until(ExpectedConditions.titleContains("Home"));
		System.out.println("Title contains home");
		
	}	

}
