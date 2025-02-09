@All_Scenarios
Feature: Login to NopCommerce
  Author: Suthir

  Scenario Outline: NopCommerce application login
    Given User is on the NOP Commerce login page
    When User should login with "<Email>" and "<Password>"
    And User clicks the remember me button
    And User clicks the login button

    Examples: 
      | Email                                  | Password    |
      | suthirshana.muniyappan@expleogroup.com | Suthir@2024 |