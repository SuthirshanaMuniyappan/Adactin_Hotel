@All_Scenarios
Feature: Product Search

  Scenario: Validating product search and AddToCard
    Given User should be in NopCommerce home page
    When User navigate to Apparel and select shoes
    And User select the shoe model and press add to card
    Then User select size and colour