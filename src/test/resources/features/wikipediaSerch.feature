Feature: Wikipedia Search Feature
  @wiki

  Scenario: Verify that wikipedia search working as expected

    Given User is on the wikipedia homepage
    When User enters "Steve Jobs"to search box and clicks enter
    Then User should see the first header is displayed "Steve Jobs"
