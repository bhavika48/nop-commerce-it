Feature: HomePage Test
  As user I want to verify page navigation

  @smoke
  Scenario: User should navigate to electronics page successfully
    Given I am on HomePage page
    When I click on electronics link
    Then I should navigate to electronics page successfully