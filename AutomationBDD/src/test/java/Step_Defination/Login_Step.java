package Step_Defination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page_Object.Login_Object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login_Step {
	public WebDriver driver;
	@Given("^Login into the Sales force Application$")
	public void login_into_the_Sales_force_Application() throws Throwable {
		driver= Hooks.driver;
		
	}

	
	@When("^NewUser passes value for Username as \"(.*?)\" and password as \"(.*?)\"$")
	public void newuser_passes_value_for_Username_as_and_password_as(String username, String password) throws Throwable {
		//Important
		PageFactory.initElements(driver, Login_Object.class);
		Login_Object.username.sendKeys(username);
		
		Login_Object.password.sendKeys(password);
		
		
		
		//Assertion
	}

	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
      Login_Object.login.click();
     /* Login_Object.remindme_Later.click();*/
	    Thread.sleep(30000);
		
	}
	
	
}
