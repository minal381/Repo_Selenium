package page_objects;

import org.openqa.selenium.By;
import test_scripts.DriverWrapper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
    public Date getChechInDate() {

        Calendar ourCal = Calendar.getInstance();
        Date today = ourCal.getTime();
        System.out.println(today);
        ourCal.add(Calendar.DAY_OF_YEAR, 1);
        Date futureDate = ourCal.getTime();
        System.out.println(futureDate);
//        SimpleDateFormat sdf1 = new SimpleDateFormat("d");
//        Date date = new Date();
//        String currentDate = sdf1.format(date);
//        System.out.println(sdf1.getCalendar());
        return futureDate;
    }

    public Date getCheckOutDate(){
        Calendar ourCal = Calendar.getInstance();
        Date today = ourCal.getTime();
        ourCal.add(Calendar.DAY_OF_YEAR, 8);
        Date futureDate = ourCal.getTime();
        System.out.println(futureDate);
        return futureDate;
    }

    By alertCross = By.xpath("//button[@class='cta widget-overlay-close']");
    By checkInDate = By.xpath("//input[@id='qf-0q-localised-check-in']");

    By currentMonth_Hotel = By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible widget-daterange-below']//div[1]//div[1]//div[1]");
    By previousMonthArrow = By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible widget-daterange-below']//div[1]//div[1]//button[1]");
    By nextMonthArrow = By.xpath("//div[@class='widget-daterange-cont']//div[2]//div[1]//button[2]");


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

    public boolean isPreviousArrowDisplayed(){
        return isElementDisplayed(previousMonthArrow);
    }

    public void clickNextMonthArrow(){
        clickOn(nextMonthArrow);
    }

}
