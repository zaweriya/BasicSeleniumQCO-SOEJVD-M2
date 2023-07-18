package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToApp {

	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//load the url
		driver.get("http://localhost:8888/");
		
		//identify username in demo vTiger
		WebElement usernameEle = driver.findElement(By.name("user_name"));
		//perform action on the web element identified
		usernameEle.sendKeys("admin");
		
		//identify password in demo Vtiger
		WebElement passwordEle = driver.findElement(By.name("user_password"));
		//perform action on the web element identified
		passwordEle.sendKeys("admin");
		
		//click on loginbutton
		WebElement loginEle = driver.findElement(By.id("submitButton"));
		//perform action on the web element identified
		loginEle.click();
		
		//click on organizations links 
		driver.findElement(By.linkText("Contacts")).click();

		//driver.findElement(By.partialLinkText("Contacts")).click();
	}

}
