package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
								
		//maximize the window
		driver.manage().window().maximize();
							
		//load the URL
		driver.get("https://demoapp.skillrary.com/product.php?product=java");

		WebElement add=driver.findElement(By.id("add"));
		
		WebElement minus=driver.findElement(By.id("minus"));
		
		//double click action
		Actions act= new Actions(driver);
		
		act.doubleClick(add).perform();
		System.out.println("item added");
		
		Thread.sleep(2000);
		act.doubleClick(minus).perform();
		
		System.out.println("item removed");
		
	}

}
