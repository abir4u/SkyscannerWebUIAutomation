$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "As a Product Owner\nI want to ensure that user is able to search direct return flights between two international cities",
  "id": "search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20399994589,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Search for all direct flights including nearby airports options",
  "description": "",
  "id": "search;search-for-all-direct-flights-including-nearby-airports-options",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Skyscanner website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I choose to search for a trip from AKL to SIN with Return on direct flights only",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I specify the dates for departure and arrival of flight",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I add nearby airports for both sides",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I search for flights",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should be on the Flights Results page for the trip from AKL to SIN with Return on direct flights only",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should see all available flights for my search",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmASkyscannerUser()"
});
formatter.result({
  "duration": 83474204,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AKL to SIN with Return on direct flights only",
      "offset": 35
    }
  ],
  "location": "MyStepdefs.iChooseTheAirports(String)"
});
formatter.result({
  "duration": 2233367442,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAddFlightDates()"
});
formatter.result({
  "duration": 2033477569,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAddNearbyAirportsForBothSidess()"
});
formatter.result({
  "duration": 518502742,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSearchForFlights()"
});
formatter.result({
  "duration": 3020748472,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AKL to SIN with Return on direct flights only",
      "offset": 58
    }
  ],
  "location": "MyStepdefs.iShouldBeOnResultsPage(String)"
});
formatter.result({
  "duration": 57968331817,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSeeAllAvailableFlights()"
});
formatter.result({
  "duration": 172533856,
  "status": "passed"
});
formatter.after({
  "duration": 837456825,
  "status": "passed"
});
formatter.before({
  "duration": 7144306989,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Validate if appropriate error message is displayed if there are no direct flights between two locations",
  "description": "",
  "id": "search;validate-if-appropriate-error-message-is-displayed-if-there-are-no-direct-flights-between-two-locations",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I am on Skyscanner website",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I choose to search for a trip from CHC to PAT with Return on direct flights only",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I specify the dates for departure and arrival of flight",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I add nearby airports for both sides",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I search for flights",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should be on the Flights Results page for the trip from CHC to PAT with Return on direct flights only",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should be displayed with appropriate error message",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmASkyscannerUser()"
});
formatter.result({
  "duration": 8301872,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CHC to PAT with Return on direct flights only",
      "offset": 35
    }
  ],
  "location": "MyStepdefs.iChooseTheAirports(String)"
});
formatter.result({
  "duration": 1940301997,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAddFlightDates()"
});
formatter.result({
  "duration": 2174596324,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAddNearbyAirportsForBothSidess()"
});
formatter.result({
  "duration": 559273263,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSearchForFlights()"
});
formatter.result({
  "duration": 4215109024,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CHC to PAT with Return on direct flights only",
      "offset": 58
    }
  ],
  "location": "MyStepdefs.iShouldBeOnResultsPage(String)"
});
formatter.result({
  "duration": 18240278366,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSeeAptErrorMessage()"
});
formatter.result({
  "duration": 163033913,
  "status": "passed"
});
formatter.after({
  "duration": 705532098,
  "status": "passed"
});
});