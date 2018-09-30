package SkyscannerPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import static SkyscannerUtils.SkyscannerUtil.getConfigValue;
import static org.junit.Assert.fail;


/**
 * Created by abir on 27/09/18.
 */
public class Skyscanner {

    public static WebDriver driver;
    protected static SkyscannerSearchPage skyscannerSearchPage;
    protected static SkyscannerResultsPage skyscannerResultsPage;

    protected void setup() {
        initiateDriver();
        skyscannerSearchPage = PageFactory.initElements(driver, SkyscannerSearchPage.class);
        skyscannerResultsPage = PageFactory.initElements(driver, SkyscannerResultsPage.class);
    }

    private WebDriver initiateDriver() {
        String browser = getConfigValue("default.browser");

       switch (browser){
           case "chrome":
               System.setProperty("webdriver.chrome.driver", "/Users/abirpal/Desktop/Clones/web-automation-myVF/drivers_and_Jars/Chrome_driver/chromedriver");
               driver = new ChromeDriver();
               break;

           case "firefox":
               driver = new FirefoxDriver();
               break;

           default:
               fail("Browser not supported");
       }

        String url = getConfigValue("url");
        driver.get(url);

        return driver;
    }

    protected WebDriver getDriver(){
        return this.driver;
    }

}
