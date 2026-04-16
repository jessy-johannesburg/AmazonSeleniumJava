package pageObjects;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.Enablers;

import java.io.IOException;
import java.util.List;


public class Objects extends Base {
    Enablers enablers = new Enablers(driver);

    public Objects(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//span[@class='ssrcss-1sdg3ez-LinkTextContainer eis6szr1'and text()='Formula 1']")
    public WebElement FORMULA_1;

    @FindBy(xpath = "//h1[@id='main-heading']")
    public WebElement HEADING_FORMULA1;

    @FindBy(xpath = "//span[@class='ssrcss-12rp8ws-LinkTextContainer eis6szr1'and text()='Results']")
    public WebElement RESULTS;

    @FindBy(xpath = "//h1[text()='Formula 1 Results']")
    public WebElement HEADING_RESULTS;


    @FindBy(xpath = "//div[text()='2023']")
    public WebElement YEAR;

    @FindBy(xpath = "(//span[text()='Max Verstappen'])[1]")
    public WebElement FIRST_POSITION;

    @FindBy(xpath = "(//span[text()='Charles Leclerc'])[1]")
    public WebElement SECOND_POSITION;

    @FindBy(xpath = "(//span[text()='George Russell'])[1]")
    public WebElement THIRD_POSITION;

    @FindBy(xpath = "//div[@class='ssrcss-kpltdl-LogoWrapper esbu9dd5']")
    public WebElement SPORT_HEADING;
    @FindBy(xpath = "//a[@class='ssrcss-sie4c8-NavigationLink-SearchLink eki2hvo13']")
    public WebElement SEARCH_BOX;
    @FindBy(id = "searchInput")
    public WebElement SEARCH_INPUT;
    @FindBy(id = "searchButton")
    public WebElement SEARCH_BUTT;


    public void clickOnFormula() {
        FORMULA_1.click();
    }
    public void headingVisible() {
        HEADING_FORMULA1.isDisplayed();
    }
    public void clickOnResults() {
        RESULTS.click();
    }
    public void resHeadingVisible() {
        HEADING_RESULTS.isDisplayed();
    }

    public void clickOnYear() {
        YEAR.click();
    }

    public void verifyFirstPosition() {

        String firstRacerName = FIRST_POSITION.getText().trim();
        System.out.println("First: " + firstRacerName);

        Assert.assertEquals(firstRacerName, "Max Verstappen");
    }

    public void verifySecondPosition() {

        String secondRacerName = SECOND_POSITION.getText().trim();
        System.out.println("Second: " + secondRacerName);

        Assert.assertEquals(secondRacerName, "Charles Leclerc");
    }

    public void verifyThirdPosition() {

        String thirdRacerName = THIRD_POSITION.getText().trim();
        System.out.println("Third: " + thirdRacerName);

        Assert.assertEquals(thirdRacerName, "George Russell");
    }
}