package com.saucedemo.tests;

import com.saucedemo.base.TestBase;
import com.saucedemo.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new LoginPage();
    }

    @Test
    public void loginTest() throws IOException {
        loginPage.clickSubmit();
        String err = loginPage.getErrorMessage();
        System.out.println("======>>>> " + err);
        String url = (String) testData.get("url");
        String browser = (String) testData.get("browser");
        String uName = (String) testData.get("username");
        String pwd = (String) testData.get("password");
        System.out.println(url);
        System.out.println(browser);
        System.out.println(uName);
        System.out.println(pwd);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
