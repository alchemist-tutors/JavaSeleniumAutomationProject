package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.utilities.BrowserFactory;
import com.utilities.ConfigDataProvider;

public class Basetest {

    protected WebDriver driver;
    protected ConfigDataProvider config;

    @BeforeSuite
    public void setupSuite() {
        config = new ConfigDataProvider();
    }

    @BeforeClass
    public void setUp() {
        driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getTestURL());
    }

    @AfterClass
    public void tearDown() {
        BrowserFactory.quitBrowser(driver);
    }
}
