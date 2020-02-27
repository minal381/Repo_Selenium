package test_scripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.AmazonLandingPage;
import page_objects.IphonePage;
import page_objects.SpaceGrayIphone;

public class VerifyIphonePrice extends DriverWrapper{
//    Classwork:
//    Go to Amazon.com
//    Search for iPhone (or any item)
//    Verify price of first search product is between $50 - $150
//    Verify getDate is greater than today
    @Test
        public void amazon()
    {
        AmazonLandingPage landingPage1 = new AmazonLandingPage();
        IphonePage iphonePage = new IphonePage();
        SpaceGrayIphone spaceGrayIphone = new SpaceGrayIphone();


        landingPage1.enterItem("iphone");
        landingPage1.clickSearchButton();
        //System.out.println(iphonePage.getPrice());
        iphonePage.clickOnPrice();
        syncWait(2000);
        String price = spaceGrayIphone.spaceGrayPhonePrice();
        System.out.println(spaceGrayIphone.spaceGrayPhonePrice());

      String iphonePrice = price.replace("$","");
      System.out.println(iphonePrice);


        Double result = Double.valueOf(iphonePrice);
        System.out.println(result);

        boolean res = false;
        if (result>50 && result<150)
        {
            res =true;
            System.out.println(res);
        }
        Assert.assertTrue(res,"Iphone price is not between range.");




    }


}
