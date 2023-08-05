package org.Maac.Xampro.Pages;

import org.Maac.Xampro.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#name")
    public WebElement enterFullName;
    public WebElement getEnterFullName(){
        return enterFullName;
    }
    @FindBy(css = "#root > div > div.student-login-main-wrap.signup-page > div > div.account-main-right-submit-info > div.student-account-form-wrap > div > div.acoount-email-password-area > form > div:nth-child(1) > div > div > div > div")
    public WebElement invalidFeedbackName;
    public WebElement getInvalidFeedbackName(){
        return invalidFeedbackName;
    }


    @FindBy(css = "#email")
    public WebElement enterEmail;
    public WebElement getEnterEmail(){
        return enterEmail;
    }
    @FindBy(css = "#root > div > div.student-login-main-wrap.signup-page > div > div.account-main-right-submit-info > div.student-account-form-wrap > div > div.acoount-email-password-area > form > div:nth-child(2) > div > div > div > div")
    public WebElement invalidFeedbackEmail;
    public WebElement getInvalidFeedbackEmail(){
        return invalidFeedbackEmail;
    }

    @FindBy(css = "#phoneNumber")
    public WebElement enterPhoneNumber;
    public WebElement getEnterPhoneNumber(){
        return enterPhoneNumber;
    }
    @FindBy(css = "#root > div > div.student-login-main-wrap.signup-page > div > div.account-main-right-submit-info > div.student-account-form-wrap > div > div.acoount-email-password-area > form > div:nth-child(3) > div > div > div > div")
    public WebElement invalidFeedbackPhone;
    public WebElement getInvalidFeedbackPhone(){
        return invalidFeedbackPhone;
    }

    @FindBy(css = "#password")
    public WebElement enterPassword;
    public WebElement getEnterPassword(){
        return enterPassword;
    }
    @FindBy(css = "#root > div > div.student-login-main-wrap.signup-page > div > div.account-main-right-submit-info > div.student-account-form-wrap > div > div.acoount-email-password-area > form > div:nth-child(4) > div > div > div > div")
    public WebElement invalidFeedbackPassword;
    public WebElement getInvalidFeedbackPassword(){
        return invalidFeedbackPassword;
    }

    @FindBy(css = "#confirmPassword")
    public WebElement enterConfirmPassword;
    public WebElement getEnterConfirmPassword(){
        return enterConfirmPassword;
    }
    @FindBy(css = "#root > div > div.student-login-main-wrap.signup-page > div > div.account-main-right-submit-info > div.student-account-form-wrap > div > div.acoount-email-password-area > form > div:nth-child(5) > div > div > div > div")
    public WebElement invalidFeedbackConfirmPassword;
    public WebElement getInvalidFeedbackConfirmPassword(){
        return invalidFeedbackConfirmPassword;
    }

    @FindBy(css = "#root > div > div.student-login-main-wrap.signup-page > div > div.account-main-right-submit-info > div.student-account-form-wrap > div > div.acoount-email-password-area > form > div:nth-child(6) > div > button > div > img")
    public WebElement clickOnRegisterButton;
    public WebElement getClickOnRegisterButton(){
        return clickOnRegisterButton;
    }
}
