package pageObjects;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addtocartpage extends Base {

    public Addtocartpage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement ADDTOCART;

    @FindBy(xpath = "//div[@data-asin='B0FKTT9145']")
    public WebElement PRODINCART;

    @FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
    public WebElement PRODPRICE;

    public void clickAddToCart(){
        ADDTOCART.click();
    }
    public void selectedProdIsInCart(){
        PRODINCART.isDisplayed();
    }
    public void verifyProdPrice(){
        PRODPRICE.isDisplayed();
    }
}
