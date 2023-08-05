package org.Maac.Xampro.TestCases;

import org.Maac.Xampro.Configuration.BaseClass;
import org.Maac.Xampro.Pages.CartPage;
import org.Maac.Xampro.Pages.LandingPage;
import org.Maac.Xampro.Pages.LoginPage;
import org.Maac.Xampro.Pages.RegistrationPage;
import org.Maac.Xampro.Utilites.TestData;
import org.testng.annotations.Test;

public class XamproE2EValidation extends BaseClass {

    @Test
    public void XamproE2E(){

        LandingPage lp = new LandingPage(driver);
        CartPage cp = new CartPage(driver);
        LoginPage logp = new LoginPage(driver);


        //TC-09 Enter Email
        logp.getInputLoginEmail().sendKeys(TestData.ENTER_EMAIL);
        sleepTime(500);

        //TC-10 Enter Password
        logp.getInputLoginPassword().sendKeys(TestData.ENTER_PASSWORD);
        sleepTime(500);

        //TC-11 Click On Login Button
        logp.getClickOnLoginButton().click();
        sleepTime(1000);

        //TC-12 Click Cart Button
        lp.getClickOnCartPage().click();
        sleepTime(500);

        //TC-13 Click On Shopping Page
        cp.getClickOnContinueShopping().click();
        sleepTime(500);

        //TC-14 Click On General Page
        lp.getClickOnGeneral().click();
        sleepTime(500);

        //TC-15 Click on Add To Cart Button
        lp.getClickOnAddToCart().click();
        sleepTime(500);

        //TC-16 Click on Go To Cart Button
        lp.getClickOnGoToCart().click();
        sleepTime(500);

        //TC-17 Input Terms and conditions Agreed
        cp.getInputAgreedOption().click();
        sleepTime(500);

        //TC-18 Click on Payment Button
        cp.getClickOnPaymentButton().click();
        sleepTime(500);

        //TC-19 Click On Dashboard Button
        cp.getClickOnDashboard().click();
        sleepTime(1000);

        driver.navigate().to(TestData.BASE_URL);
        driver.quit();


    }
}
