package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//PageFactory or Object Repository
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement userdatastored;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passworddatastoredinelements;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbutton; 
	
	//Inatializing the PageFactory or page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this); // Use this browser to find things on the web page."
		                                        //this all current variables will be initilize driver so previously driver.findelement by.xpath now we are declare this keyword 
		                                       // this Refers to the current class (LoginPage) where all the @FindBy variables are.
	} 
	//  Creating the login() Method to Perform Action here we are doing thsing like clcikc pass the data till above we created locators we did't do anthing 
	public HomePage login(String usd,String pwdd) throws InterruptedException { //they are just String variables that hold the actual input values, like: und = "Admin" pwdd = "Test@"
		Thread.sleep(3000);
		userdatastored.sendKeys(usd);// now elemnet stored userdatastored sending to real data which is stored in und
		 Thread.sleep(1000);
		passworddatastoredinelements.sendKeys(pwdd);// now the elemnet stored passworddatastoredinelements sending to real data which is stored in pwdd
		Thread.sleep(1000);
		loginbutton.click();
		return new HomePage(); //“I'm no longer on the Login Page. I’ve moved! Please give me access to the new page (HomePage) tools.” New keyword Make a fresh object
    
   // myself written
    
    /*public void login(String und,String pwdd) { //they are just String variables that hold the actual input values, like: und = "Admin" pwdd = "admin123"

		userdatastored.sendKeys(und); // now elemnet stored userdatastored sending to real data which is stored in und
		passworddatastoredinelements.sendKeys(pwdd); // now the elemnet stored passworddatastoredinelements sending to real data which is stored in pwdd
		loginbutton.click();*/	 
	}
	
}


	
	
