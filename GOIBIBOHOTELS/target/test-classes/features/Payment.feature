Feature: Payment  Method

  Scenario: Check whether user is able to do payment
    Given Open the Browser
    When Enter the URL of application
    When Clicked on Hotels
    And user enters the Area/Landmark/Hotel name
    When User click on Search Hotels
    And Select a Room
    And Enter the details of the User
    When User clicks on proceed to payment options button
    Then it will redirect to payment mode
    And User Enter the invalid card details for payment
    Then User is able to view  a alert messages like ENTER THE  VALID CARD DETAILS
    Then close the browser
