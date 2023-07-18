package waits;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
						
		//maximize the window
		driver.manage().window().maximize();
					
		// wait for 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//load the url
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
						
		//search for the element
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("boult earbuds");
				
		//click on search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//capture all the boult earbuds names
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for(WebElement ele:list)
		{
		Thread .sleep(2000);
		System.out.println(ele.getText());
		}
				
				



	}

}
