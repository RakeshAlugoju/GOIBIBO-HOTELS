Feature: Holidays-spot

  Scenario: Check whether user can view the hotels of the holiday-spots
    Given Open the Browser
    When Enter the URL of application
    When Clicked on Hotels
    And scroll down
    When selected on one of the holiday-spot
    Then it displays the hotels of the particular holiday spot.
   Then close the Browser
 