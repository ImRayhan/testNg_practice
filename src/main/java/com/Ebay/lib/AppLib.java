package com.Ebay.lib;

import org.openqa.selenium.WebDriver;

public class AppLib {
	private WebDriver driver;
	private PageLib page;
	private FlowLib_Verify flow;
	

	public AppLib(WebDriver driver) {
		this.driver = driver;
		page = new PageLib(this.driver);
		flow = new FlowLib_Verify(this.driver);
	}

	public PageLib Pages() {
		return page;

	}

	public FlowLib_Verify Flow() {
		return flow;

	}

}
