@amazon
Feature: Launch Amazon website

Scenario: Launch amazon and verify text
Given I opened amazon website
Then I verify update location text
When I click on Everyday essentials
Then I should be able to see Grocery
When I click on Grocery
Then I should be able to see Grocery page
When I select the product 
Then I should be navigated to product details page
When I click on add to cart button
Then I should be able to see the product in cart
