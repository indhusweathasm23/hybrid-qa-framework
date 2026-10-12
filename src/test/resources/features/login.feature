@smoke
Feature: Login

  Scenario: Valid user logs in
    Given user is on the login page
    When user logs in with "standard_user" and "secret_sauce"
    Then products page should be displayed

  Scenario: Locked user cannot login
    Given user is on the login page
    When user logs in with "locked_out_user" and "secret_sauce"
    Then error message should contain "locked out"