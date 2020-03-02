package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;

import java.util.ArrayList;
import java.util.List;

public class HomeWork02_20_2020 extends DriverWrapper {
    /**
     * Homework 1: Signup form should not accept any invalid email address
     * 1. Enter Firstname
     * 2. Enter Lastname
     * 3. Enter Invalid Email
     * 4. Click on New Password text field
     * 5. Click on red warning button on email field
     *
     * 6. Verify Error Message "Please enter a valid mobile number or email address."
     */
/**
 * List of Invalid Email Addresses
 *
 * plainaddress
 * #@%^%#$@#$@#.com
 * @example.com
 * Joe Smith <email@example.com>
 * email.example.com
 * email@example@example.com
 * .email@example.com
 * email.@example.com
 * email..email@example.com
 * あいうえお@example.com
 * email@example.com (Joe Smith)
 * email@example
 * email@-example.com
 * email@example.web
 * email@111.222.333.44444
 * email@example..com
 * Abc..123@example.com
 */
/**
 * Homework #2: Select the current month from month dropdown
 */
/**
 * Homework #3: Find out if dropdown contains duplicates, if yes fail the test and print the duplicate values
 */
/**
 * Homework #4: Create basepage action for, isDisplayed, isSelected, isEnabled, selectByText, selectByIndex, selectByValue, isDropDownContainsValue, isDropdownHasDuplicate*/

@Test
public void SignUpForm()
{
    LandingPage landingPage = new LandingPage();
    List<String> emailIds = new ArrayList<>();
    emailIds.add("#@%^%#$@#$@#.com");
    emailIds.add(" @example.com");
    System.out.println(emailIds);
    for(String emailId : emailIds)
    {
        landingPage.enterFirstName("Firstname");
        landingPage.enterLastname("Lastname");
        landingPage.enterMobileorEmail(emailId);
        // landingPage.enterNewPassword("test1234");
        landingPage.clickSignUpButton();
        landingPage.clickRedWarningButton();

        if(landingPage.isEmailErrorMassageDisplayed())
            System.out.println(landingPage.isEmailErrorMassageDisplayed());
        {
            String emailErrorMessage = "Please enter a valid mobile number or email address.";
            Assert.assertEquals(emailErrorMessage, landingPage.invalidEmailErrorMessage());


        }
    }
}
}


