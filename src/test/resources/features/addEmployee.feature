Feature: Adding employee Functionality
  Background:
    When User enters the username and password
    And User clicks on login button

    @excel
    Scenario: adding employees to using excel file
      When admin clicks on PIM option
      And admin clicks on add Employee Option
      When admin add multiple employees from excel using "Sheet1"
      Then admin verifies it

