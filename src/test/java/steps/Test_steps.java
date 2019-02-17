package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class Test_steps {


    @When("user goes to google application")
    public void user_goes_to_google_application() {

    }

    @Then("user searches for apple")
    public void user_searches_for_apple() {

    }

    @Then("user should see apple related results")
    public void user_should_see_apple_related_results() {

        Assert.assertTrue(false);

    }

    @Then("user tests something")
    public void user_tests_something() {

    }

}
