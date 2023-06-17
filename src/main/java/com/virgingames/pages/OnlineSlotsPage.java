package com.virgingames.pages;

import com.virgingames.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineSlotsPage extends Utilities {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public OnlineSlotsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome to Virgin Games')]")
    WebElement welcomeToVirginGamesText;

    public String getWelcomeToVirginGamesText() {
        return getTextFromElement(welcomeToVirginGamesText);
    }
}
