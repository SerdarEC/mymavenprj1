@youtube
Feature: Youtube search feature

  Background: User in on the Youtube homepage and is able to see search box and search button
    Given User is on the youtube page
    And User is able to see search box
    And User is able to see search button

  Scenario: Testing youtube search

    When User search for FUNNY CATS VIDEOS
    Then user should see results realted with funny cat videos

  Scenario: Testing youtube search

    When User search for FUNNY DOG VIDEOS
    Then user should see results realted with funny dog videos

  Scenario: Testing youtube search

    When User search for FUNNY PET VIDEOS
    Then user should see results realted with funny pet videos