package org.Maac.Xampro.Pages;

import org.Maac.Xampro.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#root > div > div:nth-child(3) > div > div > div > div > div.empty-cart-main-area-wrap-empty > div > a")
    public WebElement clickOnContinueShopping;
    public WebElement getClickOnContinueShopping(){
        return clickOnContinueShopping;
    }

    @FindBy(css = "#agree")
    public WebElement inputAgreedOption;
    public WebElement getInputAgreedOption(){
        return inputAgreedOption;
    }

    @FindBy(css = "#root > div > div:nth-child(3) > div > div > div > div > div.row > div:nth-child(2) > div > div.basic-price-top.last-bottom-cart > form > div > div.p-price > button")
    public WebElement clickOnPaymentButton;
    public WebElement getClickOnPaymentButton(){
        return clickOnPaymentButton;
    }

    @FindBy(css = "#root > div > div:nth-child(3) > div > div > div > div > h6 > a")
    public WebElement clickOnDashboard;
    public WebElement getClickOnDashboard(){
        return clickOnDashboard;
    }
}
