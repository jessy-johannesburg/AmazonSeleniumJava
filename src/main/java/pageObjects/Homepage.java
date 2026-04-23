package pageObjects;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends Base {

    public Homepage(WebDriver driver) {

        super(driver);
    }


    @FindBy(id = "glow-ingress-line2")
    public WebElement HOMEPAGETXT;

    @FindBy(xpath = "//div[@class='nav-div']//a[text()='Everyday Essentials']")
    public WebElement MENUTXT;

    @FindBy(xpath = "//span[text()=' Groceries ']")
    public WebElement GROCERIESTXT;










public void verifyAndClickHomePageText(){
    WebDriverWait wait = new WebDriverWait(driver, 15);

    // wait for WebElement (NOT By locator)
    wait.until(ExpectedConditions.visibilityOf(HOMEPAGETXT));

//    System.out.println("HomePageTxt = " + HOMEPAGETXT.getText());

    Assert.assertTrue(HOMEPAGETXT.isDisplayed());
    HOMEPAGETXT.click();
}
public void clickMenuText(){
    WebDriverWait wait = new WebDriverWait(driver, 15);

    // wait for WebElement (NOT By locator)
    wait.until(ExpectedConditions.visibilityOf(MENUTXT));

//    System.out.println("MenuTxt = " + MENUTXT.getText());

    Assert.assertTrue(MENUTXT.isDisplayed());
    MENUTXT.click();
}
public void groceriesVisible(){
    WebDriverWait wait = new WebDriverWait(driver, 15);

    // wait for WebElement (NOT By locator)
    wait.until(ExpectedConditions.visibilityOf(GROCERIESTXT));

//    System.out.println("GroceriesTxt = " + GROCERIESTXT.getText());

    Assert.assertTrue(GROCERIESTXT.isDisplayed());
}
public void clickGroceries(){
        GROCERIESTXT.click();
}





}
