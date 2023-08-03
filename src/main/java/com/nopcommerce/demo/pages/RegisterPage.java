package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement verifyRegisterLink;

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyRegisterLink() {
        String expectedMessage = "Register";
        String actualMessage = getTextFromElement(verifyRegisterLink);
        Assert.assertEquals(expectedMessage, actualMessage);
        log.info("Verify Register message " + verifyRegisterLink);
    }
}
