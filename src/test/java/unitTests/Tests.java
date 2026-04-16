package unitTests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.Base;
import pageObjects.Objects;

import java.io.IOException;

public class Tests extends Base {

    @Test
    public void purchaseItems() throws InterruptedException, IOException {
        launchBrowserAndUrl();
//        Objects ob = new Objects(driver);
//        ob.enterUsername("standard_user");
//        ob.enterPassword("secret_sauce");
//        ob.clickLoginButton();
//        ob.verifyURL();
//        ob.verifyProductsList();
//        ob.addFirstItemToCart();
//        ob.addSecondItemToCart();
//        ob.verifyCartTotal();
//        ob.clickOnCartList();
//        ob.verifyFirstProductsAndPrices();
//        ob.verifySecondProductsAndPrices();
//        ob.clickCheckoutButton();
//        ob.enterUserDetailsAndClickedOnContinueButton("John","Doe","12345");
//        ob.verifyFirstProductsAndPrices();
//        ob.verifySecondProductsAndPrices();
//        ob.totalPriceDisplayed();
//        ob.clickFinishButton();
//        ob.orderConformationMessageDisplayed();
//        ob.clickOnBurgerMenuAndLogoutLink();
//        ob.closeBrowser();
//


    }
}
