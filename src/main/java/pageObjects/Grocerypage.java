package pageObjects;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Grocerypage extends Base {

    public Grocerypage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//h1[text()='Grocery']")
    public WebElement GROCERYTXT;

    @FindBy(xpath = "//div[@data-csa-c-item-id='amzn1.asin.1.B0FKTT9145']")
    public WebElement SELPRODUCT;

    public void groceryTxtVisible(){
        WebDriverWait wait = new WebDriverWait(driver, 15);

        // wait for WebElement (NOT By locator)
        wait.until(ExpectedConditions.visibilityOf(GROCERYTXT));

//    System.out.println("GroceryTxt = " + GROCERYTXT.getText());
        GROCERYTXT.isDisplayed();
    }
    public void selectProduct(){
        SELPRODUCT.click();
    }
}
