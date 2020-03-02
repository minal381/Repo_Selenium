package test_scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;

public class Practice extends DriverWrapper {


    @Test
    public void testBooleanActions() {
      //  boolean femaleRadioButtonSelected= getDriver().findElement(By.id("u_0_9")).isSelected();
      // System.out.println(femaleRadioButtonSelected);
       boolean femaleRadioButtonDisplayed= getDriver().findElement(By.id("u_0_9")).isDisplayed();
       System.out.println(femaleRadioButtonDisplayed);
//        boolean femaleRadioButtonEnabled= getDriver().findElement(By.id("u_0_9")).isEnabled();
//        System.out.println(femaleRadioButtonEnabled);


    }
}
