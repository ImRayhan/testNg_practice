package com.Ebay.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayAdvanced_Search_Elements {

	WebDriver driver;

	public @FindBy(xpath = "//*[@id=\"_nkw\"]")
	WebElement enterKeyWordElement;
	
	public	@FindBy(xpath = "//*[@id=\"s0-1-17-4[0]-7[1]-_in_kw\"]")
	WebElement keyWordOptionElement;
	
	public	@FindBy(xpath = "//*[@id=\"_ex_kw\"]")
	WebElement excludesWordsSearchElement;
	
	public	@FindBy(xpath = "//*[@id=\"s0-1-17-4[0]-7[3]-_sacat\"]")
	WebElement categoriesElement;
	public @FindBy(xpath = "//div[@class='field adv-keywords__btn-help']//button[@type='submit'][normalize-space()='Search']")
	WebElement searchBtnElement;
	
	public EbayAdvanced_Search_Elements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	

}
