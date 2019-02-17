package steps;

import cucumber.api.java.en.Then;
import org.testng.Assert;
import pages.DataTablePage;

public class DataTables2_steps {

    DataTablePage dtbobj = new DataTablePage();

    @Then("User should enter first name {string}")
    public void user_should_enter_first_name(String firstName) {
        dtbobj.firstNameBox.sendKeys(firstName);
    }

    @Then("User should enter last name {string}")
    public void user_should_enter_last_name(String lastName) {
        dtbobj.lastNameBox.sendKeys(lastName);
    }

    @Then("User should enter position {string}")
    public void user_should_enter_position(String position) {
        dtbobj.positionBox.sendKeys(position);
    }

    @Then("User should enter office {string}")
    public void user_should_enter_office(String office) {
        dtbobj.officeBox.sendKeys(office);
    }

    @Then("User enters first name {string} to the search box")
    public void user_enters_first_name_to_the_search_box(String firstName) {
        dtbobj.searchBox.sendKeys(firstName);
    }

    @Then("User should see first name {string} is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table(String firstName) throws InterruptedException {
        Thread.sleep(3000);
        String actual = dtbobj.firstCell.getText();
        //String expected = firstName;
        System.out.println(actual);

        Assert.assertTrue(actual.contains(firstName), "Name is not ");
    }

}
