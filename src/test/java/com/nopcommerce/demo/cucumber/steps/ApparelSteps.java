package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ApparelPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApparelSteps
{
    @When("^I should click on \"([^\"]*)\" Menu$")
    public void iShouldClickOnMenu(String apparel)
    {
        new HomePage().clickOnMenuTab(apparel);
    }


    @Then("^I should hoovering on shoes menu tab$")
    public void iShouldHooveringOnShoesMenuTab()
    {
        new ApparelPage().setShoesLink();
    }

    @And("^I should navigate to Apparel page successfully$")
    public void iShouldNavigateToApparelPageSuccessfully()
    {
        new ApparelPage().setVerifyShoesText();
    }
}
