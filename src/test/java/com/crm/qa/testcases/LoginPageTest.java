package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {
		super(); // this calls the constructor of TestBase, which loads properties
	}
	@BeforeMethod
	public void setUpandCallLoginMethod() {
		initialization();  //THIS calls the method from TestBase class
		 loginpage = new LoginPage();  // object create coz we are calling loginPage we this is non static so create object and call
	} 
	// actual testing ,means sending real data 
	@Test()
	public void loginTest() throws InterruptedException {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		// my self written
		 //loginpage.login(prop.getProperty("username"), prop.getProperty("password")); // this line becomes: loginpage.login("admin", "admin123");

		//  here first username and password comes property file 
		 // here this username data Admin and password data admin123 goes into login method and pass this
		// data which we given parameters arguments
		// then it will call login methods and it will enter username and passward
	}
	@AfterMethod 
	public void tearDown() {
		driver.quit();
	}
}
