package page_objects;

import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;


    public class HotelLandingPage extends BasePage {

        public String getSystemMonth() {
            SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
            Date date = new Date();
            String systemMonth = sdf.format(date);
            return systemMonth;}
        //System.out.println(systemMonth);

        public String getSystemDate(){
            SimpleDateFormat sdf = new SimpleDateFormat("d");
            Date date = new Date();
            String systemDate = sdf.format(date);
            return systemDate;
        }

        By alertCross = By.xpath("//button[@class='cta widget-overlay-close']");
        By checkInDate = By.xpath("//input[@id='qf-0q-localised-check-in']");
        By currentMonth_Hotel = By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible widget-daterange-below']//div[1]//div[1]//div[1]");
        By previousMonthArrow = By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible widget-daterange-below']//div[1]//div[1]//button[1]");



        public void clickAlertCross(){
            clickOn(alertCross);
        }

        public void clickCheckIn(){
            clickOn(checkInDate);
        }

        public String getCurrentMonth_Hotel(){
            return getValueFromElement(currentMonth_Hotel);
        }

        public void clickPreviousMonthArrow(){
            clickOn(previousMonthArrow);
        }


    }


