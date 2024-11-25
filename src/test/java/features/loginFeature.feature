# Created by trank at 11/24/2024
Feature: Test the login functionality of OrangeHRM
  # Enter feature description here

  Scenario: Test the valid login
    Given user is on loginPage
    When user enters username and password
    And click on login button
    Then user should land on home page