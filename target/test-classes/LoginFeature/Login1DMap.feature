@EndToEnd
Feature: To validate login page of facebook
Background: 
Given The user has to launch browser and hit facebook url
@sanity
  Scenario: To verify login functionality with valid username and invalid password in facebook
    When user has to enter the username and password
      | username | preethi      |
      | password | dfghjk%$#134 |
    And click the login button
    Then user should not be taken to the home page
@smoke @sanity @regression
  Scenario: To verify the forgotten password in facebook page
    When user has to click the forgotten password link
    And user has to enter phone or email
      | mobile |           4567567778 |
      | email  | dfghjklfgh@gmail.com |
    And user has to click search button
    Then user has to be redirected to OTP page
