package com.Ebay.Pages;

import org.openqa.selenium.WebDriver;

import com.Ebay.elements.Ebay_Home_Page_Elements;

public class Ebay_Home_Page {
	WebDriver driver;
	String pageUrl = "https://www.ebay.com/";

	Ebay_Home_Page_Elements homePage;

	public Ebay_Home_Page(WebDriver driver) {
		this.driver = driver;
		homePage = new Ebay_Home_Page_Elements(driver);
	}

	public void search(String phoneName) {
		homePage.searchFieldElement.sendKeys(phoneName);
	}

	public void clickSearch() {
		homePage.searchBtnElement.click();
	}

	public void velidateIphoneKeyword() {
		String expectedS1 = "iphone";
		String s = homePage.varifyIphoneElement.getText().trim().toLowerCase();
		boolean actual = s.contains(expectedS1);
		System.out.println(s);
		System.out.println(actual);
	}

	public String getPageUrl() {
		return pageUrl;
	}

}
