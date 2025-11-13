package com.testcases;

import org.testng.annotations.Test;

import com.pageobjects.Basetest;
import com.pageobjects.LocatorsPage;

public class LocatorsTest extends Basetest {
	
	@Test
	public void locators() throws InterruptedException {

	 LocatorsPage lp = new LocatorsPage(driver);
	 
	 Thread.sleep(5000);
	 lp.clickSearchButton();
	 
	 Thread.sleep(5000);
	 lp.clickSeleniumLink();
	 
	 Thread.sleep(5000);
	 
}
}