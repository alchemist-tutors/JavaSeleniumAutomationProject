package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickSendKeysGetTextPage extends Basetest {
	
	@FindBy(name = "q")
    WebElement searchBox;

    @FindBy(name = "btnK")
    WebElement searchButton;

    @FindBy(xpath = "(//h3)[1]")
    WebElement firstResult;
    
    
    public ClickSendKeysGetTextPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void enterSearchText(String text) {
        searchBox.clear();
        searchBox.sendKeys(text);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public String getFirstResultText() {
        return firstResult.getText();
    }
	
	
	

}
