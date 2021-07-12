Feature: Error Message

  Scenario: Check whether error message is displayed when invalid promo code is applied
    Given Open the Browser
    When Enter the URL of application
    When Clicked on Hotels
    And user enters the Area/Landmark/Hotel name
    When User click on Search Hotels
    And Select a Room
    And Entered a invalid Promo code
    When Click On Apply
    Then Throws a error message PROMOCODE NOT APPLICABLE
    Then close the  Browser
