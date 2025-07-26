package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//PageFactory or Object Repository
	@FindBy(xpath = "//input[@placeholder='Username']")
	 private WebElement userdatastored;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	 private WebElement passworddatastoredinelements;
	
	@FindBy(xpath = "//button[@type='submit']")
	 private WebElement loginbutton; 
	
	@FindBy(xpath="//img[@alt='company-branding']")
	 private WebElement orangeLogo;
	
	//Inatializing the PageFactory or page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this); // Use this browser to find things on the web page."
		                                        //this all current variables will be initilize driver so previously driver.findelement by.xpath now we are declare this keyword 
		                                       // this keyword Refers to the current class (LoginPage) where all the @FindBy variables are.
	} 
	public String verifyLogo() {
		return driver.getTitle();
	}
	//  Creating the login() Method to Perform Action here we are doing things like click pass the data till above we created locators we did't do anthing 
	public HomePage login(String usd,String pwdd) throws InterruptedException { //usd pwdd is temporarily variables that hold the real input data after passing in login test class, like: und = "Admin" pwdd = "Test@"
		Thread.sleep(3000); // the real input comes from properties file
		userdatastored.sendKeys(usd);// now elemnet stored userdatastored sending to real data which is stored in und
		Thread.sleep(3000);
		passworddatastoredinelements.sendKeys(pwdd);// now the elemnet stored passworddatastoredinelements sending to real data which is stored in pwdd
		Thread.sleep(3000);
		loginbutton.click();
		return new HomePage(); //“I'm no longer on the Login Page. I’ve moved! Please give me access to the new page (HomePage) tools.” New keyword Make a fresh object
         //  If your test class needs to use HomePage methods, like do some actions then YES write return new HomePage();
		// any name u give Homeopage or any any but it should match mathod name and return name
		// Use new keyword to create a new object of the page you want to work with next. So I need a fresh object of that page’s class to work with its elements and methods.
		 
	}
	
}


	
	
