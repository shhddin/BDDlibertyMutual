@Homepage
Feature: In the homepage as a user i will check if some buttons are clickable.

  @autoQuote
  Scenario: Validate homepae buttons and get auto qoutes
    Given user is in the homepage to checks for buttons
    Then user get title "Only pay for what you need"
    And then select Auto
    Then user input 19111 to the zipcode
    And click the price button
    Then user will be in the "Access Denied" page
