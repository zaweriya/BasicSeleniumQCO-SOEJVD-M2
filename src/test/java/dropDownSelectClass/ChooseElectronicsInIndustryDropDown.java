package dropDownSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChooseElectronicsInIndustryDropDown {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver =new ChromeDriver();
								
		//maximize the window
		driver.manage().window().maximize();
							
		//load the URL
		driver.get("http://localhost:8888/");
		
		//enter UN and pass
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		//click on login button
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();
		
		//click on organizations link
		driver.findElement(By.linkText("Organizations")).click();
		
		//capture img webelement to add an organization
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		//add mandatory details to create an organization
		driver.findElement(By.name("accountname")).sendKeys("Nanda");
		Thread.sleep(2000);
		
		//locate the drop down
		WebElement selectDropdown = driver.findElement(By.name("industry"));
		
		//craete an obj for select class
		Select obj=new Select(selectDropdown);
		
		//select an object using - value=" "
		obj.selectByValue("Electronics");
		System.out.println("Value is selected");
		
		//click on save button
		driver.findElement(By.name("button")).click();
		driver.findElement(By.className("crmbutton small save")).click();
		
		

	}

}
