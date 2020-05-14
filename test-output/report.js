$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Platform.feature");
formatter.feature({
  "line": 1,
  "name": "Platform Application",
  "description": "",
  "id": "platform-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 11,
  "name": "Verify that user will able to reach onto report page",
  "description": "",
  "id": "platform-application;verify-that-user-will-able-to-reach-onto-report-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@EndToEndTest"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Initalize the browser and Navigate to Platform website",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user clicks on the Reports from the side line",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "verify user lands onto Reports page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "PlatfromStepDef.initalize_the_browser_and_Navigate_to_Platform_website()"
});
formatter.result({
  "duration": 8006126300,
  "status": "passed"
});
formatter.match({
  "location": "PlatfromStepDef.user_clicks_on_the_Reports_from_the_side_line()"
});
formatter.result({
  "duration": 493613500,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not visible\n  (Session info: chrome\u003d81.0.4044.113)\n  (Driver info: chromedriver\u003d2.37.543627 (63642262d9fb93fb4ab52398be4286d844092a5e),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027MHASAN\u0027, ip: \u0027192.168.1.8\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.37.543627 (63642262d9fb93..., userDataDir: C:\\Users\\MOHAMM~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 81.0.4044.113, webStorageEnabled: true}\nSession ID: 4bb67479a339599e0b39eca5d3db681c\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat PageObject.PlatfromPageObject.ClickOnTheReportsButton(PlatfromPageObject.java:106)\r\n\tat stepDefinitions.PlatfromStepDef.user_clicks_on_the_Reports_from_the_side_line(PlatfromStepDef.java:61)\r\n\tat ✽.When user clicks on the Reports from the side line(src/test/java/features/Platform.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PlatfromStepDef.verify_user_lands_onto_Reports_page()"
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