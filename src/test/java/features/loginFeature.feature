# Created by trank at 11/24/2024
Feature: Test the login functionality of OrangeHRM
  # Enter feature description here

#  Scenario: Test the valid login
#    Given user is on loginPage
#    When user enters "Admin" and "admin123"
#    And click on login button
#    Then user should land on home page

  Scenario Outline: Test the valid login
    Given user is on loginPage
    When user enters <username> and <password>
    And click on login button
    Then user should land on home page

    Examples:
      | username | password  |
      | Admin    | admin123  |
      | Admin1   | admin1234 |
      | Admin2   | admin1235 |