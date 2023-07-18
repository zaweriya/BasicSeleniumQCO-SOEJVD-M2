package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//to launch chromedriver
		//ChromeDriver driver =new ChromeDriver();
		//	System.out.print("Chrome is launched");
		
		//upcast the chromedriver to webdriver interface
		WebDriver driver2 =new ChromeDriver();
		
		//to launch the url
		driver2.get("https://www.youtube.com/");
		
		//to launch the page title
		String demo = driver2.getTitle();
		System.out.print("The title is-->"+ demo);
		
		//to launch the currenturl
		String demo2 = driver2.getCurrentUrl();
		System.out.print("The current URL is-->"+ demo2);
		
		String demo3 = driver2.getPageSource();
		System.out.println("the page source is -->"+ demo3);
		
		String demo4 = driver2.getWindowHandle();
		System.out.println("the window id is-->"+ demo4);
		
		//Thread.sleep(2000);
		//driver2.close();
		//driver2.quit();
		
		driver2.manage().window().maximize();
		
		
		
		
		
	}

}
