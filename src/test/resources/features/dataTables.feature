@datatables
Feature: Testing datatables website

  Scenario: Testing adding new employee to the table

    Given User is on the datatables homepage
    And User clicks on New Button
    Then User should see Create New Entry Box
    And User should enter first name
    And User should enter last name
    And User should enter position
    And User should enter office
    And User should enter extension
    And User should enter start date
    And User User should entersalary
    Then User should click to create button
    And User enters first name to the search box
    Then User should see first name is inserted in the table

