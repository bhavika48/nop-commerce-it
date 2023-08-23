package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.GiftCardsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GiftCardsSteps {
    @When("^I click on Gift Cards menu$")
    public void iClickOnGiftCardsMenu() {
        new GiftCardsPage().clickOnGiftCardsLink();
    }

    @Then("^I should navigate to Gift-Cards page successfully$")
    public void iShouldNavigateToGiftCardsPageSuccessfully() {
        String expectedMessage="Gift Cards";
        String actualMessage=new GiftCardsPage().getGiftCardsPageTitle();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

}
