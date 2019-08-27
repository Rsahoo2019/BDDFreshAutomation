package utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Object.BaseClass;


public class SeleniumModule extends BaseClass{

	public SeleniumModule(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	

	
	
	public static void waitForElement(WebElement elementname)
	{   WebElement elm=  elementname; 
		WebDriverWait wait= new WebDriverWait(driver,30);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(elementname));
		
	}
	
	
	public static void waitForPageLoaded()
	{
		
		ExpectedCondition<Boolean> expectation= new ExpectedCondition<Boolean>()
		{

			@Override
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor)driver).executeScript("return document .readyState").toString().equals("complete"); 
						
			}
			
			
		};
		
		try{
			Thread.sleep(1000);
			WebDriverWait wait= new WebDriverWait(driver,30);
			 wait.until(expectation);
					}catch(Throwable error)
		{
		
	}
	
	
}
	
	public static void gettext(WebElement elementname,String expectedText)
	{
		WebElement elmn= elementname;
		
		String getTextValue= elmn.getText();
		
		
		
	}
	
	public  static WebElement  element(String locator)
	{
		WebElement ele= null;
		try{
	   driver.findElement(By.xpath(locator));
		
		} catch(Exception e)
		{
			
			e.printStackTrace();
		}
		return ele;
	}
	

	/**
	 * Locating the elements using the give locator
	 * 
	 * @param by
	 * @return
	 */
	
	/**
	 * Enter text in text box
	 * 
	 * @param by
	 * @param inputText
	 */
	public static void type( WebElement element,String inputtext) {

		

		element.clear();
		element.sendKeys(inputtext);

	}
	
	
	public static void selectDropValueByIndex(WebElement element, int index)
	{
		
		
		if(element.isDisplayed())
		{
			Select  select =new Select(element);
			select.selectByIndex(index);
			
			
			
		}	
		
		
		
		
	}

	public static void selectDropValueByVisibleText(WebElement element, String inputtext)
	{
		
		if(element.isDisplayed())
		{
			Select  select =new Select(element);
			select.selectByVisibleText(inputtext);
			
			
			
		}	
	}
	
}

