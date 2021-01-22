@Add_Product_To_Cart
Feature: Adding product to cart Test Scenarios

  Scenario: Going directly to product and adding to cart

    Given User goes to product
    And   User clicks add to cart button
    Then  User sees "1" count on the basket

  Scenario: Search for a product and adding to cart

    Given User goes to "homePage"
    And   User clicks search box
    And   User types "Mouse"
    And   User hits enter button
    Then  User sees he is on the products page
    And   User clicks a product
    And   User sets 1 product quantity
    Then  User sees he is on the product page
    And   User clicks add to cart button
    Then  User sees "2" count on the basket
    And   User clicks cart
