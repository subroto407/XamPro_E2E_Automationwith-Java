package org.Maac.Xampro.Pages;

import org.Maac.Xampro.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

   @FindBy(css = "#email")
    public WebElement inputLoginEmail;
    public WebElement getInputLoginEmail(){
        return inputLoginEmail;
    }

    @FindBy(css = "#root > div > div.account-profile-main-area > div.account-main-right-submit-info > div.student-login-main-wrap > div > div > div.acoount-email-password-area-wrap > form > div:nth-child(1) > div > div > div > div")
    public WebElement invalidFeedbackLoginEmail;
    public WebElement getInvalidFeedbackLoginEmail(){
        return invalidFeedbackLoginEmail;
    }

    @FindBy(css = "#password")
    public WebElement inputLoginPassword;
    public WebElement getInputLoginPassword(){
        return inputLoginPassword;
    }

    @FindBy(css = "#root > div > div.account-profile-main-area > div.account-main-right-submit-info > div.student-login-main-wrap > div > div > div.acoount-email-password-area-wrap > form > div:nth-child(2) > div > div > div > div")
    public WebElement invalidFeedbackLoginPassword;
    public WebElement getInvalidFeedbackLoginPassword(){
        return invalidFeedbackLoginPassword;
    }

    @FindBy(css = "#root > div > div.account-profile-main-area > div.account-main-right-submit-info > div.student-login-main-wrap > div > div > div.acoount-email-password-area-wrap > form > div:nth-child(4) > div > button > div > img")
    public WebElement clickOnLoginButton;
    public WebElement getClickOnLoginButton(){
        return clickOnLoginButton;
    }


}
