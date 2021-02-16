$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/LoginFeature/Login1DMap.feature");
formatter.feature({
  "name": "To validate login page of facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user has to launch the chrome browser and hit the facebook url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_launch_the_chrome_browser_and_hit_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify login functionality with valid username and invalid password in facebook",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user has to enter the username and password",
  "rows": [
    {
      "cells": [
        "username",
        "preethi"
      ]
    },
    {
      "cells": [
        "password",
        "dfghjk%$#134"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_enter_the_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not be taken to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_should_not_be_taken_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user has to launch the chrome browser and hit the facebook url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_launch_the_chrome_browser_and_hit_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the forgotten password in facebook page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user has to click the forgotten password link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_click_the_forgotten_password_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter phone or email",
  "rows": [
    {
      "cells": [
        "mobile",
        "4567567778"
      ]
    },
    {
      "cells": [
        "email",
        "dfghjklfgh@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_enter_phone_or_email(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click search button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to be redirected to OTP page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_be_redirected_to_OTP_page()"
});
formatter.result({
  "status": "passed"
});
});