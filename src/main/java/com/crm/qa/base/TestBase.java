package com.crm.qa.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestBase {

	// global varibale we can use Etire project coz Global variable because it's static and public
	public static WebDriver driver;   
	public static Properties prop;

	public TestBase() { //This is a constructor. runs automatically when you create an object of the class
		
		// properties read and loaded the actual data
		try { 
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\A\\eclipse-workspace\\SeleniumFramework\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {   //Handle errors if file is missing or unreadable.
			e.printStackTrace(); 

		} catch (IOException e) {   //Handle errors if file is missing or unreadable.
			e.printStackTrace();
		}
	}
	// lanching chrome browser
	public static void initialization() {
		String broswerName = prop.getProperty("browser");
		if (broswerName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);//wait for page to fully load 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//wait for elements to appear
		// passing URL
		driver.get(prop.getProperty("url"));

	}
}
