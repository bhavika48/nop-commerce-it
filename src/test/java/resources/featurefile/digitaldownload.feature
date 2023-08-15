Feature: HomePage Test
  As user I want to verify page navigation

  @Sanity
  Scenario: User should navigate to Login page successfully
    Given I am on HomePage page
    When I click on Digital Download link
    Then I should navigate to Digital Download successfully