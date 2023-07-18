package waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fluentWait {


	public fluentWait(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//load the url
		driver.get("http://localhost:8888/");
		
		//identify username in demo vTiger
		WebElement usernameEle = driver.findElement(By.name("user_name"));
		//perform action on the web element identified
		usernameEle.sendKeys("admin");
		
		//identify password in demo Vtiger
		WebElement passwordEle = driver.findElement(By.name("user_password"));
		//perform action on the web element identified
		passwordEle.sendKeys("admin");
		
		//click on loginbutton
		 driver.findElement(By.id("submitButton")).click();

		//fluent wait
		fluentWait wait =new fluentWait(driver);
		wait.pollingEvery(Duration.ofMillis(200));
		wait.withTimeout(Duration.ofSeconds(5));
		wait.ignoring1(NoAlertPresentException.class);
		wait.ignoring(NoSuchElementException.class);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

	private void ignoring1(Class<NoAlertPresentException> class1) {
		// TODO Auto-generated method stub
		
	}


	private void withTimeout(Duration ofSeconds) {
		// TODO Auto-generated method stub
		
	}

	private void ignoring(Class<NoSuchElementException> class1) {
		// TODO Auto-generated method stub
		
	}

	private void pollingEvery(Duration ofMillis) {
		// TODO Auto-generated method stub
	}
}
	
