package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ComputerSteps {

        @When("^I click on Computer link$")
        public void iClickOnComputerLink() {
            new HomePage().clickOnComputersMenu();
        }

        @Then("^I should navigate to Computer page successfully$")
        public void iShouldNavigateToComputerPageSuccessfully() {
            String expectedMessage = "Computers";
            String actualMessage = new ComputerPage().getComputerText();
            Assert.assertEquals(actualMessage,expectedMessage, "Computer page not displayed");
        }

}
