package com.Ebay.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.Ebay.elements.EbayAdvanced_Search_Elements;
import com.Ebay.elements.Ebay_Home_Page_Elements;

public class Ebay_Advanced_Page {
	WebDriver driver;
	Ebay_Home_Page_Elements home;
	EbayAdvanced_Search_Elements advancedSearch;
	String BaseUrl ="https://www.ebay.com/";

	public Ebay_Advanced_Page(WebDriver driver) {

		this.driver = driver;
		home = new Ebay_Home_Page_Elements(driver);
		advancedSearch = new EbayAdvanced_Search_Elements(driver);
		

	}
	
	public String getUrl() {
		return BaseUrl;
		
	}
	
	public void AdvanedSearchFindItem(String item, String options, String excluded, String allCa) {
		home.advanchedSearchElement.click();
		advancedSearch.enterKeyWordElement.sendKeys(item);
		Select sel = new Select(advancedSearch.keyWordOptionElement);
		sel.selectByVisibleText(options);
		
		advancedSearch.excludesWordsSearchElement.sendKeys(excluded);
		Select sel1 = new Select(advancedSearch.categoriesElement);
		sel1.selectByVisibleText(allCa);
		advancedSearch.searchBtnElement.click();		
		
	}
	
	
	

}
