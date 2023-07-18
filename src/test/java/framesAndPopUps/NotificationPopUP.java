package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUP {

	public static void main(String[] args) {
		
		//browser settings
		 ChromeOptions op = new ChromeOptions();
		 op.addArguments("--disable-notifications");
		 
		 //launch the browser
		 WebDriver driver=new ChromeDriver(op);
		 
		 //maximize the screen
		 driver.manage().window().maximize();
		 
		 //wait for 10 seconds
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		 //load the app
		 driver.get("https://yatra.com");
	}

}
