package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ApparelPage extends Utility
{
    private static final Logger log = LogManager.getLogger(ApparelPage.class.getName());

    public ApparelPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(linkText = "Shoes")
    WebElement shoesLink;

    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement verifyShoesText;



    public void setShoesLink()
    {
        log.info("MouseHover on ShoesMenu " + shoesLink.toString());
        mouseHoverToElementAndClick(shoesLink);
    }

    public void setVerifyShoesText()
    {
        String expectedMessage = "Shoes";
        String actualMessage = getTextFromElement(verifyShoesText);
        Assert.assertEquals(actualMessage,expectedMessage);
    }

}
