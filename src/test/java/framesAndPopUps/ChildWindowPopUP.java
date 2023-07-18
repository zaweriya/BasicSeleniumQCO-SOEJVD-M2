package framesAndPopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUP {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
								
		//maximize the window
		driver.manage().window().maximize();
							
		// wait for 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//load the url
		driver.get("https://demo.automationtesting.in/Windows.html");

		String mainID = driver.getWindowHandle();
		
		System.out.println("main window ID is- " +mainID);
		
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Thread.sleep(2000);
		
		Set<String> windows = driver.getWindowHandles();
		//for(String win:windows)
		//{
			//if(!win.equals(mainID))
			//{
				//System.out.println("This is the child id - "+win);
				//break;
			//}
		//}	
		
		
		for(String win:windows)
		{
			WebDriver currentWindowID = driver.switchTo().window(win);
			String currentTitle = currentWindowID.getTitle();
			if(currentTitle.contains("Selenium"))
			{
				System.out.println(currentTitle);
				break;
			}
		}
		Thread.sleep(2000);
		System.out.println("control is switched to child window");
			
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		Thread.sleep(2000);
		
		for(String win:windows)
		{
			WebDriver currentWindowID = driver.switchTo().window(win);
			String currentTitle = currentWindowID.getTitle();
			if(currentTitle.contains("Frames"))
			{
				System.out.println(currentTitle);
				break;
			}
		}
		
		Thread.sleep(2000);
		System.out.println("control is switch to parent window");
		
		driver.findElement(By.linkText("Register")).click();
		
		
		
		
		
	}

}
