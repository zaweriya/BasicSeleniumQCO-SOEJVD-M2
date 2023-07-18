package WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods  {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver = new ChromeDriver();
		 
		//maximize the screen
		driver.manage().window().maximize();
		
		//get the url
		driver.get("https://demo.actitime.com/login.do");
		
		//enter value in textfield
		driver.findElement(By.className("textField")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(2000);
		
		//clear the details
		//driver.findElement(By.className("textField")).clear();
		
		//to perform click action
		//driver.findElement(By.id("loginButton")).click();
		
		//get attribute value
		String attribute = driver.findElement(By.id("loginButton")).getAttribute("align");
		System.out.println(attribute);
		
		//used to get tagname of that particular element
		String tagName = driver.findElement(By.id("loginButton")).getTagName();
		System.out.println(tagName);
		
		//used to get text of that particular element
		String text = driver.findElement(By.id("loginButton")).getText();
		System.out.println(text);
		
		//used to return position
		Point Position = driver.findElement(By.id("loginButton")).getLocation();
		int posX = Position.getX();
		System.out.println("position of x is"+posX);
		int posY = Position.getY();
		System.out.println("position of y is"+posY);
		
		//used to return dimension
		Dimension size = driver.findElement(By.id("loginButton")).getSize();
		int height = size.getHeight();
		System.out.println("height of the element is"+height);
		int width = size.getWidth();
		System.out.println("width of the element is"+width);
		
		//used to return both size and dimension
		Rectangle Rect = driver.findElement(By.id("loginButton")).getRect();
		int x=Rect.getX();
		System.out.println("pos of x in rect"+x);
		int y=Rect.getY();
		System.out.println("pos of y in rect"+y);
		int h = size.getHeight();
		System.out.println("height of the element in rect is"+h);
		int w = size.getWidth();
		System.out.println("width of the element in rect is"+w);
		
		//used to get css value
		String cssvalue = driver.findElement(By.id("loginButton")).getCssValue("display");
		System.out.println("the css value is"+ cssvalue);
		
		//used to get element design type
		String role = driver.findElement(By.id("loginButton")).getAriaRole();
		System.out.println("Aria role is"+role);
		
		//used to get element accesible name
		String accesibleName = driver.findElement(By.name("user_name")).getAccessibleName();
		System.out.println("Accesible name is"+accesibleName);
		
		//used to check element is displayed or not
		boolean displayed = driver.findElement(By.className("textfield")).isDisplayed();
		if (displayed==true)
		{
			driver.findElement(By.className("textfield")).sendKeys("admin");
			System.out.println("element is displayed");
		}
		else
		{
			System.out.println("element is not displayed");
		}
		
		//used to check element is enable or not
		boolean enable = driver.findElement(By.className("textfield")).isEnabled();
		if (enable==true)
		{
			driver.findElement(By.className("textfield")).clear();
			System.out.println("element is enable");
		}
		else
		{
			System.out.println("element is not enable");
		}
		
		//used to check element is selected or not
		boolean selected = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(selected==true)
		{
			System.out.println("element is selected");
		}
		else 
		{
			System.out.println("element is not selected");
		}
	}

}
