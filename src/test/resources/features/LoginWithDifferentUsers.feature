Feature: Library app login feature
  User Story:
  As a user, I should be able to login with different users using their
  correct emails and passwords. When I login, I should be able to
  see username in the account username section.

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page

  Scenario Outline: Login with different credentials
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks signIn button
    Then user should see username in the account section

    Examples: valid credentials we are going to be using in this scenario is as below
      | username           | password |
      | student1@library   | i2A9TgXa |
      | librarian1@library | rs4BNN9G |
      | librarian2@library | eb2VQKEj |
      | librarian5@library | 4p4ewVgW |
      | student14@library  | qm1WHunW |
      | student15@library  | b9lGbkc9 |


