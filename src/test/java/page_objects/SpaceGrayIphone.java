package page_objects;

import org.openqa.selenium.By;

public class SpaceGrayIphone extends BasePage {
    private By spaceGrayPhonePrice = By.xpath("//span[@id='priceblock_ourprice']");

    public String spaceGrayPhonePrice(){
        return getValueFromElement(spaceGrayPhonePrice);
    }
}
