package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.GooglePage;
import utilities.Driver;

public class GoogleParameters_steps {

    GooglePage googleobj = new GooglePage();

    @Given("User is on the homepage of google")
    public void user_is_on_the_homepage_of_google() {

        Driver.getDriver().get("http://www.google.com");
    }

    @When("Users enters {string}")
    public void users_enters(String string) {
        googleobj.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("User should see {string} in title")
    public void user_should_see_in_title(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = string + " - Google Search";
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

}
