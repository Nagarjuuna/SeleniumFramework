package com.crm.qa.testcases;
import org.testng.Assert;
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
		initialization();  //THIS calls the method from TestBase class launch browser
	    loginpage = new LoginPage();  // object create coz we are calling loginPage we this is non static so create object and call

	 }
	@Test(priority=1)
	public void verifyLogoTest() {
		String title=loginpage.verifyLogo();
		Assert.assertEquals(title, "OrangeHRM", "title mismatch");
	}
	// actual testing ,means sending real data 
	@Test(priority=2)
	public void loginTest() throws InterruptedException {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		// why homepage written is "Now I am on the Home Page. Please give me access to that page’s elements and methods."
		
		
		// my self written
		 //loginpage.login(prop.getProperty("username"), prop.getProperty("password")); // this line becomes: loginpage.login("admin", "admin123");
        // u can write like above without homapge if not doing nay actions on homepage
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
