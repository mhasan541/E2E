$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Platform.feature");
formatter.feature({
  "line": 1,
  "name": "Platform Application",
  "description": "",
  "id": "platform-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify that User will able to login into the Platform application",
  "description": "",
  "id": "platform-application;verify-that-user-will-able-to-login-into-the-platform-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@EndToEndTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Initialize the browser and Navigate to Platform Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and Password and logs in",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify user lands onto home page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "PlatfromStepDef.initialize_the_browser_and_Navigate_to_Platform_Application()"
});
formatter.result({
  "duration": 7859753200,
  "status": "passed"
});
formatter.match({
  "location": "PlatfromStepDef.user_enters_username_and_Password_and_logs_in()"
});
formatter.result({
  "duration": 506350000,
  "status": "passed"
});
formatter.match({
  "location": "PlatfromStepDef.verify_user_lands_onto_home_page()"
});
formatter.result({
  "duration": 76967900,
  "status": "passed"
});
formatter.match({
  "location": "PlatfromStepDef.close_the_browser()"
});
formatter.result({
  "duration": 4863866200,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Verify that user will create a report for 1 week",
  "description": "",
  "id": "platform-application;verify-that-user-will-create-a-report-for-1-week",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@EndToEndTest"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "Initialize the browser and Navigate to Platform Application",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "user clicks on the Reports from the side line",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user clicks on the new button on the Reports page",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user should able to select all the selections",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "verify user will able to a report for 1 week",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "PlatfromStepDef.initialize_the_browser_and_Navigate_to_Platform_Application()"
});
formatter.result({
  "duration": 6522464300,
  "status": "passed"
});
formatter.match({
  "location": "PlatfromStepDef.user_clicks_on_the_Reports_from_the_side_line()"
});
formatter.result({
  "duration": 798250200,
  "status": "passed"
});
formatter.match({
  "location": "PlatfromStepDef.user_clicks_on_the_new_button_on_the_Reports_page()"
});
formatter.result({
  "duration": 3513318600,
  "status": "passed"
});
formatter.match({
  "location": "PlatfromStepDef.user_should_able_to_select_all_the_selections()"
});
formatter.result({
  "duration": 24210560100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 38
    }
  ],
  "location": "PlatfromStepDef.verify_user_will_able_to_a_report_for_week(int)"
});
formatter.result({
  "duration": 5145300,
  "status": "passed"
});
formatter.match({
  "location": "PlatfromStepDef.close_the_browser()"
});
formatter.result({
  "duration": 4854796600,
  "status": "passed"
});
});