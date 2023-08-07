package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BookPage extends Utility
{
    private static final Logger log = LogManager.getLogger(BookPage.class.getName());

    public BookPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Books')]")
    WebElement verifyBookText;

    public void verifyBookText()
    {
        String expectedMessage = "Books";
        String actualMessage = getTextFromElement(verifyBookText);
        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
