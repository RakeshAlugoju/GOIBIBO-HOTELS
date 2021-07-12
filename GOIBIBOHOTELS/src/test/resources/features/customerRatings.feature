Feature: view Customer Ratings

  Scenario: Check whether user is able to view the customer ratings for a particular hotel
    Given Open the Browser
    When Enter the URL of application
    When Clicked on Hotels
    And user enters the Area/Landmark/Hotel name
    When User click on Search Hotels and  Select a Hotel
    When User clicks on Ratings
    Then User can view the customer ratings of that particular hotel
