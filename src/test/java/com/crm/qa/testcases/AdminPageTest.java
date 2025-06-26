package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AdminPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class AdminPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	AdminPage adminpage;

	public AdminPageTest() {
		super();
	}

	@BeforeMethod
	public void call() throws InterruptedException {
		initialization(); // browser will be launched
		loginpage = new LoginPage(); // login to the appliacation
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		adminpage = new AdminPage();

	}

	@Test(priority=1)
	public void AdminOnClick() throws InterruptedException {
		homepage.ClickOnAdmin();

		adminpage.clickOnAdd();

		adminpage.createOnUser();

		adminpage.clickonNewAdmin();

		adminpage.clickonNewAdminEnable();

		adminpage.clickonNewAdminEnableStatus();

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
