Feature: Cart


  @item
  Scenario: Add item to the cart
    Given User is on HomePage
    When User clicks on Login icon
    And User enters correct data
    And User clicks on Anmelden button
    And User clicks on first category
    And User clicks on first item
    And User adds item to cart
    And User clicks on Zum Warenkorb button
    Then User verifies item name is in the cart




