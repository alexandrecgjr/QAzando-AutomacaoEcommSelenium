package support;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.Scenario;
import runner.RunBase;

public class Hooks {

    @Before
    public void setup(Scenario scenario) {

        if (scenario.getSourceTagNames().contains("@firefox")) {
            RunBase.startDriver(RunBase.Browser.FIREFOX);
        } else {
            RunBase.startDriver(RunBase.Browser.CHROME);
        }
    }

    @After
    public void tearDown() {
        RunBase.quitDriver();
    }

}
