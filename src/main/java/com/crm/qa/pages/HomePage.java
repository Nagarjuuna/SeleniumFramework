package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
 
	//PageFactory or Object Repository
   @FindBy(xpath="//span[text()='Admin']")
   private WebElement adminLink;
   
   @FindBy(xpath="//span[text()='PIM']")
   private	WebElement PIMLink;
   
   @FindBy(xpath="//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--secondary']")
   private	WebElement PIMLinkOnAdd;
   
   @FindBy(xpath="//img[@alt='client brand banner']")
   private WebElement title;
   
 //Inatializing the PageFactory or page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	public String homepageTitle() throws InterruptedException {
		Thread.sleep(3000);
		return driver.getTitle(); //This line gets the title of the current page using Selenium’s WebDriver and sends it back wherever the method is called. but not stored 
		
	}
	public void ClickOnAdmin() throws InterruptedException {
		Thread.sleep(2000);
		adminLink.click();
		
	}
	public void ClickOnPim() throws InterruptedException {
		Thread.sleep(2000);
		PIMLink.click();
	}
	public void ClickOnPimAdd() throws InterruptedException {
		Thread.sleep(2000);
		PIMLinkOnAdd.click();
	}
	
}
