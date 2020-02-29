package test_scripts;

import org.testng.annotations.Test;
import page_objects.HotelLandingPage;


    public class VerifyIfShowingCurrentMonth extends DriverWrapper {
        /**
         * 1. Check if alert displayed? if yes then click on X button
         *    (Hint: Look for alert X button locator)
         * 2. Get focused month locator and strip out the text
         *    - Get current month as display month format and store it as String data type
         *    - Compare currentMonth from system for focused month from web page
         *      (If they are not equal then click on back button (Find back button locator))
         */

        @Test
        public void verifyIfShowingCurrentMonth(){
            HotelLandingPage landingPage = new HotelLandingPage();
            landingPage.clickAlertCross();
            syncWait(3000);
            landingPage.clickCheckIn();
            syncWait(2000);
            String  currentMonth_Hotel = landingPage.getCurrentMonth_Hotel();
            System.out.println(landingPage.getCurrentMonth_Hotel());
            String systemMonth = landingPage.getSystemMonth();
            System.out.println(landingPage.getSystemMonth());

            if(currentMonth_Hotel != systemMonth){
                landingPage.clickPreviousMonthArrow();
                syncWait(3000);
            }

            String tommorrow = landingPage.getSystemDate();
            System.out.println(landingPage.getSystemDate());
            syncWait(2000);


        }



    }

}
