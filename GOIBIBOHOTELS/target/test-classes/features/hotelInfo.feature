Feature: Payment  Method

  Scenario: Check whether user is able to do payment
    Given Open the Browser
    When Enter the URL of application
    When Clicked on Hotels
    And user enters the Area/Landmark/Hotel name
    When User click on Search Hotels
    And Select a Room
   Then User is able to view the hotel info of the selected Room
    