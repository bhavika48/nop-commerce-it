package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.JewelleryPage;
import cucumber.api.java.en.When;

public class JewellerySteps {

    @When("^I click on Jewellery tab$")
    public void iClickOnJewelleryTab() {

        new JewelleryPage().clickOnJewellery();
    }
}
