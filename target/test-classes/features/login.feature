Feature: Login Functionality

  @smoke
  Scenario: Valid Credentials
    When User enters the username and password
    And User clicks on login button
    Then User successfully logged in