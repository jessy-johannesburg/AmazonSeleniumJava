
Feature: 2023 Las Vegas Grand Prix Results
  @abcd
  Scenario: Validate top 3 finishers in the results table
    Given I launch the URl
    When I click on Formula 1
    Then I should be navigated to formula page
    When I click on Results option
    Then I should be navigated to Results page
    When I select the year
    Then I should see Max Verstappen in first place
    And I should see Charles Leclerc in second place
    And I should see George Russell in third place