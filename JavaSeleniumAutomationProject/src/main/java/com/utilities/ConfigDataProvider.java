package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

    Properties prop;

    public ConfigDataProvider() {
        try {
            FileInputStream fis = new FileInputStream("./config/config.properties");
            prop = new Properties();
            prop.load(fis);
        } catch (IOException e) {
            System.out.println("Unable to load Config file: " + e.getMessage());
            prop = new Properties();
        }
    }

    public String getBrowser() {
        return prop.getProperty("browser", "chrome");
    }

    public String getTestURL() {
        return prop.getProperty("url", "https://google.com");
    }
}
