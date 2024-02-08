package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import pages.SamplePage;

public class SampleSteps extends ScenarioSteps {

    SamplePage sp;

    @Step("Name of bodyIsDisplayed")
    public void bodyIsDisplayed(){
        sp.assertBodyPresent();
    }
}
