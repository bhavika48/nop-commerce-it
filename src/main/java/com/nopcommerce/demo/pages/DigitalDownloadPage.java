package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DigitalDownloadPage extends Utility {
    private static final Logger log = LogManager.getLogger(DigitalDownloadPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Digital downloads')]")
    WebElement digitalDownloadText;

    public String getDigitalDownloadText() {
        log.info("Get text of Digital Download page : " + digitalDownloadText.toString());
        return getTextFromElement(digitalDownloadText);
    }
}
