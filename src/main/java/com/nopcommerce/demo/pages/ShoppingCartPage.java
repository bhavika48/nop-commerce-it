package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ShoppingCartPage extends Utility {
    public static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());
    public ShoppingCartPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shopppingCartText;

    public void clickOnShoppingCartLink(){
        driver.findElement((By) shoppingCartLink).click();
    }

    public void verifyShoppingCartText(){
        String expectedText = "Shopping cart";
        String actualText = driver.findElement((By) shopppingCartText).getText();
        Assert.assertEquals(actualText,expectedText,"Shopping cart page not found");
    }
}
