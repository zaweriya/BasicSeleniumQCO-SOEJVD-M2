package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPOPups {
		
		public static void main(String[] args) throws InterruptedException {
			
			//launch the browser
			WebDriver driver =new ChromeDriver();
							
			//maximize the window
			driver.manage().window().maximize();
						
			// wait for 10 sec
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//load the url
			driver.get("https://demoqa.com/alerts");
		
			//handle alert pop up -OK button - click ok
			driver.findElement(By.id("alertButton")).click();
			
			Thread.sleep(2000);
			Alert alert= driver.switchTo().alert();
			
			alert.accept();
			System.out.println("click ok on alert popUP");
			Thread.sleep(2000);
			
			//get text from alert popUP
			driver.findElement(By.id("alertButton")).click();
			
			Thread.sleep(2000);
			Alert alert1=driver.switchTo().alert();
			String text = alert1.getText();
			System.out.println(text);
			alert1.accept();
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,200)", "");
			Thread.sleep(2000);
			
			//dismiss the confirmation popUP
			driver.findElement(By.id("confirmButton")).click();
			Thread.sleep(2000);
			
			driver.switchTo().alert().accept();
			
			String successMsg = driver.findElement(By.xpath("//span[@class='text-success']")).getText();
			System.out.println(successMsg);
			
			//enter data into prompt popUP
			driver.findElement(By.id("promtButton")).click();
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			al.sendKeys("Jojo");
			al.accept();
			
			
	}

}
