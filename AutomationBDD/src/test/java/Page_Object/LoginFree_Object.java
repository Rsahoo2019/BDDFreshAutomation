package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginFree_Object extends BaseClass{

	public LoginFree_Object(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='signup_form_1-UserFirstName']")
	public static WebElement firstname;
	
	@FindBy(how=How.XPATH, using="//input[@id='signup_form_1-UserLastName']")
	public static WebElement Lasttname;
	
	@FindBy(how=How.XPATH, using="//input[@id='signup_form_1-UserEmail']")
	public static WebElement email;
	
	@FindBy(how=How.XPATH, using="//input[@id='signup_form_1-UserTitle']")
	public static WebElement Jobtitle;
	
	@FindBy(how=How.XPATH, using="//input[@id='signup_form_1-UserPhone']")
	public static WebElement phone;
	
	@FindBy(how=How.XPATH, using="//input[@id='signup_form_1-CompanyName']")
	public static WebElement company;
	
	@FindBy(how=How.XPATH, using="//select[@id='signup_form_1-CompanyEmployees']")
	public static WebElement employees;
	
	
	@FindBy(how=How.XPATH, using="//select[@id='signup_form_1-CompanyCountry']")
	public static WebElement country;
	
	
	@FindBy(how=How.XPATH, using="//button[contains(@name,'start my free trial')]")
	public static WebElement startfreetrial;

}
