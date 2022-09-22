
Feature: In the homepage as a user i will check if some buttons are clickable. also i will be able to use the calculate
  features from the website.
@autoLib
  Scenario: Validate homepae buttons and get auto qoutes
    Given user is in the homepage to checks for buttons
    Then user will try to get auto qoute
@calc
  Scenario: 
    When click calculator
    Then user will land on calculation page and user will input zipcode 19111
    Then user will click on the option Own
    And user will click on less than one year
    Then click on continue 
