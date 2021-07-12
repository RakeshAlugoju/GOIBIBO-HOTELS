Feature: International To Indian Radio Button

  Scenario: Check whether user can enter local hotel name when clicked on International Radio-button
    Given Open the Browser
    When Enter the URL of application
    When Clicked on Hotels
    When user clicked on INTERNATIONAL Radio-button
    And user enters the Area/Landmark/Hotel name and Selects  Hotel from the DropDownList
    Then India radio-button is selected automatically
