package com.Ebay.elements;

import java.util.List;

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
	
	public @FindBy(xpath  = "//label[@class='field__label--end']")
	List<WebElement> searchIncludingAllElement;
	
	public @FindBy(xpath = "//*[@id=\"s0-1-17-5[2]-@range-comp[]-@range-textbox[]-textbox\"]")
	WebElement minPricElement;
	
	public @FindBy(xpath =  "//*[@id=\"s0-1-17-5[2]-@range-comp[]-@range-textbox[]_1-textbox\"]")
	WebElement maxPricElement;
	
	public @FindBy(xpath = "//fieldset[@class='adv-fieldset__format']//div")
	WebElement buyingFormatAllElement;
	
	public @FindBy(xpath = "//fieldset[@class='adv-fieldset__condition']//div")
	WebElement ConditionAllElement;
	
	public @FindBy(xpath = "/html/body/div[3]/div/main/form/fieldset[6]/div")
	WebElement showREsultAllElement;
	
	public @FindBy(xpath = "//*[@id=\"s0-1-17-5[5]-3[@field[]]-1[0]-_ftrt\"]")
	WebElement endingWithElement;
	
	public @FindBy(id = "s0-1-17-5[5]-3[@field[]]-1[1]-_ftrv")
	WebElement twoHourElement;
	
	public @FindBy(id = "s0-1-17-5[5]-@range-comp[]-@range-textbox[]-textbox")
	WebElement minBidElement;
	
	public @FindBy(id = "s0-1-17-5[5]-@range-comp[]-@range-textbox[]_1-textbox")
	WebElement maxBidElement;
	
	public @FindBy(id = "s0-1-17-5[5]-@range-comp[]_1-@range-textbox[]-textbox")
	WebElement minQuantityElement;
	
	public @FindBy(id = "s0-1-17-5[5]-@range-comp[]_1-@range-textbox[]_1-textbox")
	WebElement maxQuantityElement;
	
	public @FindBy(xpath  = "/html/body/div[3]/div/main/form/fieldset[7]/div")
	WebElement shippingOptionsAllElement;
	
	public @FindBy(xpath  = "/html/body/div[3]/div/main/form/fieldset[8]/div")
	WebElement itemLocetionAllElement;
	
	public @FindBy(css  = "body > div:nth-child(3) > div:nth-child(1) > main:nth-child(4) > form:nth-child(1) > fieldset:nth-child(9) > div:nth-child(3) > span:nth-child(3) > span:nth-child(2) > span:nth-child(1) > select:nth-child(1)")
	WebElement itemwithin25Element;
	
	public @FindBy(name  = "_stpos")
	WebElement milesofZiporPostalCodeElement;
	
	public @FindBy(xpath  = "//*[@id=\"s0-1-17-6[7]-5[@field[]]-_salic\"]")
	WebElement locetedInElement;
	
	public @FindBy(id  = "s0-1-17-6[7]-5[@field[]]_1-_saact")
	WebElement availabletoElement;
	
	public @FindBy(id  = "s0-1-17-7[8]-7[0[@adv-seller]]-_saslop")
	WebElement SpecificsellersentersellersuserIDsIncludeElement;
	
	public @FindBy(id  = "s0-1-17-7[8]-_sasl")
	WebElement SpecificsellersentersellersuserIDsElement;
	
	public @FindBy(xpath =  "/html/body/div[3]/div/main/form/fieldset[9]/div/div")
	WebElement SellersAllElement;
	
	public @FindBy(xpath =  "//*[@id=\"s0-1-17-8[9]-1[0]-_sop\"]")
	WebElement shortByElement;
	
	public @FindBy(xpath =  "//*[@id=\"s0-1-17-8[9]-1[1]-_dmd\"]")
	WebElement viewResultsElement;
	
	public @FindBy(xpath =  "//*[@id=\"s0-1-17-8[9]-1[2]-_ipg\"]")
	WebElement resultsPerPageElement;
	
	public @FindBy(xpath =  "//div[@class='adv-form__actions']//button[@type='submit'][normalize-space()='Search']")
	WebElement searchBtElement;
	
	
	
	
	
	public EbayAdvanced_Search_Elements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	

}
