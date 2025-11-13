package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorsPage extends Basetest {
	
	@FindBy(id="fsl")
	WebElement footerById  ;
	

	@FindBy(className="gNO89b")
	WebElement searchBtnByClass   ;
	

	@FindBy(name="q")
	WebElement searchBoxByName   ;
	

	@FindBy(xpath="//textarea[@title='Search")
	WebElement searchBoxByXpath    ;
	

	@FindBy(css="input[name='btnK']")
	WebElement searchBtnByCss     ;
	

    @FindBy(linkText = "Selenium")
    WebElement seleniumLinkByText;


		
	public LocatorsPage (WebDriver driver) {
		
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	public void enterSearchText(String text) {
        searchBoxByName.sendKeys(text);
    }

    public void clickSearchButton() {
        searchBtnByClass.click();
    }

    public void clickSeleniumLink() {
        seleniumLinkByText.click();
    }

    public void enterSearchUsingXpath(String text) {
        searchBoxByXpath.clear();
        searchBoxByXpath.sendKeys(text);
    }

    public void clickSearchUsingCss() {
        searchBtnByCss.click();
    }

    public void printFooterText() {
        System.out.println("Footer text: " + footerById.getText());
    }

}
