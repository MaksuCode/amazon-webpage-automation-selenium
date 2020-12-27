@Add_Product_To_Basket
Feature: Adding product to cart

  Scenario: Add a product to cart

    Given User goes to product
    And   User clicks add to cart button
    Then  User sees "1" count on the basket

  Scenario: Search for a product and add it to cart

    Given User goes to "homePage"
    And   User clicks search box
    And   User types "Mouse"
    And   User hits enter button
    Then  User sees he is on the products page
    And   User sets delivery type
    And   User sorts results as "lowest price first"
    And   User accepts cookies if exist
    And   User clicks a product
    And   User sets 2 product quantity
    Then  User sees he is on the product page
    And   User clicks add to cart button
    Then  User sees "3" count on the basket
    And   User clicks cart