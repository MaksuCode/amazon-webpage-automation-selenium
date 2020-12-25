@Add_Product_To_Basket
Feature: Adding product to cart

  Scenario: Add a product to cart

    Given User goes to product
    And   User clicks add to cart button
    Then  User sees "1" count on the basket

  Scenario: Search for a product and add it to cart

    Given User goes to "homePage"
    And   User clicks search box
    And   User types "search word"
    And   User hits enter button
    Then  User sees he is on the products page
    And   User clicks a product
    Then  User sees he is on the product page
    And   User clicks add to cart button
    Then  User sees "1" count on the basket