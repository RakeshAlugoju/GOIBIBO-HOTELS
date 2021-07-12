Feature: Certified Hotels

  Scenario: Check whether user is able to view certified Hotels
   Given Open the Browser
    When Enter the URL of application
    When Clicked on Hotels
    And user enters the Area/Landmark/Hotel name
    And User click on Search Hotels
    When user clicks on gostays Certified 
    Then User can able to view the Certified Hotels
    Then Close the Browser
  