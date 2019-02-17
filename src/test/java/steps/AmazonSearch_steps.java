package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.AmazonHomePage;
import utilities.Driver;

public class AmazonSearch_steps {

    AmazonHomePage amazon = new AmazonHomePage();


    @Given("User is on the Amazon homepage")
    public void user_is_on_the_Amazon_homepage() {
        Driver.getDriver().get("http://www.amazon.com");
    }

    @When("User enters headphones keyword to the search box")
    public void user_enters_headphones_keyword_to_the_search_box() {
        amazon.searchBox.sendKeys("headphones");
    }

    @When("User clicks amazon search button")
    public void user_clicks_amazon_search_button() {
        amazon.searchBtn.click();
    }

    @Then("User should see headphones in the results")
    public void user_should_see_headphones_in_the_results() {
        String actual = Driver.getDriver().getTitle();
        String expected = "headphones";
        Assert.assertTrue(actual.contains(expected));
    }
}
