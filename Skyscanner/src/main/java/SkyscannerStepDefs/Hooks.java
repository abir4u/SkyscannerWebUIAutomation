package SkyscannerStepDefs;

import SkyscannerPages.Skyscanner;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by abir on 27/09/18.
 */
public class Hooks extends Skyscanner {


    @Before
    public void begin(){
        setup();
    }

    @After
    public void tearDown(){
        if(null != getDriver())
            getDriver().quit();
    }
}
