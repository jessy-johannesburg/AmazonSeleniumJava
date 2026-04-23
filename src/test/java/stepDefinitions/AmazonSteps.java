package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.*;

import static base.Base.driver;

public class AmazonSteps {
    Homepage homePage;
    Grocerypage grocerypage;
    Addtocartpage addtocartpage;
    Proddetailspage proddetailspage;
    Checkoutpage checkoutpage;

    public AmazonSteps() {
        homePage = new Homepage(driver);
        grocerypage = new Grocerypage(driver);
        addtocartpage = new Addtocartpage(driver);
        proddetailspage = new Proddetailspage(driver);
        checkoutpage = new Checkoutpage(driver);

    }
    @Given("I opened amazon website")
    public void iOpenedAmazonWebsite() {
        driver.get("https://www.amazon.co.za/");
        driver.manage().window().maximize();
    }

    @Then("I verify update location text")
    public void iVerifyUpdateLocationText() {
        homePage.verifyAndClickHomePageText();
    }

    @When("I click on Everyday essentials")
    public void iClickOnEverydayEssentials() {
        homePage.clickMenuText();
    }

    @Then("I should be able to see Groceries")
    public void iShouldBeAbleToSeeGroceries() {
        homePage.groceriesVisible();
    }

    @When("I click on Groceries")
    public void iClickOnGroceries() {
        homePage.clickGroceries();
    }

    @Then("I should be navigated to Grocery page")
    public void iShouldBeNavigatedToGroceryPage() {
        grocerypage.groceryTxtVisible();
    }

    @When("I select the product")
    public void iSelectTheProduct() {
        grocerypage.selectProduct();
    }

    @Then("I should be navigated to product details page")
    public void iShouldBeNavigatedToProductDetailsPage() {
        proddetailspage.verifyNavigationToPrdDetailsPage();
    }

    @When("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        addtocartpage.clickAddToCart();
    }

    @Then("I should be able to see the product in cart")
    public void iShouldBeAbleToSeeTheProductInCart() {
        addtocartpage.selectedProdIsInCart();
    }

    @And("I verify the product price is {string}")
    public void iVerifyTheProductPriceIs(String arg0) {
        addtocartpage.verifyProdPrice();
    }

    @When("I click on Proceed to checkout button")
    public void iClickOnProceedToCheckoutButton() {
        checkoutpage.clickCheckoutBtn();
    }

    @Then("I should be navigated to sign in page")
    public void iShouldBeNavigatedToSignInPage() {
        checkoutpage.verifySignInPage();
    }
}
