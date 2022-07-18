@search
Feature: Library app search feature
  User story:
    - As a user, I should be able to login as librarian. When I go to Users
    page, table
    should have following columns:
        • Actions
        • UserID
        • Full Name
        • Email
        • Group
        • Status

  Background: For the scenarios in the feature file, user is expected to be already logged in as a librarian
    Given user is on the login page
    When user enters username "librarian1@library", password "rs4BNN9G" and clicks sign-in Button

  Scenario: User should be able to see all following columns in Users page
    When user clicks on Users button
    Then user should see all the following columns
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |
