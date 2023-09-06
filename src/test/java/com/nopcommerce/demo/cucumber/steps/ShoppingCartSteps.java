package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ShoppingCartPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShoppingCartSteps {

    @When("^I click on shopping cart link$")
    public void iClickOnShoppingCartLink() {
        new ShoppingCartPage().clickOnShoppingCartLink();
    }

    @Then("^I should navigate to shopping cart page and verify the page$")
    public void iShouldNavigateToShoppingCartPageAndVerifyThePage() {
        new ShoppingCartPage().verifyShoppingCartText();
    }
}
