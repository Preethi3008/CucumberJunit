@EndToEnd
Feature: To validate create a page link in facebook page

  @smoke @regression
  Scenario: To verify whether create a page link is valid
  Given The user has to launch browser and hit facebook url
    When The user has to click the create a page link in facebook
    And click business or brand link
    Then The user must be taken to the login page
