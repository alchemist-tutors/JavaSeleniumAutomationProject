package com.testcases;

import org.testng.annotations.Test;

import com.pageobjects.Basetest;
import com.pageobjects.LoginPage;

public class LoginTest extends Basetest {

    @Test
    public void Search() {
        LoginPage lg = new LoginPage(driver);
        lg.SearchPage();
    }
}
