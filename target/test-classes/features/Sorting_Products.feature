@Sorting_products
Feature: Sorting products

  Scenario Outline: Search for a product and sort it as needed

    Given User goes to "homePage"
    And   User clicks search box
    And   User types "Mouse"
    And   User hits enter button
    Then  User sees he is on the products page
    And   User sets delivery type
#    And   User sorts results as '<sortType>'
    And   User checks if the products sorted according to '<sortType>'

    Examples:
      |        sortType           |
      |    lowest price first     |
      |    highest price first    |
      |    customer comments      |
      |      newest products      |


  Scenario Outline: Filtering products with minium <lowestReviewStar> stars

    And   User sorts products with minimum '<lowestReviewStar>' stars
    Then  User checks if all of the products have minimum '<lowestReviewStar>' stars

    Examples:
      | lowestReviewStar |
      |        4         |
      |        3         |
      |        2         |
      |        1         |

   Scenario: Filtering products with maximum value

     And  User sets maximum '99' value on the products page
     Then User checks if all of the products have maximum '99' value