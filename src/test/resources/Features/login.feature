Feature: To validate login functionality of Jeanswest application

  Background: 
    Given user need to be in home page

  Scenario: To validate login with valid username and password
    When user need to click on login page
    And user should enter valid username and password
    And user should click login button
    Then user will navigate to credential page
