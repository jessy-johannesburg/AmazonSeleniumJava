package pageObjects;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Proddetailspage extends Base {

    public Proddetailspage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement PRODDETAILSPAGE;

    public void verifyNavigationToPrdDetailsPage(){
        WebDriverWait wait = new WebDriverWait(driver, 15);

        // wait for WebElement (NOT By locator)
        wait.until(ExpectedConditions.visibilityOf(PRODDETAILSPAGE));

//        System.out.println("ProdDetailsPage = " + PRODDETAILSPAGE.getText());

        Assert.assertTrue(PRODDETAILSPAGE.isDisplayed());
    }
}
