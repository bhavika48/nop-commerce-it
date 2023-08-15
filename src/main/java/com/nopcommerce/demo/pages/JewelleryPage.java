package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class JewelleryPage extends Utility {


    private static final Logger log = LogManager.getLogger(JewelleryPage.class.getName());

    public JewelleryPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")
    WebElement clickJewellery;

    public void clickOnJewellery(){

        log.info("Click on Jewellery :" + clickJewellery);
        clickOnElement(clickJewellery);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Jewelry']")
    WebElement verifyJewellery;

    public void verifyJewellery(){

        log.info("Verify Jewellery " + verifyJewellery.toString());
        String expectedMessage ="Jewelry";
        String actualMessage = getTextFromElement(verifyJewellery);
        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
