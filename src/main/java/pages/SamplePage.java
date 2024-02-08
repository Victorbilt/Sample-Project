package pages;

import net.serenitybdd.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SamplePage extends PageObject {

    @FindBy(css = "body")
    WebElement body;

    public void assertBodyPresent(){
        Assert.assertTrue("the body is not displayed",body.isDisplayed());
    }
}
