package SkyscannerDataModel;

/**
 * Created by abir on 29/09/18.
 */
public class SearchCriteria {
    private String departureLocation;
    private String returnLocation;
    private Boolean journeyType;
    private Boolean toggleDirectFlights;

    public SearchCriteria(String departureLocation, String returnLocation, Boolean journeyType, Boolean toggleDirectFlights) {
        this.departureLocation = departureLocation;
        this.returnLocation = returnLocation;
        this.journeyType = journeyType;
        this.toggleDirectFlights = toggleDirectFlights;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getReturnLocation() {
        return returnLocation;
    }

    public Boolean getJourneyType() {
        return journeyType;
    }

    public Boolean getToggleDirectFlights() {
        return toggleDirectFlights;
    }
}
