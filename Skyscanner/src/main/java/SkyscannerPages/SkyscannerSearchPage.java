package SkyscannerPages;

import SkyscannerConstants.ConstantsFile;
import SkyscannerConstants.ErrorLogsFile;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by abir on 27/09/18.
 */
public class SkyscannerSearchPage extends Skyscanner {

    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(getDriver(), 10);

    @FindBy(id = "fsc-trip-type-selector-return")
    WebElement returnFlightOption;

    @FindBy(id = "origin-fsc-search")
    WebElement inputOrigin;

    @FindBy(id = "destination-fsc-search")
    WebElement inputDestination;

    @FindBy(id = "depart-fsc-datepicker-input")
    WebElement departureDateOption;

    @FindBy(xpath = "//*[@id=\"depart-fsc-datepicker-input-popover\"]/div/div[2]/div/table/tbody/tr[3]/td[1]/button")
    WebElement departureDate;

    @FindBy(id = "return-fsc-datepicker-input")
    WebElement arrivalDateOption;

    @FindBy(className = "fsc-datepicker__container-3azq_")
    WebElement expandedCalendar;

    @FindBy(xpath = "//*[@id=\"return-fsc-datepicker-input-popover\"]/div/div[2]/div/table/tbody/tr[3]/td[6]/button")
    WebElement arrivalDate;

    @FindBy(xpath = "//*[@id=\"flights-search-controls-root\"]//div[2]//div[1]/label/input")
    WebElement toggleOriginNearbyAirports;

    @FindBy(xpath = "//*[@id=\"flights-search-controls-root\"]//div[2]//div[3]/label/input")
    WebElement toggleDestinationNearbyAirports;

    @FindBy(xpath = "//*[@id=\"flights-search-controls-root\"]//div[2]/label/input")
    WebElement toggleDirectFlights;

    @FindBy(xpath = "//*[@id=\"flights-search-controls-root\"]//div[3]/button")
    WebElement searchFlight;

    public SkyscannerSearchPage(WebDriver driver){
        super();
        this.driver = driver;
    }

    public void toggleReturn(Boolean isReturnON) {
        if ((isReturnON) && !returnFlightOption.isSelected()) {
            returnFlightOption.click();
        }
    }

    public void addAirportForDeparure(String origin){
        inputOrigin.click();
        inputOrigin.sendKeys(origin);
    }

    public void addAirportForArrival(String destination){
        inputDestination.click();
        inputDestination.sendKeys(destination);
    }

    public void addDepartureDate(){
        departureDateOption.click();
        wait.until(ExpectedConditions.visibilityOf(expandedCalendar));
        departureDate.click();
    }

    public void addArrivalDate(){
        arrivalDateOption.click();
        wait.until(ExpectedConditions.visibilityOf(expandedCalendar));
        arrivalDate.click();
    }

    public void toggleAllNearbyAirports(){
        toggleOriginNearbyAirports.click();
        toggleDestinationNearbyAirports.click();
    }

    public void toggleDirectFlights(Boolean isDirectFlight){
        if (isDirectFlight) {
            toggleDirectFlights.click();
        }
    }

    public void searchFlight(){
        searchFlight.click();
    }

    public void validatePageName() {
        String pageTitle = driver.getTitle();
        Assert.assertTrue(ErrorLogsFile.incorrectSearchPageTitle, pageTitle.contains(ConstantsFile.searchPageTitle));
    }

    public void validatePageURL() {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(ErrorLogsFile.incorrectPageURL, url.equalsIgnoreCase(ConstantsFile.searchPageURL));
    }
}
