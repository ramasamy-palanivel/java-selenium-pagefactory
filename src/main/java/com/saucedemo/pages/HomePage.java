package com.saucedemo.pages;

import com.saucedemo.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath="//*[contains(text(),'Your account was created successfully. You are now')]")
    WebElement accountLabel;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public boolean verifyLandingPage(){
        return accountLabel.isDisplayed();
    }


}
