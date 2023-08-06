Feature: ApparelMenu Test
  As user I want to verify Apparel page navigation

  @smoke
  Scenario: User should navigate to Apparel page successfully
    Given   I am on HomePage page
    When    I should click on "Apparel" Menu
    Then    I should hoovering on shoes menu tab
    And     I should navigate to Apparel page successfully