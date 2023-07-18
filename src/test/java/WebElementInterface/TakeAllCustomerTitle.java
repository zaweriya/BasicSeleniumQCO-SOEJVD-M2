package WebElementInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Sleeper;

public class TakeAllCustomerTitle {

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
		 
		 //take all customer title
		 Thread.sleep(2000);
		 List<WebElement> list = driver.findElements(By.xpath("//div[@class='customerTitle'][1]"));
		for(WebElement ele:list)
		{
			String text = ele.getText();
			Thread.sleep(2000);
			System.out.println(text);
		}
	}

}
