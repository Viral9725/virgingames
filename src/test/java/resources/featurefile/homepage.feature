Feature: Homepage functionality
  As a user, I should be able to see the VirginGames homepage

  @smoke @regression
  Scenario: User should be able to click on Login button and go to login page
    Given I am on home page "https://www.virgingames.com/"
    When  I click on login button
    Then  I should be on login-page "https://www.virgingames.com/quick-login"

  @smoke @sanity
  Scenario: User should be able to click on join now button and go to register page
    Given I am on home page "https://www.virgingames.com/"
    When I click on join now tab
    Then I should be able to see "https://www.virgingames.com/onboarding/register" url

  @smoke @sanity@regression
  Scenario: User should be able to click on online slots button and go to online slots page
    Given I am on home page "https://www.virgingames.com/"
    When I click on online slots tab
    Then I should see "Welcome to Virgin Games"
  #  Then I should see "Play Online Slots at Virgin Games" text
