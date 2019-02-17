package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import pages.DataTablePage;
import utilities.Driver;

public class DataTables_steps {

    DataTablePage dtbobj = new DataTablePage();

    @Given("User is on the datatables homepage")
    public void user_is_on_the_datatables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @Given("User clicks on New Button")
    public void user_clicks_on_New_Button() {
        dtbobj.newButton.click();
    }

    @Then("User should see Create New Entry Box")
    public void user_should_see_Create_New_Entry_Box() throws InterruptedException {
        dtbobj.createBtn.isDisplayed();
    }

    @Then("User should enter first name")
    public void user_should_enter_first_name() {
        dtbobj.firstNameBox.sendKeys("Kemal");
    }

    @Then("User should enter last name")
    public void user_should_enter_last_name() {
        dtbobj.lastNameBox.sendKeys("Erdogan");
    }

    @Then("User should enter position")
    public void user_should_enter_position() {
        dtbobj.positionBox.sendKeys("Sidewalk Engineer");
    }

    @Then("User should enter office")
    public void user_should_enter_office() {
        dtbobj.officeBox.sendKeys("Sidewalk");
    }

    @Then("User should enter extension")
    public void user_should_enter_extension() {
        dtbobj.extentionBox.sendKeys("1234");
    }

    @Then("User should enter start date")
    public void user_should_enter_start_date() {
        dtbobj.startDateBox.sendKeys("2009-01-02");
    }

    @Then("User User should entersalary")
    public void user_User_should_entersalary() {
        dtbobj.salaryBox.sendKeys("100000");
    }

    @Then("User should click to create button")
    public void user_should_click_to_create_button() {
       dtbobj.createBtn.click();
    }

    @Then("User enters first name to the search box")
    public void user_enters_first_name_to_the_search_box() {
        dtbobj.searchBox.sendKeys("Kemal");
    }

    @Then("User should see first name is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table() throws InterruptedException {
        Thread.sleep(3000);
        String actual = dtbobj.firstCell.getText();
        String expected = "Kemal";
        System.out.println(actual);

        Assert.assertTrue(actual.contains(expected), "Name is not ");
    }


}
