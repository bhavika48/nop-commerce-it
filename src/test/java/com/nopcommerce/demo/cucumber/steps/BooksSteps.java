package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.BookPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BooksSteps
{

    @When("^I should hoovering on \"([^\"]*)\" Menu$")
    public void iShouldHooveringOnMenu(String book)
    {
        new HomePage().clickOnMenuTab(book);
    }

    @Then("^I should navigate to Book page successfully$")
    public void iShouldNavigateToBookPageSuccessfully()
    {
        new BookPage().verifyBookText();
    }


}