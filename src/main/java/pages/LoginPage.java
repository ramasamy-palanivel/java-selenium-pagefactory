package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userName = By.xpath("//input[@name='username']");
    private By password = By.xpath("//input[@name='password']");
    private By submit = By.xpath("//input[@type=\"submit\"]");
    private By register = By.xpath(" //*[contains(text(),'Register')]");
    private By errorTitle = By.xpath("//h1[@class='title'] ");
    private By errorMessage = By.xpath("//p[@class='error']");

    protected void enterUserName(String userNameValue) {
        driver.findElement(userName).sendKeys(userNameValue);
    }
    protected void enterPassword(String passwordValue) {
        driver.findElement(password).sendKeys(passwordValue);
    }
    protected void clickSubmit() {
        driver.findElement(submit).click();
    }
    protected void clickRegister() {
        driver.findElement(register).click();
    }
    protected String checkErrorTitle() {
        return driver.findElement(errorTitle).getText();
    }
    protected String checkErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
    protected void login(String uname, String pwd){
        enterUserName(uname);
        enterPassword(pwd);
        clickSubmit();
    }
    protected String checkInvalidLogin(){
        clickSubmit();
        return checkErrorMessage();
    }
}
