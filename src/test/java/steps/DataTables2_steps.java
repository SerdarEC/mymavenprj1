package steps;

import cucumber.api.java.en.Then;
import org.testng.Assert;
import pages.DataTablePage;

public class DataTables2_steps {

    DataTablePage dtbobj = new DataTablePage();

    @Then("User should enter first name {string}")
    public void user_should_enter_first_name(String firstN) throws InterruptedException {
        Thread.sleep(500);
        dtbobj.firstNameBox.sendKeys(firstN);

    }

    @Then("User should enter last name {string}")
    public void user_should_enter_last_name(String lastName) throws InterruptedException {
        Thread.sleep(500);
        dtbobj.lastNameBox.sendKeys(lastName);
    }

    @Then("User should enter position {string}")
    public void user_should_enter_position(String position) throws InterruptedException {
        Thread.sleep(500);
        dtbobj.positionBox.sendKeys(position);
    }

    @Then("User should enter office {string}")
    public void user_should_enter_office(String office) throws InterruptedException {
        Thread.sleep(500);
        dtbobj.officeBox.sendKeys(office);
    }

    @Then("User should enter extension {string}")
    public void user_should_enter_extension(String extention) throws InterruptedException {
        Thread.sleep(500);
        dtbobj.extentionBox.sendKeys(extention);
    }

    @Then("User should enter start date {string}")
    public void user_should_enter_start_date(String date) throws InterruptedException {
        Thread.sleep(500);
        dtbobj.startDateBox.sendKeys(date);
    }

    @Then("User User should entersalary {string}")
    public void user_User_should_entersalary(String slary) throws InterruptedException {
        Thread.sleep(500);
        dtbobj.salaryBox.sendKeys(slary);
    }

    @Then("User enters first name {string} to the search box")
    public void user_enters_first_name_to_the_search_box(String firstName) {
        dtbobj.searchBox.sendKeys(firstName);
    }

    @Then("User should see first name {string} is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table(String firstName) throws InterruptedException {
        Thread.sleep(3000);
        String actual = dtbobj.firstCell.getText();
        //Assert.fail();

        Assert.assertTrue(actual.contains(firstName), "Name is not ");
    }

}
