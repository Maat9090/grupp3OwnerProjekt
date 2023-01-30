
Feature:Saucedemo Add item and check the cart

    Scenario:Add item to the card
    Given I launch chrome browser
    When I open Saucedemo homepage
    Then I fill in username
    And  I fill in password
    And  I click one login
    And I verify that i am on the products page
    And I click one item
    And I verify that the page shows the item
    And I click add to the card
    And  I click on the card
    And I verify that the card page shows
    And I verify that item is in the card
    And I logout
    And close browser

