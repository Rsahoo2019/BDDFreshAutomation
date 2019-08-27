package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utility.SeleniumModule;

public class Login_Object extends BaseClass {
	
	public static WebDriver driver;

	public Login_Object(WebDriver driver) {
		super(driver);
	}
	
	
	public static void firstname()
	{
		
		SeleniumModule.element("//input[@id='username']");
		
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='username']")
	public static WebElement username;
	
	@FindBy(how=How.XPATH, using="//input[@id='password']")
	public static WebElement password;
	
	@FindBy(how=How.XPATH, using="//input[@id='Login']")
	public static WebElement login;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Remind Me Later')]")
	public static WebElement remindme_Later;
	
	@FindBy(how=How.XPATH, using="//a[@id='signup_link']")
	public static WebElement Tryforfree;
	
	@FindBy(how=How.XPATH, using="//div[@class='msaCheckbox checkboxInput section']//div//div[@class='checkbox-ui']")
	public static WebElement checkbox;
	
	@FindBy(how=How.XPATH, using="//button[@name='start my free trial']")
	public static WebElement startmyfreetrial;
	
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Sign up now to start your free sales trial.')]")
	public static WebElement firstname;
	//span[contains(text(),'Sign up now to start your free sales trial.')]

}
