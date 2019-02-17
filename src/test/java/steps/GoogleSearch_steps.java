package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.GooglePage;
import utilities.Driver;

public class GoogleSearch_steps {

    GooglePage googlePage = new GooglePage();

    @Given("User is on the google homepage")
    public void user_is_on_the_google_homepage() {
        Driver.getDriver().get("http://www.google.com");

    }

    @Given("User enters flowers keyword")
    public void user_enters_flowers_keyword() {

        googlePage.searchBox.sendKeys("flowers" );

    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        googlePage.searchBox.sendKeys(Keys.ENTER);
    }

    @Then("User should see results related to flowers")
    public void user_should_see_results_related_to_flowers() {
        String actual = Driver.getDriver().getTitle();
        String expected = "flowers";
        Assert.assertTrue(actual.contains(expected));
    }

}
