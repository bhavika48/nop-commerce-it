package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ApparelPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApparelSteps
{
    @And("^I should click on \"([^\"]*)\" Menu$")
    public void iShouldClickOnMenu(String apparel)
    {
        new HomePage().clickOnMenuTab(apparel);
    }


    @When("^I should hoovering on shoes menu tab$")
    public void iShouldHooveringOnShoesMenuTab()
    {
        new ApparelPage().setShoesLink();
    }

    @Then("^I should navigate to shoes page successfully$")
    public void iShouldNavigateToShoesPageSuccessfully()
    {
        new ApparelPage().setVerifyShoesText();
    }


    @When("^I should hoovering on clothing menu tab$")
    public void iShouldHooveringOnClothingMenuTab()
    {
        new ApparelPage().setClothingLink();
    }


    @Then("^I should navigate to clothing page successfully$")
    public void iShouldNavigateToClothingPageSuccessfully()
    {
        new ApparelPage().setVerifyTextClothingText();
    }

    @When("^I should hoovering on accessories menu tab$")
    public void iShouldHooveringOnAccessoriesMenuTab()
    {
        new ApparelPage().setAccessoriesLink();
    }

    @Then("^I should navigate to accessories page successfully$")
    public void iShouldNavigateToAccessoriesPageSuccessfully()
    {
        new ApparelPage().setVerifyTextAccessories();
    }
}
