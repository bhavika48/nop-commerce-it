Feature: HomePage Test
  As user I want to verify page navigation

  @smoke
  Scenario: User should navigate to Login page successfully
    Given I am on HomePage page
    When I click on login link
    Then I should navigate to login page successfully

  @smoke
  Scenario: User should navigate to register page successfully
    Given I am on HomePage page
    When  I click on Register link
    Then  I should navigate to register page successfully