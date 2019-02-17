@datatables2
Feature: Testing datatables website

  Scenario: Testing adding new employee to the table

    Given User is on the datatables homepage
    And User clicks on New Button
    Then User should see Create New Entry Box
    And User should enter first name "John"
    And User should enter last name "Wick"
    And User should enter position "Assasin"
    And User should enter office "New York"
    And User should enter extension
    And User should enter start date
    And User User should entersalary
    Then User should click to create button
    And User enters first name "John" to the search box
    Then User should see first name "John" is inserted in the table