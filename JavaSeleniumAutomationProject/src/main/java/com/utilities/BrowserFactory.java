package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

    public static WebDriver startApplication(WebDriver driver, String browserName, String appURL) {

        if (browserName == null) {
            browserName = "chrome";
        }

        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            System.out.println("Unsupported browser: " + browserName + ". Falling back to Chrome.");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(appURL);
        return driver;
    }

    public static void quitBrowser(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
    }
}
