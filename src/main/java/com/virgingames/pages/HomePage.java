package com.virgingames.pages;

import com.virgingames.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utilities {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String getTheCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='option']/label[@for='privacy_pref_optin']")
    WebElement acceptCookiesButton;

    public void clickOnAcceptCookiesButton() {
        clickOnElement(acceptCookiesButton);
        log.info("Clicking on accept cookies button : " + acceptCookiesButton.toString());
    }

    @CacheLookup
    @FindBy(linkText = "Login")
    WebElement loginLink;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Join Now')]")
    WebElement joinNow;

    public void clickOnJoinNow() {
        clickOnElement(joinNow);
        log.info("Clicking on join now : " + joinNow.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[@id='styledApp']/div[1]/div[1]/ul[1]/li[1]/a[1]")
    //  @FindBy(xpath = "//h1[contains(text(),'Play Online Slots at Virgin Games')]")
    WebElement onlineSlots;

    public String clickOnlineSlotsTab() {
        return getTextFromElement(onlineSlots);
    }
}

