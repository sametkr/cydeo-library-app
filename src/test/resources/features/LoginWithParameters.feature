@withParameters
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.

  Accounts are: librarian, student

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page

  @librarian
  Scenario: Login as librarian
    When user enters username "librarian1@library"
    And user enters password "rs4BNN9G"
    And user clicks sign-in button
    Then user should see the user avatar

  @student
  Scenario: Login as student
    When user enters username "student1@library"
    And user enters password "i2A9TgXa"
    And user clicks sign-in button
    Then user should see the user avatar

  @oneStep
  Scenario: Login as librarian
    When user enters username "librarian1@library", password "rs4BNN9G" and clicks sign-in Button
    Then user should see the user avatar
