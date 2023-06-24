package com.Ebay.lib;

import org.openqa.selenium.WebDriver;

public class FlowLib_Verify {
	private WebDriver driver;

	public FlowLib_Verify(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateUrl(String url) {
		this.driver.get(url);
	}

	public String currentUrl() {
		return this.driver.getCurrentUrl();

	}

	public String title() {
		return this.driver.getTitle();

	}

}
