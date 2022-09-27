@calculate
Feature: Calculating Quote

  @calc
  Scenario: Calculating qoute
    When User in the page
    Then user input "19111" to the zipcode
    Then user will click on the option Own
    And user will click on less than one year
    Then click on continue