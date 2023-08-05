package org.Maac.Xampro.Pages;

import org.Maac.Xampro.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {
    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#basic-navbar-nav > div > div.mobile-menu-dropdown-area-show > div.drop-down-show-body-area.body-content-show.mobile_menu > a.navbar-register-btn.nav-link > div")
    public WebElement clickOnRegistrationButton;
    public WebElement getClickOnRegistrationButton(){
        return clickOnRegistrationButton;
    }

    @FindBy(css = "#basic-navbar-nav > div > a")
    public WebElement clickOnCartPage;
    public WebElement getClickOnCartPage(){
        return clickOnCartPage;
    }

    @FindBy(css = "#uncontrolled-tab-example-tab-general")
    public WebElement clickOnGeneral;
    public WebElement getClickOnGeneral(){
        return clickOnGeneral;
    }

    @FindBy(css = "#uncontrolled-tab-example-tabpane-general > div > div:nth-child(1) > div > div > div.card-body > div > button")
    public WebElement clickOnAddToCart;
    public WebElement getClickOnAddToCart(){
        return clickOnAddToCart;
    }

    @FindBy(css = "#uncontrolled-tab-example-tabpane-general > div > div:nth-child(1) > div > div > div.card-body > div > button")
    public WebElement clickOnGoToCart;
    public WebElement getClickOnGoToCart(){
        return clickOnGoToCart;
    }

    @FindBy(css = "#root > div > div:nth-child(3) > div > div > div > div > div > div > div.my-auto.col-md-7 > div > div > button")
    public WebElement clickOnCheckEmail;
    public WebElement getClickOnCheckEmail(){
        return clickOnCheckEmail;
    }



}
