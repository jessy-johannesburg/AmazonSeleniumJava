package pageObjects;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkoutpage extends Base {

    public Checkoutpage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
    public WebElement CHECKOUTBTN;

    @FindBy(xpath = "//h1[@class='a-size-medium-plus a-spacing-small']")
    public WebElement SIGNINPAGE;

    public void clickCheckoutBtn(){
        CHECKOUTBTN.click();
    }
    public void verifySignInPage(){
        SIGNINPAGE.isDisplayed();
    }



}
