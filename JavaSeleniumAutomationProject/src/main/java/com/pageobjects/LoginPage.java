package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Simple Page Object for Google home page (search example)
 */
public class LoginPage {

    WebDriver driver;

    @FindBy(name = "q")
    WebElement searchBox;

    @FindBy(name = "btnK")
    WebElement searchButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void SearchPage() {
        searchBox.sendKeys("Selenium WebDriver");
        // small pause to let suggestions load (in real tests use explicit wait)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // ignore
        }
        searchButton.click();
    }
}
