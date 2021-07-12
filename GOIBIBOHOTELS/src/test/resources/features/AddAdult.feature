Feature: adding adults

  Scenario: check whether user is  able to add Persons(ADULTS)
    Given Open the Browser
    When Enter the URL of application
    When Clicked on Hotel
    When User should be able to view the Hotel Home Page of Application
    And Click On GUESTS&ROOMS
    Then Click On  + in ADULTS
    Then Close the  website
