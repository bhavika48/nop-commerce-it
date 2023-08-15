package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.JewelleryPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JewellerySteps {

    @When("^I click on Jewellery tab$")
    public void iClickOnJewelleryTab() {

        new JewelleryPage().clickOnJewellery();
    }
    @Then("^I navigate to Jewellery page successfully$")
    public void iNavigateToJewelleryPageSuccessfully() {

         new JewelleryPage().verifyJewellery();
    }
}
