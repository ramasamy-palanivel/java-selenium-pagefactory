package com.saucedemo.pages;

import com.saucedemo.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath="//input[@id='user-name']")
    WebElement userName;

    @FindBy(xpath="//input[@id='password']")
    WebElement password;

    @FindBy(xpath="//input[@id='login-button']")
    WebElement submit;

    @FindBy(xpath="//h3[@data-test='error']")
    WebElement errorLabel;

    @FindBy(xpath="//h3[@data-test='error']")
    WebElement errorMessage;

    public LoginPage() {
        PageFactory.initElements(driver, this );
    }

    public void enterUserName(String userNameValue) {
        userName.sendKeys(userNameValue);
    }
    public void enterPassword(String passwordValue) {
        password.sendKeys(passwordValue);
    }
    public void clickSubmit() {
        submit.click();
    }

    public boolean checkErrorDisplayed() {
        return errorLabel.isDisplayed();
    }
    public String getErrorMessage() {
        return errorMessage.getText();
    }
    public HomePage login(String uname, String pwd){
        enterUserName(uname);
        enterPassword(pwd);
        clickSubmit();
        return new HomePage();
    }
    public String checkInvalidLogin(){
        clickSubmit();
        return getErrorMessage();
    }

}
