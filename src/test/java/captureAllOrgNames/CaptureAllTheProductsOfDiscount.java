package captureAllOrgNames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllTheProductsOfDiscount {

	public static void main(String[] args) throws InterruptedException {
	
		//launch the browser
		WebDriver driver =new ChromeDriver();
						
		//maximize the window
		driver.manage().window().maximize();
					
		//load the url
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
								
		//click on todays deals
		driver.findElement(By.linkText("Today's Deals")).click();
		
		//capture all the 50% discounts
		List<WebElement> list = driver.findElements(By.xpath("//div[text()='Up to 50% off']"));
		for(WebElement ele:list)
		{
			Thread .sleep(2000);
			System.out.println(ele.getText());
		}

	}

}
