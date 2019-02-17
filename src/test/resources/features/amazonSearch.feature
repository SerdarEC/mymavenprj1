
Feature: Amazon Search
@amazon
  Scenario: Amazon search test

  Given User is on the Amazon homepage
  When User enters headphones keyword to the search box
  And User clicks amazon search button
  Then User should see headphones in the results
