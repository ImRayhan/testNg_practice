package com.Ebay.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Ebay.lib.AppLib;

public class AbstractBaseTest {
	WebDriver driver;
	private AppLib app;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/rayhanchowdhury/Downloads/chromedriver_mac_arm64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		app = new AppLib(driver);
	}

	@AfterMethod
	public void tearup() {
		driver.quit();

	}
	
	public AppLib App() {
		return app;
		
	}

}
