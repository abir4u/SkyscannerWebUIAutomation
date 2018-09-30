Feature: Search
  As a Product Owner
  I want to ensure that user is able to search direct return flights between two international cities

  Scenario: Search for all direct flights including nearby airports options
    Given I am on Skyscanner website
    When I choose to search for a trip from AKL to SIN with Return on direct flights only
    And I specify the dates for departure and arrival of flight
    And I add nearby airports for both sides
    And I search for flights
    And I should be on the Flights Results page for the trip from AKL to SIN with Return on direct flights only
    Then I should see all available flights for my search

  Scenario: Validate if appropriate error message is displayed if there are no direct flights between two locations
    Given I am on Skyscanner website
    When I choose to search for a trip from CHC to PAT with Return on direct flights only
    And I specify the dates for departure and arrival of flight
    And I add nearby airports for both sides
    And I search for flights
    And I should be on the Flights Results page for the trip from CHC to PAT with Return on direct flights only
    Then I should be displayed with appropriate error message