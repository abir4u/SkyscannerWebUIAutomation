package SkyscannerStepDefs;

import SkyscannerDataModel.SearchCriteria;
import SkyscannerDataModel.SearchCriteriaReader;
import SkyscannerPages.Skyscanner;
import cucumber.api.java.en.And;

/**
 * Created by abir on 26/09/18.
 */
public class MyStepdefs extends Skyscanner {
    public SearchCriteria searchCriteria;
    private final SearchCriteriaReader searchCriteriaReader;

    public MyStepdefs() {
        this.searchCriteriaReader = new SearchCriteriaReader();
    }

    @And("^I am on Skyscanner website$")
    public void iAmASkyscannerUser() throws Throwable {
        skyscannerSearchPage.validatePageURL();
        skyscannerSearchPage.validatePageName();

    }

    @And("^I choose to search for a trip from (.*)$")
    public void iChooseTheAirports(String dataType) throws Throwable {
        searchCriteria = searchCriteriaReader.getSearchCriteria(dataType);
        skyscannerSearchPage.addAirportForDeparure(searchCriteria.getDepartureLocation());
        skyscannerSearchPage.addAirportForArrival(searchCriteria.getReturnLocation());
        skyscannerSearchPage.toggleDirectFlights(searchCriteria.getToggleDirectFlights());
        skyscannerSearchPage.toggleReturn(searchCriteria.getJourneyType());
    }

    @And("^I specify the dates for departure and arrival of flight$")
    public void iAddFlightDates() throws Throwable {
        skyscannerSearchPage.addDepartureDate();
        skyscannerSearchPage.addArrivalDate();

    }

    @And("^I add nearby airports for both sides$")
    public void iAddNearbyAirportsForBothSidess() throws Throwable {
        skyscannerSearchPage.toggleAllNearbyAirports();
    }

    @And("^I search for flights$")
    public void iSearchForFlights() throws Throwable {
        skyscannerSearchPage.searchFlight();
    }

    @And("^I should be on the Flights Results page for the trip from (.*)$")
    public void iShouldBeOnResultsPage(String dataType) throws Throwable {
        searchCriteria = searchCriteriaReader.getSearchCriteria(dataType);
        skyscannerResultsPage.validatePageURL(searchCriteria.getDepartureLocation());
        skyscannerResultsPage.validateFlightLocations(searchCriteria.getDepartureLocation());

    }

    @And("^I should see all available flights for my search$")
    public void iShouldSeeAllAvailableFlights() throws Throwable {
        skyscannerResultsPage.validateDepartureDate();
        skyscannerResultsPage.validateReturnDate();
        skyscannerResultsPage.isDirectFlightChecked();
        skyscannerResultsPage.isStopOversUnchecked();
    }

    @And("^I should be displayed with appropriate error message$")
    public void iShouldSeeAptErrorMessage() throws Throwable {
        skyscannerResultsPage.validateDepartureDate();
        skyscannerResultsPage.validateReturnDate();
        skyscannerResultsPage.validateErrorMessage();
    }
}
