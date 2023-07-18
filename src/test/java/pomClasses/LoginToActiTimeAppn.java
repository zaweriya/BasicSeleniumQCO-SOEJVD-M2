package pomClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActiTimeAppn {

	public static void main(String[] args) throws IOException {
		
		//launch the browser
		 WebDriver driver=new ChromeDriver();
		 
		 //maximize the screen
		 driver.manage().window().maximize();
		 
		 //implicitly wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //load the url
		 driver.get("https://demo.actitime.com/login.do");
		 
//		 //identify username
//		 WebElement UsernameEle = driver.findElement(By.className("textField"));
//		 UsernameEle.sendKeys("admin");
		 
//		 //identify password
//		 WebElement passwordEle = driver.findElement(By.name("pwd"));
//		 passwordEle.sendKeys("manager");
		 
//		 //identify click button
//		 driver.findElement(By.id("loginButton")).click();
		 
		 //read username and password from property file
		 FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties p=new Properties();
		p.load(fis);
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		 
		 
		 //Login to app using POM class
		 //create an object for that POM class
		 LoginPage lp=new LoginPage(driver);
		 //lp.getUserNameEdt().sendKeys("admin");
		 //lp.getPwdEdt().sendKeys("manager");
		// lp.getLoginLnk().click();
		 
		 //lp.getUserNameEdt().sendKeys(USERNAME);
		 //lp.getPwdEdt().sendKeys(PASSWORD);
		 //lp.getLoginLnk().click();
		 
		 lp.LoginToApp(USERNAME, PASSWORD);
		 
		 System.err.println("Login Successfully");
		 
	}

}
