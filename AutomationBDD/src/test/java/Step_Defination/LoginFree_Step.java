package Step_Defination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page_Object.LoginFree_Object;
import Page_Object.Login_Object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumModule;


public class LoginFree_Step {
	public WebDriver driver;
	LoginFree_Object lgnob;
	@Given("^Login into the Salesforce Application$")
	public void login_into_the_Salesforce_Application() throws Throwable {
		driver= Hooks.driver; 
	}

	@When("^User click on Try for free button$")
	public void user_click_on_Try_for_free_button() throws Throwable {
		
		PageFactory.initElements(driver, Login_Object.class);
		PageFactory.initElements(driver, LoginFree_Object.class);
		
		Login_Object.Tryforfree.click();
		SeleniumModule.type(LoginFree_Object.firstname, "Rashmi");
		SeleniumModule.type(LoginFree_Object.Lasttname, "Sahoo");
		SeleniumModule.type(LoginFree_Object.email, "sahoo.rashmitaqa@gmail.com");
		SeleniumModule.type(LoginFree_Object.Jobtitle, "Test Engineer");
		SeleniumModule.type(LoginFree_Object.phone, "7757028800");
		SeleniumModule.type(LoginFree_Object.company, "CTS");
		SeleniumModule.selectDropValueByIndex(LoginFree_Object.employees, 1);
		SeleniumModule.selectDropValueByVisibleText(LoginFree_Object.country, "India");
		
		
	}

	@When("^User click on the check box$")
	public void user_click_on_the_check_box() throws Throwable {
	    Login_Object.checkbox.click();
	}

	@When("^user click on the Start my free trial$")
	public void user_click_on_the_Start_my_free_trial() throws Throwable {
		Login_Object.startmyfreetrial.click();
		SeleniumModule.waitForPageLoaded();
	    
	}

	@Then("^User login into the application$")
	public void user_login_into_the_application() throws Throwable {
	    
	}
	
	

}
