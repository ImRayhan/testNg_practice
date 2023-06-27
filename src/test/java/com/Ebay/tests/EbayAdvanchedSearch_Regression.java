package com.Ebay.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EbayAdvanchedSearch_Regression extends AbstractBaseTest {

	@Test(groups = "regression")
	public void ebayAdvancedCetegorySearch() {

		App().Flow().navigateUrl(App().Pages().AdvancedSearch().getUrl());
		App().Pages().AdvancedSearch().AdvanedSearchFindItem("macbook", "Any words, any order", "apple", "Baby");
		String expectedUrl = "https://www.ebay.com/sch/i.html?_nkw=macbook&_in_kw=2&_ex_kw=apple&_sacat=2984";
		Assert.assertEquals(App().Flow().currentUrl(), expectedUrl, "verifying newUrl on the page");
		String expectedTitle = "(macbook) -apple in Baby for sale | eBay";
		Assert.assertEquals(App().Flow().title(), expectedTitle, "current page title varify");

	}

	@Test(groups = "regression")
	public void restAdvancedSearch() throws InterruptedException {
		App().Flow().navigateUrl(App().Pages().AdvancedSearch().getUrl());
		App().Pages().AdvancedSearch().AdvancedSearchRest("100", "200", "Started within", 2, "5", "10", "20", "100",
				"100", "14215", 2, 3, 1, "ray", "Time: ending soonest", "List view", "120");

	}

}
