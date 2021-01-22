@Sorting_products
Feature: Sorting products

  Scenario Outline: Search for a product and add it to cart

    Given User goes to "homePage"
    And   User clicks search box
    And   User types "Mouse"
    And   User hits enter button
    Then  User sees he is on the products page
    And   User sets delivery type
#    And   User sorts results as '<sortType>'
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


  Scenario Outline: Sorting products with minium <lowestReviewStar> stars

    Given User goes to "homePage"
    And   User clicks search box
    And   User types "Mouse"
    And   User hits enter button
    Then  User sees he is on the products page
    And   User sorts products with minimum '<lowestReviewStar>' stars
    Then  User checks if all of the products have minimum '<lowestReviewStar>' stars

    Examples:
      | lowestReviewStar |
      |        4         |
      |        3         |
      |        2         |
      |        1         |