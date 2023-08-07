package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ElectronicsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ElectronicsSteps {
    @When("^I click on electronics link$")
    public void iClickOnElectronicsLink() {
        new ElectronicsPage().clickOnElectronicsLink();
    }

    @Then("^I should navigate to electronics page successfully$")
    public void iShouldNavigateToElectronicsPageSuccessfully() {
        String expectedMessage = "Electronics";
        String actualMessage = new ElectronicsPage().getElectronicPageTitle();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
