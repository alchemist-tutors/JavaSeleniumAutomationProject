package com.testcases;

import org.testng.annotations.Test;

import com.pageobjects.Basetest;
import com.pageobjects.SelectPage;

public class SelectDropdown extends Basetest{
	
	@Test
    public void testDropdownSelection() throws InterruptedException {
        
		SelectPage selectpage = new SelectPage(driver);
		selectpage.selectByIndex(0);
		Thread.sleep(5000);
		selectpage.selectByValue("Option 2");
		Thread.sleep(5000);
		selectpage.selectByVisibleText("Option 1");
				
				
    }

}
