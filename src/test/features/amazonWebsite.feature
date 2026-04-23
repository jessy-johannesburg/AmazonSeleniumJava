@amazon
Feature: Launch Amazon website
Background: 
Given I opened amazon website

Scenario: Launch amazon and verify text
Then I verify update location text

Scenario: Navigate to grocery and add product to cart
When I click on Everyday essentials
Then I should be able to see Groceries
When I click on Groceries
Then I should be navigated to Grocery page
When I select the product 
Then I should be navigated to product details page
When I click on add to cart button
Then I should be able to see the product in cart
And I verify the product price is "29"
When I click on Proceed to checkout button
Then I should be navigated to sign in page
