package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOveringAction {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver =new ChromeDriver();
										
		//maximize the window
		driver.manage().window().maximize();
		
									
		//load the URL
		driver.get("https://flipkart.com");
 
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
			
		//mouse overing action
		WebElement element= driver.findElement(By.xpath("//div[.='Electronics']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
		System.out.println("mouse overing done");
		
}
}