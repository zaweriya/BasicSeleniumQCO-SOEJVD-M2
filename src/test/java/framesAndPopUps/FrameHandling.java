package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {
public static void main(String[] args)  {
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
						
		//maximize the window
		driver.manage().window().maximize();
					
		// wait for 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//load the url
		driver.get("https://jqueryui.com/droppable/");
		
		//handle to frame
		driver.switchTo().frame(0);
		System.out.println("switch the control to frame");
		
		//drag and drop
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		System.out.println("Drag and Drop Successful"); 
		
		//switch the control back to main page
		driver.switchTo().defaultContent();
		System.out.println("switched the control to main page");
		
		//click on accept link
		driver.findElement(By.linkText("Accept")).click();
		System.out.println("clicked on accept successful");
		
	}	
}
