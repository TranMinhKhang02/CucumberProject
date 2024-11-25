# Created by trank at 11/24/2024
Feature: Test the login functionality of OrangeHRM using DataTable
  # Enter feature description here

  Scenario: Test the valid login using DataTable
    Given user is on loginPage
    When user enters credentials using DataTable
      | Admin | admin123 |
    And click on login button
    Then user should land on home page