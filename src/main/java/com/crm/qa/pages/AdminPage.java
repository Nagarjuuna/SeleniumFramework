package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AdminPage extends TestBase{
	 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button/i")
	 private  WebElement createUser;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")
	 private  WebElement clickOnCreateUser;
	 
	 @FindBy(xpath="//div[@class='oxd-select-dropdown --positon-bottom']//div/span[text()='Admin']")
	 private  WebElement clickOnCreateUserAdmin;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")
	 private  WebElement clickOnCreateUserEnable;
	 
	 @FindBy(xpath="//div[@class='oxd-select-dropdown --positon-bottom']//div/span[text()='Enabled']")
	 private  WebElement clickOnCreateUserAdminStatus;
	 
	 
	 public AdminPage() {
		 PageFactory.initElements(driver, this);
		 
	 }
	 public void clickOnAdd() {
		 createUser.click();
	 }
	  public void createOnUser() {
		  clickOnCreateUser.click();
	
	  }
	  public void clickonNewAdmin() {
		  clickOnCreateUserAdmin.click();
	  }
	  public void clickonNewAdminEnable() {
		  clickOnCreateUserEnable.click();
	
	  }
	  public void clickonNewAdminEnableStatus() {
		  clickOnCreateUserAdminStatus.click();
  
	  }
	  
}
