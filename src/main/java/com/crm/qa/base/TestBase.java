package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		// properties read and loaded the actual data
		try { 
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\A\\eclipse-workspace\\SeleniumFramework\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace(); 

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// lanching chrome browser
	public static void initialization() {
		String broswerName = prop.getProperty("browser");
		if (broswerName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// passing URL
		driver.get(prop.getProperty("url"));

	}
}
