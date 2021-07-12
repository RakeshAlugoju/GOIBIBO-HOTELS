Feature: Calendar Widgets

  Scenario: Check whether user can be able to enter Check-in and  Check-out dates from the Calendar Widget
    Given Open the Browser
    When Enter the URL of application
    When Clicked on Hotel
    When User should be able to view the Hotel Home Page of Application
    When Enter CHECK-IN Date from the Calendar Widget 
    And CHECK-OUT Dates from the Calendar Widget
    Then Close the browser
     