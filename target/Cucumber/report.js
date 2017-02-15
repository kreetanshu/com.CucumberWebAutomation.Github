$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("github_login.feature");
formatter.feature({
  "line": 2,
  "name": "Test github login functionality",
  "description": "We need to have user credentials for positive test",
  "id": "test-github-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 66505125649,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Open the browser and github url",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "The url and browser is selected",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "The github is opened in required browser",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on sign in button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.the_url_and_browser_is_selected()"
});
formatter.result({
  "duration": 14893501469,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.the_github_is_opened_in_required_browser()"
});
formatter.result({
  "duration": 99608456,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 1944540710,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Test user login without username and password",
  "description": "",
  "id": "test-github-login-functionality;test-user-login-without-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user clicks on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user gets an error message \"Incorrect username or password.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 3230554097,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Incorrect username or password.",
      "offset": 28
    }
  ],
  "location": "LoginTest.user_gets_an_error_message(String)"
});
formatter.result({
  "duration": 3511001370,
  "status": "passed"
});
formatter.after({
  "duration": 404786789,
  "status": "passed"
});
formatter.before({
  "duration": 21547992476,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Open the browser and github url",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "The url and browser is selected",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "The github is opened in required browser",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on sign in button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.the_url_and_browser_is_selected()"
});
formatter.result({
  "duration": 10243445334,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.the_github_is_opened_in_required_browser()"
});
formatter.result({
  "duration": 110163089,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 942618627,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Test user login with invalid username and password",
  "description": "",
  "id": "test-github-login-functionality;test-user-login-with-invalid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user enter username and password",
  "rows": [
    {
      "cells": [
        "username",
        "passwords"
      ],
      "line": 18
    },
    {
      "cells": [
        "kreetan",
        "12324"
      ],
      "line": 19
    },
    {
      "cells": [
        "kreetanshu@gmail.com",
        "Rails@1234"
      ],
      "line": 20
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user can login with credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user cannot login with credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 23074030677,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_can_login_with_credentials()"
});
formatter.result({
  "duration": 98641,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_can_login_with_credentials()"
});
formatter.result({
  "duration": 69562,
  "status": "passed"
});
formatter.after({
  "duration": 72411361,
  "status": "passed"
});
});