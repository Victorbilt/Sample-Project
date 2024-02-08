import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import common.Application;
import common.Constants;
import steps.SampleSteps;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "/urls.csv", separator = Constants.CSV_SEPARATOR)
public class Test1 {

    @Managed(uniqueSession = true,driver= "Chrome")
    public WebDriver webdriver;

    @Steps
    private SampleSteps step;

    private String url;



    @Test
    @Title("Send a form and check that the correct status has been saved - 39047")
    public void sendForm() {
        getDriver().get(url);
        step.bodyIsDisplayed();
    }
}
