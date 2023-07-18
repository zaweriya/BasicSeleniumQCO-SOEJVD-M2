package pomClasses;
/**
 * This is a pom class for login page of actiTime appn
 * @author abc
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {//Rule 1: Create a separate pom class for every web page
	
	//Rule 2: Identify the webElements of this page using @findBy,@findBys,@findAll annotations
	@FindBy(id="username")
	private WebElement userNameEdt;//Edt-> Edit which means its textfield 
	
	@FindBy(name="pwd")
	private WebElement pwdEdt;
	
	@FindBy(id="loginButton")
	private WebElement loginLnk; //lnk->which means its Link 
	
	//Rule 3: create a constructor
	public LoginPage(WebDriver driver )
	{
		PageFactory.initElements(driver, this); //current driver reference
	}

	
	//Rule 4: Provide getterrs to access these webelements
	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPwdEdt() {
		return pwdEdt;
	}
	
	public WebElement getLoginLnk() {
		return loginLnk;
	}
	
	/**
	 * 
	 * @param USERNAME
	 * @param PASSWORD
	 */
	//business library-> it is method created using the elements related to this page only
	public void LoginToApp(String USERNAME, String PASSWORD)
	{
		userNameEdt.sendKeys(USERNAME);
		pwdEdt.sendKeys(PASSWORD);
		loginLnk.click();
		
	}


}
