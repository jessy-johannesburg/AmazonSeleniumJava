# @BBCFeature
# Feature: 2023 Las Vegas Grand Prix Results

#   Background:
#     Given As a BBC editor launched the BBC Sport homepage

#   @racerPositions
#   Scenario: Validate top 3 finishers in the results table
#     When I clicked on Formula 1
#     Then I should be navigated to formula1 page
#     When I clicked on Results option
#     Then I should be navigated to Results page
#     When I selected the year
#     Then I should see Max Verstappen in first place
#     And I should see Charles Leclerc in second place
#     And I should see George Russell in third place

#   @searchResults
#   Scenario: Retrieve search results
#     When I clicked on search box
#     Then I should see serach input box
#     When I entered "<Search_Text>" as Sport in 2023 into the search bar
#     And I submitted the search
#     Then I should see at least 4 relevant search results

#     Examples:
#       | Search_Text   |
#       | Sport in 2023 |
