package framesAndPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUP {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		 Thread.sleep(2000);
		 
		 //navigate to tasks
		 driver.findElement(By.id("container_tasks")).click();
		 
		 //check the check boxes
		 driver.findElement(By.xpath("(//div[@class='img'])[2]")).click();
		 
		 Thread.sleep(2000);
		 
		 //click on delete
		driver.findElement(By.xpath("(//div[.='Copy to'])[1]")).click();
		
		Thread.sleep(2000);
		
		//handle the hidden division pop up
		driver.findElement(By.xpath("(//div[.='Copy']/following-sibling::div[.='Cancel'])[3]")).click();	 

	}

}
