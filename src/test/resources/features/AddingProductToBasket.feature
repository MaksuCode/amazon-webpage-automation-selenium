@Add_Product_To_Basket
Feature: Adding product to basket

  Scenario: Add a product to basket

    Given User goes to product
    And   User clicks add to cart button
    Then  User sees "1" count on the basket
