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
    @FindBy(linkText = "Appar")
    WebElement apparelLink;

    @CacheLookup
    @FindBy(linkText = "Shoes")
    WebElement shoesLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shoes')]")
    WebElement verifyShoesText;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Clothing'][normalize-space()='Clothing']")
    WebElement clothingLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Clothing')]")
    WebElement verifyTextClothing;

<<<<<<< Updated upstream
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Accessories'][normalize-space()='Accessories']")
    WebElement accessoriesLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Accessories')]")
    WebElement verifyTextAccessories;

=======
    public void setApparelLink()
    {
        log.info("Clicking on ApparelMenu " + apparelLink.toString());
        clickOnElement(apparelLink);
    }
>>>>>>> Stashed changes

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
        log.info("Verify Text  Shoes " + verifyShoesText.toString());
    }

    public void setClothingLink()
    {
        log.info("MouseHover on Clothing " + clothingLink.toString());
        mouseHoverToElementAndClick(clothingLink);
    }

    public void setVerifyTextClothingText()
    {
        String expectedMessage = "Clothing";
        String actualMessage = getTextFromElement(verifyTextClothing);
        Assert.assertEquals(actualMessage,expectedMessage);
        log.info("Verify Text  Clothing " + verifyTextClothing.toString());
    }

    public void setAccessoriesLink()
    {
        log.info("MouseHover On Accessories " + accessoriesLink.toString());
        mouseHoverToElementAndClick(accessoriesLink);
    }

    public void setVerifyTextAccessories()
    {
        String expectedMessage = "Accessories";
        String actualMessage = getTextFromElement(verifyTextAccessories);
        Assert.assertEquals(actualMessage,expectedMessage);
        log.info("Verify Text Accessories " + verifyTextAccessories.toString());
    }
}
