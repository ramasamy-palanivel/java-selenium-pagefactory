package com.parabank.tests;

import com.parabank.base.TestBase;
import com.parabank.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;

    public LoginPageTest() throws IOException {
        super();
    }
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
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
