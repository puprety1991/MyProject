Feature: Adding skills Functionality
  Background:
    When User enters the username and password
    And User clicks on login button


    @smoke @addSkill
    Scenario: Adding employee skill
      When Admin clicks on Admin
      And Admin clicks on Qualification
      When Admin selects skills option
      And Admin clicks on add button
      And Admin enters the "Leadership" and "Excellent performance"
      And Admin clicks on save Button
      Then Admin verifies it

  @smoke @addEmpSkill
  Scenario:Providing skills of employees
    When admin clicks on PIM option
    When Admin clicks on employee list
    And Admin clicks on employee id "52399A"
    When Admin clicks on Qualification option
    And Admin clicks on skills add button
    When Admin verify the drop down is enabled and select the value "Leadership"
    And Admin verify experience textbox and comments text box and enter the values "5" and "he is excellent player"
    And admin click on save button
    Then Admin verifies entered data