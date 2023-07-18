package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActitime {

	public static void main(String[] args) {
		//launch the browser
		 WebDriver driver=new ChromeDriver();
		 
		 //maximize the screen
		 driver.manage().window().maximize();
		 
		 //load the url
		 driver.get("https://demo.actitime.com/login.do");
		 
		 //identify username
		 WebElement UsernameEle = driver.findElement(By.className("textField"));
		 UsernameEle.sendKeys("admin");
		 
		 //identify password
		 WebElement passwordEle = driver.findElement(By.name("pwd"));
		 passwordEle.sendKeys("manager");
		 
		 //identify click button
		 driver.findElement(By.id("loginButton")).click();
		 
		 //click on organization links
		 driver.findElement(By.className("item")).click();
	}

}
