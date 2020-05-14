Feature: Platform Application 

#@EndToEndTest
Scenario: Verify that User will able to login into the Platform application 
Given Initialize the browser and Navigate to Platform Application "https://tvm-ui.qa.platf0rm.605.nu/login?redirect=1"
When user enters username and Password and logs in
Then verify user lands onto home page
And Close the browser

#@EndToEndTest
Scenario: Verify that user will able to reach onto report page
Given Initialize the browser and Navigate to Platform Application "https://tvm-ui.qa.platf0rm.605.nu/login?redirect=1"
When user clicks on the Reports from the side line
Then verify user lands onto Reports page
And Close the browser

#@EndToEndTest
Scenario: Verify that user will able to reach onto new report page
Given Initialize the browser and Navigate to Platform Application "https://tvm-ui.qa.platf0rm.605.nu/login?redirect=1"
When user clicks on the Reports from the side line
And user clicks on the new button on the Reports page
Then verify user lands onto New Report page
And Close the browser

#@EndToEndTest
Scenario: Verify that user will create a report for 1 week
Given Initialize the browser and Navigate to Platform Application "https://tvm-ui.qa.platf0rm.605.nu/login?redirect=1"
When user clicks on the Reports from the side line
And user clicks on the new button on the Reports page
And user should able to select all the selections 
Then verify user will able to run a report for one week
And Close the browser

#@EndToEndTest
Scenario: Verify that user will create a report for one month
Given Initialize the browser and Navigate to Platform Application "https://tvm-ui.qa.platf0rm.605.nu/login?redirect=1"
When user clicks on the Reports from the side line
And user clicks on the new button on the Reports page
And user should able to select all the selections for one month
Then verify user will able to run a report for one month
And Close the browser

@EndToEndTest
Scenario: Verify that user will create a report for one year
Given Initialize the browser and Navigate to Platform Application "https://tvm-ui.qa.platf0rm.605.nu/login?redirect=1"
When user clicks on the Reports from the side line
And user clicks on the new button on the Reports page
And user should able to select all the selections for one year
Then verify user will able to run a report for year month
And Close the browser




#@EndToEndTest
Scenario: Verify that user will able to lands onto Target builder page
Given Initialize the browser and Navigate to Platform Application "https://tvm-ui.qa.platf0rm.605.nu/login?redirect=1"
When User lands on the home page and clicks on the Target builder button from the side menu
Then validate that user lands onto Target builder page 
And Close the browser















