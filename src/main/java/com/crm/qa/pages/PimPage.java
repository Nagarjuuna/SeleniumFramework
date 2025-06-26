package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class PimPage extends TestBase {
	
	 @FindBy(xpath="//input[@name='firstName']")
	   WebElement firstName;
	 
	 @FindBy(xpath="//input[@name='middleName']")
	   WebElement middleName;
	 
	 @FindBy(xpath="//input[@name='lastName']")
	   WebElement lastName;
	 
	 @FindBy(xpath="//button[@type='submit']")
	   WebElement saveButton;
	 
	 public PimPage() {
		 PageFactory.initElements(driver, this);
		 
	 }
	 public void firstName(String fn,String mn , String ln) {
		 firstName.sendKeys(fn); // why we wre not passing input in sendkeys means we need to change data for i give sendKeys("pavan") it always take pavan it never change so we write like this 
		 middleName.sendKeys(mn);// why we wre not passing input in sendkeys means we need to change data for i give sendKeys("pavan") it always take pavan it never change so we write like this
		 lastName.sendKeys(ln);// why we wre not passing input in sendkeys means we need to change data for i give sendKeys("pavan") it always take pavan it never change so we write like this
		
	 }
	 public void saveButton() {
		 saveButton.click();
	 }

}
  