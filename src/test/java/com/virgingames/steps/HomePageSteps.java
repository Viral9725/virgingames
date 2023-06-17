package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.OnlineSlotsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageSteps {

    @Given("^I am on home page \"([^\"]*)\"$")
    public void iAmOnHomePage(String expectedUrl) {
        Assert.assertEquals("User is not on homepage", expectedUrl, new HomePage().getTheCurrentUrl());
        new HomePage().clickOnAcceptCookiesButton();
    }

    @When("^I click on login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLoginLink();
    }

    @When("^I click on join now tab$")
    public void iClickOnJoinNowTab() {
        new HomePage().clickOnJoinNow();
    }


    @When("^I click on online slots tab$")
    public void iClickOnOnlineSlotsTab() {
        new HomePage().clickOnlineSlotsTab();
    }



    @Then("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String expectedWelcomeToVirginGames)  {
        Assert.assertEquals("Welcome to Virgin Games message not displayed", expectedWelcomeToVirginGames, new OnlineSlotsPage().getWelcomeToVirginGamesText());
    }


    @Then("^I should be on login-page \"([^\"]*)\"$")
    public void iShouldBeOnLoginPage(String expectedUrl )  {
        Assert.assertEquals("User is not on login page", expectedUrl, new HomePage().getTheCurrentUrl());

    }

    @Then("^I should be able to see \"([^\"]*)\" url$")
    public void iShouldBeAbleToSeeUrl(String expectedUrl )  {
        Assert.assertEquals("User is not on registration page", expectedUrl, new HomePage().getTheCurrentUrl());

    }
}
