package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import utilities.Driver;

public class AmazonTitle_steps {

    @When("user goes to amazon page")
    public void user_goes_to_amazon_page() {
        Driver.getDriver().get("http://amazon.com");
    }

    @Then("user should see proper application")
    public void user_should_see_proper_application() {

        String actual = Driver.getDriver().getTitle();
        String expected = "Amazon";
        Assert.assertTrue(actual.contains(expected));

    }

    @Then("user should validate url")
    public void user_should_validate_url() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("amazon.com"));
    }

}
