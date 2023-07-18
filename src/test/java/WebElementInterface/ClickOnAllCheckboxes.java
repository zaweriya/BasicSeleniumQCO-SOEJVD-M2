package WebElementInterface;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAllCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		//launch browser
		 WebDriver driver=new ChromeDriver();
		 
		 //maximize the scrn
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
		
		 //click on task
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		 
		//click on all check boxes
		 Thread.sleep(2000);
		 List<WebElement> list = driver.findElements(By.xpath("//div[@class='img']"));
		 for(WebElement ele:list)
		 {
			 ele.click();
			 Thread.sleep(2000);
		 }
		 
	}

}
