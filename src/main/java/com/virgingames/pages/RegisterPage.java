package com.virgingames.pages;

import com.virgingames.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utilities {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy(xpath = "//div[@title='Your Details']")
    WebElement yourDetailsText;
    public String getYourDetailText(){ return getTextFromElement(yourDetailsText); }
}