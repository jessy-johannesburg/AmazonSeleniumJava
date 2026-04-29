@userapi
Feature: Verify user details from JSON Placeholder API

  Scenario: Get user details
    Given I hit the api endpoint
    Then I should receive a response with status code 200
    Then I should see the user id 
    Then I should see the user name 
    Then I should see the user email
    And I should see the user address 

    
      