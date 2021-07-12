Feature: View Cancellationpolicy

  Scenario: Check whether user is able to view the cancellation policy
    Given Open the Browser
    When Enter the URL of application
    When Clicked on Hotels
    And user enters the Area/Landmark/Hotel name
    And User click on Search Hotels and select hotel
    When Click on ROOM OPTIONS
    When Click on Cancellation Policy
    Then User views the cancellation-policy
    Then close the Browser