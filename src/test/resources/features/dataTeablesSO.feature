@datatables3
Feature: Testing datatables website

  Scenario Outline: Testing adding new employee to the table

    Given User is on the datatables homepage
    And User clicks on New Button
    Then User should see Create New Entry Box
    And User should enter first name "<firstname>"
    And User should enter last name "<lastname>"
    And User should enter position "<position>"
    And User should enter office "<office>"
    And User should enter extension "<extention>"
    And User should enter start date "<date>"
    And User User should entersalary "<salary>"
    Then User should click to create button
    And User enters first name "<firstname>" to the search box
    Then User should see first name "<firstname>" is inserted in the table

    Examples:
    |firstname|lastname|position|office|extention|date        |salary|
    |John     |Wick    |assasin |London|223312   |2010-02-01  |120000|
    |Silver   |Star    |cover   |Berlin|007      |2019-04-05  |300000|
    |Amy      |white   |artist  |Roma  |09       |2019-05-05  |200000|