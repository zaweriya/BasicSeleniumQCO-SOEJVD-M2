package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUP {

	public static void main(String[] args) {
		
		//app URL- https://the-internet.herokuapp.com/basic_auth
		//app Authentication UN- admin
		//app Authentication Password- admin
		
		//https://admin:admin@the-internet.herokuapp.com/basic_auth
		
		 //launch the browser
		 WebDriver driver=new ChromeDriver();
		 
		 //maximize the screen
		 driver.manage().window().maximize();
		 
		 //wait for 10 seconds
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		 //load the app
		 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


	}

}
