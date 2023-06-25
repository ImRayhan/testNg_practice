package com.Ebay.lib;

import org.openqa.selenium.WebDriver;

import com.Ebay.Pages.Ebay_Advanced_Page;
import com.Ebay.Pages.Ebay_Home_Page;

public class PageLib {
	private WebDriver driver;
	private Ebay_Home_Page homePage;
	private Ebay_Advanced_Page advancedPage;

	public PageLib(WebDriver driver) {
		this.driver = driver;
		homePage = new Ebay_Home_Page(this.driver);
		advancedPage = new Ebay_Advanced_Page(this.driver);
	}

	public Ebay_Home_Page Home_Page() {
		return homePage;

	}

	public Ebay_Advanced_Page AdvancedSearch() {
		return advancedPage;

	}

}
