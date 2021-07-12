Feature: selecting types of Hotels

  Scenario: Check whether use is able to select the different types of hotels
    Given Open the Browser
    When Enter the URL of application
    When Clicked on Hotels
    And user enters the Area/Landmark/Hotel name
    And User click on Search Hotels
    When user clicks on gostays Certified and scrolls down and scrolls up
    And user clicks on couplesFriendly  and scrolls down and scrolls up
    And user clicks on  oyo   and scrolls down
    When user select a hotel from oyo
    Then it is selected and  viewed succesfully
    Then close the Browser
