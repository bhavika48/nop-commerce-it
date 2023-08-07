package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage  extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ElectronicsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Electronics")
    WebElement electronicsLink;


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Electronics']")
    WebElement electronicsTitle;



    public void clickOnElectronicsLink(){
        log.info("Clicking on electronics link : " + electronicsLink.toString());
        clickOnElement(electronicsLink);

    }

    public String getElectronicPageTitle(){
        log.info("Verifying electronics Title : " + electronicsTitle.toString());
      return getTextFromElement(electronicsTitle);
    }

}

