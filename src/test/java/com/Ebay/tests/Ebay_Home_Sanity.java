package com.Ebay.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ebay_Home_Sanity extends AbstractBaseTest {

	@Test
	public void searchField() {
		String expectedUrl = "https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2380057.m570.l1313&_nkw=Iphone&_sacat=0";
		String expectTitle = "Iphone for sale | eBay";
		App().Flow().navigateUrl(App().Pages().Home_Page().getPageUrl());
		App().Pages().Home_Page().search("Iphone");
		App().Pages().Home_Page().clickSearch();
		App().Pages().Home_Page().velidateIphoneKeyword();
		Assert.assertEquals(App().Flow().currentUrl(),expectedUrl);
	    Assert.assertEquals(App().Flow().title(), expectTitle);

	}

}
