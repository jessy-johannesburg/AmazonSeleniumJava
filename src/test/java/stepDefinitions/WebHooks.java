package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import base.Base;

public class WebHooks extends Base {
    @Before
    public void BeforeScenarios() {
        launchBrowserAndUrl();
    }

    @After
    public void AfterScenario() {
        closeBrowser();
    }

}
