Feature: view Hotel images

  Scenario: Check Whether user is able to view the images of that selected hotel
    Given Open the Browser
    When Enter the URL of application
    When Clicked on Hotels
    And user enters the Area/Landmark/Hotel name
    When User click on Search Hotels and Select a Hotel
    When user clicks on Photos by travelers
    And Scroll down and  choose the image
    Then image is selected and viewed
    Then close the browser
