package com.Ebay.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_Home_Page_Elements {
	WebDriver driver;

	@FindBy(xpath = "//input[@id='gh-ac']")
	public WebElement searchFieldElement;

	@FindBy(xpath = "//input[@id='gh-btn']")
	public WebElement searchBtnElement;

	public @FindBy(xpath = "//span[@role='heading'][contains(text(),'Apple iPhone 11 Pro 64GB Unlocked AT&T T-Mobile Ve')]") 
	WebElement varifyIphoneElement;

	public @FindBy(xpath = "//a[@id='gh-as-a']") 
	WebElement advanchedSearchElement;

	public Ebay_Home_Page_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
