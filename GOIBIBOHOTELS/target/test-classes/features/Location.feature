Feature: view nearby Location of Hotels

  Scenario: Check whether user is able to view the details of nearby attractive places of particular Hotel
    Given Open the Browser
    When Enter the URL of application
    When Clicked on Hotels
    And user enters the Area/Landmark/Hotel name
    When User click on Search Hotels and select the hotel
    When Click on Location
    And Enter the location in the search box
    Then User should view the details of nearby attractive places of hotels
    Then close the Browser
