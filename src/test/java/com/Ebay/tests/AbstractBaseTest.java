package com.Ebay.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.Ebay.lib.AppLib;

public class AbstractBaseTest {
	WebDriver driver;
	private AppLib app;

	@BeforeMethod
	@Parameters("browser")

	public void setup(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		}
		// System.setProperty("webdriver.chrome.driver",
		// "/Users/rayhanchowdhury/Downloads/chromedriver_mac_arm64/chromedriver");

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
