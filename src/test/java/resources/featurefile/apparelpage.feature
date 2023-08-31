Feature: ApparelMenu Test
  As user I want to verify Apparel page navigation

  Background: User should navigate to Apparel page successfully
    Given   I am on HomePage page
    And     I should click on "Apparel" Menu


  @smoke
  Scenario: User should navigate to shoes page successfully
    When    I should hoovering on shoes menu tab
    Then    I should navigate to shoes page successfully

    @smoke
    Scenario: User should navigate to clothing page successfully
      When    I should hoovering on clothing menu tab
      Then    I should navigate to clothing page successfully

  @smoke
  Scenario: User should navigate to accessories page successfully
    When    I should hoovering on accessories menu tab
    Then    I should navigate to accessories page successfully
