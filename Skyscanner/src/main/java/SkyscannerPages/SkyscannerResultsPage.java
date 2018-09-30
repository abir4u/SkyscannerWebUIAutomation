package SkyscannerPages;

import SkyscannerConstants.ConstantsFile;
import SkyscannerConstants.ErrorLogsFile;
import SkyscannerConstants.PlaceholdersFile;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by abir on 29/09/18.
 */
public class SkyscannerResultsPage extends Skyscanner {
    WebDriverWait wait = new WebDriverWait(getDriver(), 80);

    @FindBy(className = "places-R9WxN")
    WebElement placesHeader;

    @FindBy(xpath = "//*[@id=\"flights-search-summary-root\"]//div[1]/input")
    WebElement departureDate;

    @FindBy(xpath = "//*[@id=\"flights-search-summary-root\"]//div[2]/input")
    WebElement returnDate;

    @FindBy(xpath = "//*[@id=\"filter-controls\"]//dl[1]//li[1]//input[@checked='checked']")
    WebElement directFlightsChecked;

    @FindBy(xpath = "//*[@id=\"filter-controls\"]//dl[1]//li[2]//input")
    WebElement oneStopOverChecked;

    @FindBy(xpath = "//*[@id=\"filter-controls\"]//dl[1]//li[3]//input")
    WebElement twoStopOversChecked;

    @FindBy(className = "indirects-info-msg")
    WebElement errorMessage;

    @FindBy(className = "fqs-best-help")
    WebElement lastElementToBeLoaded;

    public void validateFlightLocations(String fromLocation) {
        waitForPageToLoad();
        if (fromLocation.equalsIgnoreCase("akl")) {
            Assert.assertTrue(ErrorLogsFile.incorrectFlightLocationResult + ". Expected: " + PlaceholdersFile.locationPlaceholderAKL2SIN + ", but Received: " + placesHeader.getText(), placesHeader.getText().equalsIgnoreCase(PlaceholdersFile.locationPlaceholderAKL2SIN));
        }
        else {
            Assert.assertTrue(ErrorLogsFile.incorrectFlightLocationResult + ". Expected: " + PlaceholdersFile.locationPlaceholderCHC2PAT + ", but Received: " + placesHeader.getText(), placesHeader.getText().equalsIgnoreCase(PlaceholdersFile.locationPlaceholderCHC2PAT));
        }
    }

    public void validateDepartureDate() {
        Assert.assertTrue(ErrorLogsFile.incorrectDepartureDateResult + ". Expected: " + PlaceholdersFile.fromDatePlaceholder + ", but Received: " + departureDate.getAttribute("value"), departureDate.getAttribute("value").equalsIgnoreCase(PlaceholdersFile.fromDatePlaceholder));
    }

    public void validateReturnDate() {
        Assert.assertTrue(ErrorLogsFile.incorrectReturnDateResult + ". Expected: " + PlaceholdersFile.returnDatePlaceholder + ", but Received: " + returnDate.getAttribute("value"), returnDate.getAttribute("value").equalsIgnoreCase(PlaceholdersFile.returnDatePlaceholder));
    }

    public void isDirectFlightChecked() {
        Assert.assertTrue(ErrorLogsFile.incorrectStateForDirectFlight, directFlightsChecked.isSelected());
    }

    public void isStopOversUnchecked() {
        Assert.assertFalse(ErrorLogsFile.incorrectCheckOneStopOver, oneStopOverChecked.isSelected());
        Assert.assertFalse(ErrorLogsFile.incorrectCheckTwoStopOver, twoStopOversChecked.isSelected());
    }

    public void validateErrorMessage() {
        Assert.assertTrue(ErrorLogsFile.incorrectErrorMessage + ". Expected: " + ConstantsFile.errorMessage + ", but Received: " + errorMessage.getText(), errorMessage.getText().equalsIgnoreCase(ConstantsFile.errorMessage));
    }

    public void waitForPageToLoad() {
        try { Thread.sleep(5000); } catch (InterruptedException e) {}
        wait.until(ExpectedConditions.visibilityOf(lastElementToBeLoaded));
    }

    public void validatePageURL(String fromLocation) {
        String url = driver.getCurrentUrl();
        if (fromLocation.equalsIgnoreCase("akl")) {
            Assert.assertTrue(ErrorLogsFile.incorrectPageURL + ". Expected: " + ConstantsFile.resultsPageURLAKL2SIN + ", but Received: " + url, url.contains(ConstantsFile.resultsPageURLAKL2SIN));
        }
        else {
            Assert.assertTrue(ErrorLogsFile.incorrectPageURL + ". Expected: " + ConstantsFile.resultsPageURL4CHC2PAT + ", but Received: " + url, url.contains(ConstantsFile.resultsPageURL4CHC2PAT));
        }
    }
}
