package org.Maac.Xampro.TestCases;

import org.Maac.Xampro.Configuration.BaseClass;
import org.Maac.Xampro.Pages.LandingPage;
import org.Maac.Xampro.Pages.RegistrationPage;
import org.Maac.Xampro.Utilites.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationPageValidation extends BaseClass {


    @Test
    public void registrationPage(){

        LandingPage lp = new LandingPage(driver);
        RegistrationPage rp = new RegistrationPage(driver);

        //TC-01 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given " + baseLink);
        Assert.assertEquals(baseLink, TestData.BASE_URL);
        System.out.println("Home URL is visible");
        sleepTime(1000);

        //TC-02 Navigate to Registration Page
        lp.getClickOnRegistrationButton().click();
        sleepTime(500);

        //TC-03 Input Full Name
        rp.getEnterFullName().sendKeys(TestData.ENTER_NAME);
        sleepTime(500);

        //TC-04 Input Email
        rp.getEnterEmail().sendKeys(TestData.ENTER_EMAIL);
        sleepTime(500);

        //TC-05 Input Phone Number
        rp.getEnterPhoneNumber().sendKeys(TestData.ENTER_PHONE_NUMBER);
        sleepTime(500);

        //TC-06 Input Password
        rp.getEnterPassword().sendKeys(TestData.ENTER_PASSWORD);
        sleepTime(500);

        //TC-07 Input Confirm Password
        rp.getEnterConfirmPassword().sendKeys(TestData.ENTER_CONFIRM_PASSWORD);
        sleepTime(500);

        //TC-08 Click On Register Button
        rp.getClickOnRegisterButton().click();
        sleepTime(500);

        //CLICK ON CHECK EMAIL
        lp.getClickOnCheckEmail().click();
        sleepTime(500);
    }
}
