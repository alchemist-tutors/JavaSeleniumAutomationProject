package com.testcases;

import org.testng.annotations.Test;

import com.pageobjects.Basetest;
import com.pageobjects.ClickSendKeysGetTextPage;
import com.pageobjects.LocatorsPage;

public class ClickSendKeysGetText extends Basetest {
	
	@Test
	public void locators() throws InterruptedException {

		ClickSendKeysGetTextPage TextPage = new ClickSendKeysGetTextPage(driver);
		
		TextPage.clickSearchButton();
		TextPage.enterSearchText("Selenium");
		TextPage.getFirstResultText();
		 

}
}
