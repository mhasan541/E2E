$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Platform.feature");
formatter.feature({
  "line": 1,
  "name": "Platform Application",
  "description": "",
  "id": "platform-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 44,
  "name": "Verify that user will create a report for one year",
  "description": "",
  "id": "platform-application;verify-that-user-will-create-a-report-for-one-year",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@EndToEndTest"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "Initialize the browser and Navigate to Platform Application \"https://tvm-ui.qa.platf0rm.605.nu/login?redirect\u003d1\"",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "user clicks on the Reports from the side line",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "user clicks on the new button on the Reports page",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user should able to select all the selections for one year",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "verify user will able to run a report for year month",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://tvm-ui.qa.platf0rm.605.nu/login?redirect\u003d1",
      "offset": 61
    }
  ],
  "location": "PlatfromStepDef.initialize_the_browser_and_navigate_to_platform_application_something(String)"
});
formatter.result({
  "duration": 7471945900,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d/html/body/div/main/div/form/div[1]/input\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027MHASAN\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat PageObject.PlatfromPageObject.EnterPlatformCredential(PlatfromPageObject.java:230)\r\n\tat stepDefinitions.PlatfromStepDef.initialize_the_browser_and_navigate_to_platform_application_something(PlatfromStepDef.java:32)\r\n\tat ✽.Given Initialize the browser and Navigate to Platform Application \"https://tvm-ui.qa.platf0rm.605.nu/login?redirect\u003d1\"(src/test/java/features/Platform.feature:45)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PlatfromStepDef.user_clicks_on_the_Reports_from_the_side_line()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PlatfromStepDef.user_clicks_on_the_new_button_on_the_Reports_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PlatfromStepDef.user_should_able_to_select_all_the_selections_for_one_year()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PlatfromStepDef.verify_user_will_able_to_run_a_report_for_year_month()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PlatfromStepDef.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});