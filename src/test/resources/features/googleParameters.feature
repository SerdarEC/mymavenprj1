@googleParameters
Feature: Google search functionality

  Scenario: Testing google search
    Given User is on the homepage of google
    When Users enters "flowers"
    Then User should see "flowers" in title

  Scenario: Testing google search
    Given User is on the homepage of google
    When Users enters "cars"
    Then User should see "cars" in title