@amazon
Feature: Launch Amazon website

Scenario: Launch amazon and verify text
Given I opened amazon website
Then I verify update location text
When I click on Everyday essentials
Then I should be able to see Grocery
When I click on Grocery
Then I should be able to see Grocery page