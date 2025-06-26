package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.PimPage;
import com.crm.qa.util.TestUtil;

public class PimPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	PimPage pimpage;
	String sheetName="Sheet1";

	public PimPageTest() {
		super();
	}
	@BeforeMethod
	public void callUp() throws InterruptedException {
		initialization(); // browser will be launched
		loginpage = new LoginPage(); // login to the appliacation
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password")); // login to the
																								// appliacation
		pimpage = new PimPage();
		homepage = new HomePage();
	}
	@DataProvider
		public Object[][] getOrangeTestData() {
		Object data [][]=TestUtil.getTestData(sheetName);
		return data;	
	}
	@Test(priority=1, dataProvider="getOrangeTestData")
	public void PimOnClick(String firstName,String middleName , String lastName) throws InterruptedException {
		homepage.ClickOnPim();
		homepage.ClickOnPimAdd();
	//	pimpage.firstName("Elon", "musk", "Tesla"); // this is hard coded means one time below one is data driven approach
		pimpage.firstName(firstName, middleName, lastName); // you want data which is excel use this coz this is dat hard coded data 
		pimpage.saveButton();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit(); 
	}
}
