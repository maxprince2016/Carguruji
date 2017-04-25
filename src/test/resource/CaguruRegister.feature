#Author: FElad
Feature: Carguruji Test

  Scenario: As a new carguruji user I want to create an account
    Given I am on carguruji HomePage
    And I click My Account button
    And I click countinue button
    When I tick gender option
    And I fill all the mandatory fileds
    And I click the continue link
    Then I see my account has been created
    And I close the browser
