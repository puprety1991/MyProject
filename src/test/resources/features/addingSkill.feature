Feature: Adding skills to Employee Functionality
  Background:
    When User enters the username and password
    And User clicks on login button
    When admin clicks on PIM option
    @smoke @addEmpSkill
    Scenario:Providing skills of employees
      When Admin clicks on employee list
      And Admin clicks on employee id "	52399A"
      When Admin clicks on Qualification option
      And Admin clicks on skills add button
      When Admin verify the drop down is enabled and select the value "Leadership"
      And Admin verify experience textbox and comments text box and enter the values "5" and "he is excellent player"
      And admin click on save button
      Then Admin verifies entered data