Feature: Adding skills Functionality
  Background:
    When User enters the username and password
    And User clicks on login button

    @smoke
    Scenario: Adding employee skill
      When Admin clicks on Admin
      And Admin clicks on Qualification
      When Admin selects skills option
      And Admin clicks on add button
      And Admin enters the "Leadership" and "Excellent performance"
      And Admin clicks on save Button
      Then Admin verifies it