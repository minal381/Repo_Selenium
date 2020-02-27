package page_objects;

import org.openqa.selenium.By;

public class AmazonLandingPage extends BasePage{//
    // Locator for searchfield
    private By searchField = By.name("field-keywords");
    private By searchButton = By.className("nav-input");

    // Method for searchfield

    public void enterItem(String value){setValue(searchField, value);}

    public void clickSearchButton(){clickOn(searchButton);}
}
