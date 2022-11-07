package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath ="//div[contains(text(),'More travel')]")
    WebElement moreTravelMenu;

    @FindBy(xpath ="(//a[@role='tab'])[1]")
    WebElement staysTab;

    @FindBy(xpath ="//button[@aria-label='Going to']")
    WebElement goingToButton;

    @FindBy(id ="location-field-destination")
    WebElement destinationField;

    @FindBy(xpath = "//button[@data-testid='submit-button']")
    WebElement searchButton;




    public void verifyUserIsOnHomePage(){

        Assert.assertTrue(moreTravelMenu.isDisplayed());

    }
    public void verifyStaysTabIsActivated(){

        Assert.assertTrue(goingToButton.isDisplayed());

    }
    public void enterDestination(){
        goingToButton.click();

        destinationField.sendKeys("Paris"+ Keys.ENTER);
        String destination = destinationField.getAttribute("value");
        System.out.println(destination);

    }

    public void clickSearchButton(){
        try {
            searchButton.click();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void verifyResultPageIsOpen(){

        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("Paris"));
    }

}

