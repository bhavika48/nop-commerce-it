package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContactUsFooterPage extends Utility {

    private static final Logger log = LogManager.getLogger(ContactUsFooterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Contact us')]")
    WebElement clickOnContactUs;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Contact Us')]")
    WebElement verifyContactLink;

    public void cilckOnContactUsTab(){
        clickOnElement(clickOnContactUs);
        log.info("Click On Contact Us Tab :"+ clickOnContactUs.toString());
    }
    public void verifyContactUsLink(){
        String expectedMessage = "Contact Us";
        String actualMessage = getTextFromElement(verifyContactLink);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Verify Message :" + verifyContactLink.toString());
    }

}
