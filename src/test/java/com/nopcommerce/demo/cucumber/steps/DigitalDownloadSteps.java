package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.DigitalDownloadPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class DigitalDownloadSteps {


    @Then("^I should navigate to Digital Download successfully$")
    public void iShouldNavigateToDigitalDownloadSuccessfully() {
        String expectedMessage = "Digital downloads ";
        String actualMessage = new DigitalDownloadPage().getDigitalDownloadText();
        Assert.assertEquals(actualMessage,expectedMessage, "Digital Download page not displayed");
    }

    @When("^I click on Digital Download link$")
    public void iClickOnDigitalDownloadLink() {
        new HomePage().clickOnDigitalDownloadMenu();
    }
}
