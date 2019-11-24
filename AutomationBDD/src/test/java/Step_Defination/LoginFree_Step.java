package Step_Defination;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page_Object.LoginFree_Object;
import Page_Object.Login_Object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelpers;
import utility.SeleniumModule;


public class LoginFree_Step {
	public WebDriver driver;
	public List<HashMap<String,String>> datamap;
	
	LoginFree_Object lgnob;
	@Given("^Login into the Salesforce Application$")
	public void login_into_the_Salesforce_Application() throws Throwable {
		driver= Hooks.driver;
		datamap = DataHelpers.data(System.getProperty("user.dir")+"/src/main/resources/Test_DataSheet.xlsx","DataSheet1");
		
		
		
		  
	}
	
	@When("^User passes value with excel row \"(.*?)\" dataset$")
	public void user_passes_value_with_excel_row_dataset(String arg1) throws Throwable {
	     
		int index=Integer.parseInt(arg1)-1;
		
		
		
		PageFactory.initElements(driver, Login_Object.class);
		PageFactory.initElements(driver, LoginFree_Object.class);
		
		
		
		
		
		Login_Object.Tryforfree.click();
		SeleniumModule.waitForPageLoaded();
		SeleniumModule.type(LoginFree_Object.firstname, datamap.get(index).get("FirstName"));
		SeleniumModule.type(LoginFree_Object.Lasttname,datamap.get(index).get("LastName") );
		SeleniumModule.type(LoginFree_Object.email, datamap.get(index).get("Email"));
		SeleniumModule.type(LoginFree_Object.Jobtitle, datamap.get(index).get("JobTitle"));
		SeleniumModule.type(LoginFree_Object.phone, datamap.get(index).get("Phone"));
		SeleniumModule.type(LoginFree_Object.company, datamap.get(index).get("Company"));
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
		Thread.sleep(2000);
	    
	}

	@Then("^User login into the application$")
	public void user_login_into_the_application() throws Throwable {
	    
	}
	
	

}
