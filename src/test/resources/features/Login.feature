Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.

  Accounts are: librarian, student

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page

  @librarian
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    And user clicks signIn button
    Then user should see the user avatar

  @student
  Scenario: Login as student
    When user enters student username
    And user enters student password
    And user clicks signIn button
    Then user should see the user avatar






