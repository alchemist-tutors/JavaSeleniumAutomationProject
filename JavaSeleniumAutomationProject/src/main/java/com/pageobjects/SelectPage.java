package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectPage {
	
	 WebDriver driver;
	 
	   // locators 

	    // Locate dropdown element
	 	@FindBy(id = "dropdown")
	    WebElement dropdownElement;

	    // Constructor
	    public SelectPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    //methods
	    
	 // Select by visible text
	    public void selectByVisibleText(String text) throws InterruptedException {
	    	
	        Select dropdown = new Select(dropdownElement);
	        
	        dropdown.deselectByVisibleText(text);
	    }

	    // Select by value
	    public void selectByValue(String value) throws InterruptedException {
	    	
	        Select dropdown = new Select(dropdownElement);
	        
	        dropdown.deselectByValue(value);
	    }

	    // Select by index
	    public void selectByIndex(int index) throws InterruptedException {
	    	
	        Select dropdown = new Select(dropdownElement);
	        
	        dropdown.deselectByIndex(index);
	    }

	    // Get selected option text
	    public String getSelectedOption() throws InterruptedException {
	    	
	        Select dropdown = new Select(dropdownElement);
	       
	        return dropdown.getFirstSelectedOption().getText();
	    } 
	}
	
	    
	    



