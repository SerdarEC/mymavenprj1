package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.YoutubeHomePage;
import utilities.Driver;

public class YouTubeSearch_steps {

    YoutubeHomePage youtubePage = new YoutubeHomePage();

    @Given("User is on the youtube page")
    public void user_is_on_the_youtube_page() {

        Driver.getDriver().get("http://www.youtube.com");

    }

    @Given("User is able to see search box")
    public void user_is_able_to_see_search_box() {
        Assert.assertTrue(youtubePage.searchBox.isDisplayed());
    }

    @Given("User is able to see search button")
    public void user_is_able_to_see_search_button() {
        Assert.assertTrue(youtubePage.searchBtn.isDisplayed());
    }

    @When("User search for FUNNY CATS VIDEOS")
    public void user_search_for_FUNNY_CATS_VIDEOS() {
        youtubePage.searchBox.sendKeys("FUNNY CAT VIDEOS");
        youtubePage.searchBtn.click();
    }

    @Then("user should see results realted with funny cat videos")
    public void user_should_see_results_realted_with_funny_cat_videos() throws InterruptedException {
        Thread.sleep(2000);
        String actual = Driver.getDriver().getTitle().toLowerCase();
        String expected = "cat";
        //System.out.println(actual+ "--" + expected);
        Assert.assertTrue(actual.contains(expected));

    }

    @When("User search for FUNNY DOG VIDEOS")
    public void user_search_for_FUNNY_DOG_VIDEOS() {
        youtubePage.searchBox.sendKeys("FUNNY DOG VIDEOS");
        youtubePage.searchBtn.click();
    }

    @Then("user should see results realted with funny dog videos")
    public void user_should_see_results_realted_with_funny_dog_videos() throws InterruptedException {
        Thread.sleep(2000);
        String actual = Driver.getDriver().getTitle().toLowerCase();
        String expected = "dog";
        //System.out.println(actual+ "--" + expected);
        Assert.assertTrue(actual.contains(expected));
    }

    @When("User search for FUNNY PET VIDEOS")
    public void user_search_for_FUNNY_PET_VIDEOS() {
        youtubePage.searchBox.sendKeys("FUNNY PET VIDEOS");
        youtubePage.searchBtn.click();
    }

    @Then("user should see results realted with funny pet videos")
    public void user_should_see_results_realted_with_funny_pet_videos() throws InterruptedException {
        Thread.sleep(2000);
        String actual = Driver.getDriver().getTitle().toLowerCase();
        String expected = "pet";
        //System.out.println(actual+ "--" + expected);
        Assert.assertTrue(actual.contains(expected));
    }


}
