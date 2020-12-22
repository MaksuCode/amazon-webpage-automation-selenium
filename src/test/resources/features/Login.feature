@LoginTest
Feature: Login Test


  Scenario: Successfull login

    Given User goes to "homePage"
    And   Clicks login button
    Then  User sees mail address space
    And   Clicks mail address space
    And   User types email address
    And   Clicks keep on button
    Then  User sees password blank on the page
    And   User types password
    And   Clicks login submit button
    Then  User sees he is on the home page


