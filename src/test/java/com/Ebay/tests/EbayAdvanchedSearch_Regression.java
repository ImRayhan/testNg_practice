package com.Ebay.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EbayAdvanchedSearch_Regression extends AbstractBaseTest {
	@Test
	public void ebayAdvancedCetegorySearch() {

		App().Flow().navigateUrl(App().Pages().AdvancedSearch().getUrl());
		App().Pages().AdvancedSearch().AdvanedSearchFindItem("macbook", "Any words, any order", "apple", "Baby");
		String expectedUrl = "https://www.ebay.com/sch/i.html?_nkw=macbook&_in_kw=2&_ex_kw=apple&_sacat=2984";
		Assert.assertEquals(App().Flow().currentUrl(), expectedUrl, "verifying newUrl on the page");
		String expectedTitle = "(macbook) -apple in Baby for sale | eBay";
		Assert.assertEquals(App().Flow().title(), expectedTitle, "current page title varify");

	}

}
