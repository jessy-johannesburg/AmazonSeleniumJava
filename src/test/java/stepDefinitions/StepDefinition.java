package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import base.Base;
import io.cucumber.java.en.Then;
import pageObjects.Objects;

import java.io.IOException;


public class StepDefinition extends Base {
    Objects objectsPage;

    public StepDefinition() {
        objectsPage = new Objects(driver);

    }
    @Given("I launch the URl")
    public void i_launch_the_URl() throws Throwable {
        driver.get("https://www.bbc.com/sport");
        driver.manage().window().maximize();
    }

    @When("I click on Formula 1")
    public void i_click_on_Formula_1() throws Throwable {
        objectsPage.clickOnFormula();
    }

    @Then("I should be navigated to formula page")
    public void i_should_be_navigated_to_formula_page() {
        objectsPage.headingVisible();
    }

    @When("I click on Results option")
    public void i_click_on_Results_option() throws Throwable {
        objectsPage.clickOnResults();
    }

    @Then("I should be navigated to Results page")
    public void i_should_be_navigated_to_Results_page() throws Throwable {
             objectsPage.resHeadingVisible();
    }

    @When("I select the year")
    public void i_select_the_year() throws Throwable {
        objectsPage.clickOnYear();
    }

    @Then("I should see Max Verstappen in first place")
    public void i_should_see_Max_Verstappen_in_first_place() throws Throwable {
        objectsPage.verifyFirstPosition();
    }

    @Then("I should see Charles Leclerc in second place")
    public void i_should_see_Charles_Leclerc_in_second_place() throws Throwable {
          objectsPage.verifySecondPosition();
    }

    @Then("I should see George Russell in third place")
    public void i_should_see_George_Russell_in_third_place() throws Throwable {
      objectsPage.verifyThirdPosition();
    }


}

