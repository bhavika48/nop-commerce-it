Feature: Shopping cart link test
  As a user I should navigate to shopping cart and verify the page

  @smoke
  Scenario: User should be able to navigate to shopping cart link
    Given I am on HomePage page
    When I click on shopping cart link
    Then I should navigate to shopping cart page and verify the page
