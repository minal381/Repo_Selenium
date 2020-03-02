package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;

public class SeleniumHW02172020 extends DriverWrapper {
    /*1. Launch "https://www.facebook.com"
        2. Enter "abcd@test.com" as Email
3. Enter "test1234" as Password
4. Click on "Log In" button
5. Verify user gets "The password that you've entered is incorrect" message.*/


    @Test
    public void verifyInvalidPassword()
    {

        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();

        landingPage.enterEmail("abcd@test.com");
        landingPage.enterPassword("test1234");
        landingPage.clickLoginButton();
        String errorMessage = "The password that you've entered is incorrect";
        Assert.assertEquals(errorMessage,loginPage.getErrorMessage());


    }
}
