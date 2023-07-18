package framesAndPopUps;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadedPopUP {

	public static void main(String[] args) throws IOException {
		//launch the browser
		WebDriver driver =new ChromeDriver();
												
		//maximize the window
		driver.manage().window().maximize();
											
		// wait for 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
								
		//load the url
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");

		driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
				
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		
		//upload the file using autoIT
		Runtime.getRuntime().exec("C:\\Users\\abc\\Documents\\fileUpload.exe");
		
		System.out.println("File uploading complete");

		

	}

}
