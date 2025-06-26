package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
 
	//PageFactory or Object Repository
   @FindBy(xpath="//span[text()='Admin']")
	WebElement adminLink;
   
   @FindBy(xpath="//span[text()='PIM']")
  	WebElement PIMLink;
   
   @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
 	WebElement PIMLinkOnAdd;
   
 //Inatializing the PageFactory or page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
		
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
