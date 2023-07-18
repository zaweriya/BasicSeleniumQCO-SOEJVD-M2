package dropDownSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassPractice {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
						
		//maximize the window
		driver.manage().window().maximize();
					
		//load the URL
		driver.get("https://demoqa.com/select-menu");
		
		//locate a drop down
		WebElement SingleSelectDropdown = driver.findElement(By.id("oldSelectMenu"));
		
		//to handle the drop down create object of select class
		Select sel = new Select(SingleSelectDropdown);
		
		//select option inside the drop down - using Index
		sel.selectByIndex(3);
		System.out.println("Index 3 is selected");
		
		//select option inside the drop down - using value="7"
		sel.selectByValue("7");
		System.out.println("Value 7 is selected");
		Thread.sleep(2000);
		
		//select option inside the drop down - using Visible Text
		sel.selectByVisibleText("Magenta");
		System.out.println("Visible text is selected");
		Thread.sleep(2000);
		
		//check if the drop down is multi-select drop down or single select drop down
		boolean status = sel.isMultiple();
		if(status==true)
		{
			System.out.println("Yes!! its a multi-select drop down");
		}
		else
		{
			System.out.println("Nope!! its a Single-select drop down");
		}
		
		//check all the
		List<WebElement> listOp = sel.getOptions();
		 int count=0;
		 for(WebElement ele:listOp)
		 {
			 count ++;
			 System.out.println(ele.getText());
		 }
		System.out.println(count);
	}

}
