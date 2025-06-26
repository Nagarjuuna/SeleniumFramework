package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	 HomePage homepage;
	 public HomePageTest() {
		 super(); 
	 }
	 @BeforeMethod
	 public void callUp() throws InterruptedException {
		 initialization(); // browser will be launched 
		 loginpage= new LoginPage();  // login to the appliacation
		 homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));   // login to the appliacation
		   homepage= new HomePage();                                                                                       //You need to log in before you can go to the HomePage.
		                                 //After you log in, you are no longer on the login screen — you're on the HomePage. so need variable to store 
		            // why written Hompage means 
	 }
	 @Test(priority=1)
		public void AdminOnClickTest() throws InterruptedException {
		 homepage.ClickOnAdmin();
	 }	
	 @AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }
}
