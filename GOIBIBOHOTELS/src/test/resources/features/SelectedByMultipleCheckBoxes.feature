Feature: selecting hotels By Multiplecheckboxes

  Scenario: Check whether use is able to select the hotel by Multiple CheckBoxes
    Given Open the Browser
    When Enter the URL of application
    When Clicked on Hotels
    And user enters the Area/Landmark/Hotel name
    And User click on Search Hotels
    When user clikcs on  multiple checkboxes
    When use select on Hotel
    Then user view the selected hotel successfully
    Then close the Browser
