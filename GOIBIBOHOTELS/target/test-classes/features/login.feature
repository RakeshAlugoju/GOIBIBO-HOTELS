Feature: Login Or Signup

  Scenario: Check Whether use is able to Login or signup
    Given Open the Browser
    When Enter the URL of application
    When Clicked on Hotels
    When User click on Login or Signup
    And User Enter the phone number in the LoginWithPhoneNUmber TextFeild
    And User Click on continue 
    Then Login successfully
    
