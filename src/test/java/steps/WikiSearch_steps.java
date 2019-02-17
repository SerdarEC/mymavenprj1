package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.WikiHomePage;
import utilities.Driver;

public class WikiSearch_steps {

    WikiHomePage wiki = new WikiHomePage();

    @Given("User is on the wikipedia homepage")
    public void user_is_on_the_wikipedia_homepage() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User enters {string}to search box and clicks enter")
    public void user_enters_to_search_box_and_clicks_enter(String string) {
       wiki.searchBox.sendKeys("Steve Jobs"+ Keys.ENTER);
    }

    @Then("User should see the first header is displayed {string}")
    public void user_should_see_the_first_header_is_displayed(String string) {
       String actual = wiki.firstHeader.getText();
       String expected = "Steve Jobs";
        Assert.assertTrue(actual.contains(expected));
    }

}
