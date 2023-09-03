package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ContactUsFooterPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsSteps {

    @When("^I click on Contact Us Footer tab$")
    public void iClickOnContactUsFooterTab() {
      new ContactUsFooterPage().cilckOnContactUsTab();
    }
    @Then("^I navigate to Contact Page successfully$")
    public void iNavigateToContactPageSuccessfully() {
        new ContactUsFooterPage().verifyContactUsLink();
    }
}
