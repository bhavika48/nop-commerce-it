package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class RegisterSteps {


        @Then("^I should navigate to register page successfully$")
        public void iShouldNavigateToRegisterPageSuccessfully() {

          new RegisterPage().verifyRegisterLink();
        }
    }

