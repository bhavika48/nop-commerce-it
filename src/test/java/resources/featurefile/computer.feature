Feature: HomePage Test
  As user I want to verify page navigation

  @smoke
  Scenario: User should navigate to Login page successfully
    Given I am on HomePage page
    When I click on Computer link
    Then I should navigate to Computer page successfully