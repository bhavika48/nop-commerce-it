package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GiftCardsPage extends Utility {
    private static final Logger log = LogManager.getLogger(GiftCardsPage.class.getName());

    public GiftCardsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Gift Cards")
    WebElement giftCardsLink;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Gift Cards']")
    WebElement giftCardsPageTitle;


    public void clickOnGiftCardsLink() {
        clickOnElement(giftCardsLink);
        log.info("Clicking on login link : " + giftCardsLink.toString());
    }

    public String getGiftCardsPageTitle() {
        log.info("Clicking on login link : " + giftCardsLink.toString());
        return getTextFromElement(giftCardsPageTitle);
    }

}
