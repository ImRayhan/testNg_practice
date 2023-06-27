package com.Ebay.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Ebay.elements.EbayAdvanced_Search_Elements;
import com.Ebay.elements.Ebay_Home_Page_Elements;

public class Ebay_Advanced_Page {
	WebDriver driver;
	Ebay_Home_Page_Elements home;
	EbayAdvanced_Search_Elements advancedSearch;
	String BaseUrl = "https://www.ebay.com/";

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

	public void AdvancedSearchRest(String minPrice, String maxPrice, String items, int twoHour, String minBid,
			String maxBid, String minQuan, String maxQuan, String itemsWithin, String postalCode, int locatedIn,
			int availableTo, int include, String sellersUsersId, String shortBy1, String shortBy2, String shortBy3)
			throws InterruptedException {
		home.advanchedSearchElement.click();

		boolean check;

		List<WebElement> a = advancedSearch.searchIncludingAllElement;
		int ab = a.size();
		System.out.println(ab);
		for (int i = 0; i < ab; i++) {
			check = a.get(i).isSelected();
			if (!check) {
				a.get(i).click();

				if (advancedSearch.minPricElement.isEnabled()) {
					advancedSearch.minPricElement.clear();
					advancedSearch.minPricElement.sendKeys(minPrice);

					if (advancedSearch.maxPricElement.isEnabled()) {
						advancedSearch.maxPricElement.clear();
						advancedSearch.maxPricElement.sendKeys(maxPrice);

						if (advancedSearch.endingWithElement.isEnabled()) {
							Select sel = new Select(advancedSearch.endingWithElement);

							// sel.deselectByVisibleText(items);
							sel.selectByVisibleText(items);

							if (advancedSearch.twoHourElement.isEnabled()) {
								Select sel1 = new Select(advancedSearch.twoHourElement);

								// sel1.deselectByIndex(twoHour);
								sel1.selectByIndex(twoHour);

								if (advancedSearch.minBidElement.isEnabled()) {
									advancedSearch.minBidElement.clear();
									advancedSearch.minBidElement.sendKeys(minBid);

									if (advancedSearch.maxBidElement.isEnabled()) {
										advancedSearch.maxBidElement.clear();
										advancedSearch.maxBidElement.sendKeys(maxBid);

										if (advancedSearch.minQuantityElement.isEnabled()) {
											advancedSearch.minQuantityElement.clear();
											advancedSearch.minQuantityElement.sendKeys(minQuan);

											if (advancedSearch.maxQuantityElement.isEnabled()) {
												advancedSearch.maxQuantityElement.clear();
												advancedSearch.maxQuantityElement.sendKeys(maxQuan);

												if (advancedSearch.itemwithin25Element.isEnabled()) {
													Select sel0 = new Select(advancedSearch.itemwithin25Element);
													// sel0.deselectByVisibleText(itemsWithin);
													sel0.selectByVisibleText(itemsWithin);

													if (advancedSearch.milesofZiporPostalCodeElement.isEnabled()) {
														advancedSearch.milesofZiporPostalCodeElement.clear();
														advancedSearch.milesofZiporPostalCodeElement
																.sendKeys(postalCode);

														if (advancedSearch.locetedInElement.isEnabled()) {

															Select sel3 = new Select(advancedSearch.locetedInElement);

															// sel3.deselectByIndex(locatedIn);
															sel3.selectByIndex(locatedIn);

															if (advancedSearch.availabletoElement.isEnabled()) {
																Select sel4 = new Select(
																		advancedSearch.availabletoElement);

																// sel4.deselectByIndex(availableTo);
																sel4.selectByIndex(availableTo);

																if (advancedSearch.SpecificsellersentersellersuserIDsIncludeElement
																		.isEnabled()) {
																	Select sel5 = new Select(
																			advancedSearch.SpecificsellersentersellersuserIDsIncludeElement);

																	// sel5.deselectByIndex(include);
																	sel5.selectByIndex(include);

																	if (advancedSearch.SpecificsellersentersellersuserIDsElement
																			.isEnabled()) {
																		advancedSearch.SpecificsellersentersellersuserIDsElement
																				.clear();
																		advancedSearch.SpecificsellersentersellersuserIDsElement
																				.sendKeys(sellersUsersId);

																		if (advancedSearch.shortByElement.isEnabled()) {
																			Select sel6 = new Select(
																					advancedSearch.shortByElement);

																			// sel6.deselectByVisibleText(shortBy1);
																			sel6.selectByVisibleText(shortBy1);

																			if (advancedSearch.viewResultsElement
																					.isEnabled()) {
																				Select sel7 = new Select(
																						advancedSearch.viewResultsElement);

																				// sel7.deselectByVisibleText(shortBy2);
																				sel7.selectByVisibleText(shortBy2);

																				if (advancedSearch.resultsPerPageElement
																						.isEnabled()) {
																					Select sel8 = new Select(
																							advancedSearch.resultsPerPageElement);

																					// sel8.deselectByVisibleText(
																					// shortBy3);
																					sel8.selectByVisibleText(shortBy3);

																				}

																			}

																		}

																	}

																}

															}

														}

													}

												}

											}

										}

									}

								}

							}

						}

					}

				}

			}

		}
		if (advancedSearch.searchBtElement.isEnabled()) {
			advancedSearch.searchBtElement.click();
		}
	}

}
