Feature: BookMenu Test
  As user I want to verify page navigation

  @smoke
  Scenario: User should navigate to Book page successfully
    Given   I am on HomePage page
    When    I should hoovering on "Book" Menu
    Then    I should navigate to Book page successfully