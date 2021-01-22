@Add_Product_To_Cart
Feature: Adding product to cart Test Scenarios

  Scenario: Add a product to cart

    Given User goes to product
    And   User clicks add to cart button
    Then  User sees "1" count on the basket

  Scenario Outline: Search for a product and add it to cart

#  Search for a product and add it to cart
    Given User goes to "homePage"
    And   User clicks search box
    And   User types "Mouse"
    And   User hits enter button
    Then  User sees he is on the products page
    And   User sets delivery type
    And   User sorts results as '<sortType>'
    And   User checks if the products sorted according to '<sortType>'
    And   User clicks a product
    And   User sets 1 product quantity
    Then  User sees he is on the product page
    And   User clicks add to cart button
    Then  User sees "2" count on the basket
    And   User clicks cart

    Examples:
    |        sortType           |
    |    lowest price first     |
    |    highest price first    |
    |    customer comments      |
    |      newest products      |