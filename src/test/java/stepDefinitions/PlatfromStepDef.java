package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Interface.PlatformInterface;
import PageObject.PlatfromPageObject;



@RunWith(Cucumber.class)
public class PlatfromStepDef extends PlatformInterface {
	
	public WebDriver driver;
	public PlatfromPageObject PlatformPageObject;
	public PlatformInterface PlatformInterface;

	@Given("^Initialize the browser and Navigate to Platform Application \"([^\"]*)\"$")
    public void initialize_the_browser_and_navigate_to_platform_application_something(String strArg1) throws Throwable{
	    driver= NavigateToBrowser();
	    driver.get(strArg1);
	   System.out.println("URL "+ driver.getCurrentUrl()); 
	    PlatformPageObject= new PlatfromPageObject(driver);
	    PlatformPageObject.EnterPlatformCredential();
		PlatformPageObject.ClickOnLoginButton();
	
	}


	@When("^user enters username and Password and logs in$")
	public void user_enters_username_and_Password_and_logs_in() throws Throwable {
		
		PlatformPageObject.LogoDisplay();
	
		
		
	}

	@Then("^verify user lands onto home page$")
	public void verify_user_lands_onto_home_page() throws Throwable {
		PlatformPageObject.LogoDisplay();
		PlatformPageObject.MainDashboardDisplay();
		PlatformPageObject.UserNameOnHomePage();
	}
	
	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {   
	    PlatformPageObject.CloseTheBrowser();
	   
	}
	
	@When("^user clicks on the Reports from the side line$")
	public void user_clicks_on_the_Reports_from_the_side_line() throws Throwable {
		PlatformPageObject.ClickOnTheReportsButton();
		
	}

	@Then("^verify user lands onto Reports page$")
	public void verify_user_lands_onto_Reports_page() throws Throwable {
		PlatformPageObject.ReportsTextDisplay();
		PlatformPageObject.ClickOnNewButton();
		PlatformPageObject.SearchBoxForReports();
		PlatformPageObject.NameColumnButton();
		PlatformPageObject.CreatedColumnButton();
		PlatformPageObject.ModifiedColumnButton();
		PlatformPageObject.LastModifiedColumnButton();
		PlatformPageObject.PublicColumnButton();
		PlatformPageObject.ActionsColumnButton();
	}

	
	@When("^user clicks on the new button on the Reports page$")
	public void user_clicks_on_the_new_button_on_the_Reports_page() throws Throwable {
		PlatformPageObject.ClickOnNewButton();
	}

	@Then("^verify user lands onto New Report page$")
	public void verify_user_lands_onto_New_Report_page() throws Throwable {
		PlatformPageObject.NewReportText();
		PlatformPageObject.VerifySaveButtonDisplayed();
		PlatformPageObject.VerifyExportButtonDisplayed();
		PlatformPageObject.VerifySaveButtonDisplayed();
		PlatformPageObject.VerifyExportButtonDisplayed();
		PlatformPageObject.VerifyConfigText();
		PlatformPageObject.VerifyAudiText();
		PlatformPageObject.VerifyMetricsText();
		PlatformPageObject.VerifyDimensionText();
		PlatformPageObject.VerifyIntervalText();
		PlatformPageObject.VerifyOrderByText();
		PlatformPageObject.VerifyRulesText();
		PlatformPageObject.VerifyTargetText();
		PlatformPageObject.VerifyAddTargetText();
		PlatformPageObject.VerifyAddNewRuleText();
		
	}
	
	@When("^user should able to select all the selections$")
	public void user_should_able_to_select_all_the_selections() throws Throwable {
		PlatformPageObject.ClickOnTheCalendar();
		PlatformPageObject.EnterTheDateFrom();
		PlatformPageObject.EnterTheDateTo();
		PlatformPageObject.ClickAwayOnCurrentDate();
	}

	@Then("^verify user will able to run a report for one week$")
	public void verify_user_will_able_to_run_a_report_for_one_week()  throws Throwable {
		PlatformPageObject.ClickAwayOnSelectDimension();
		PlatformPageObject.ClickAwayOnNETWORK();
		PlatformPageObject.ClickAwayOnNetworkDropdown();
		PlatformPageObject.ClickOnRunButton();
		PlatformPageObject.SleepTime();
		PlatformPageObject.DisplayedShowInChartText();
		PlatformPageObject.ClickSaveButton();
		PlatformPageObject.NewReportName();
		PlatformPageObject.OkButtonNewReport();
		//PlatformPageObject.ValidateExportReports();
		
	}

	@When("^user should able to select all the selections for one month$")
	public void user_should_able_to_select_all_the_selections_for_one_month() throws Throwable {
		PlatformPageObject.ClickOnTheCalendar();
		PlatformPageObject.EnterTheDateFromForMonth();
		PlatformPageObject.EnterTheDateToFormonth();
		PlatformPageObject.ClickAwayOnCurrentDate();
		
		
		
	}

	@Then("^verify user will able to run a report for one month$")
	public void verify_user_will_able_to_run_a_report_for_one_month() throws Throwable {
		PlatformPageObject.ClickAwayOnSelectDimension();
		PlatformPageObject.ClickAwayOnNETWORK();
		PlatformPageObject.ClickAwayOnNetworkDropdown();
		PlatformPageObject.ClickOnRunButton();
		PlatformPageObject.SleepTime();
		PlatformPageObject.DisplayedShowInChartText();
	}
	
	
	@When("^user should able to select all the selections for one year$")
	public void user_should_able_to_select_all_the_selections_for_one_year() throws Throwable {
		PlatformPageObject.ClickOnTheCalendar();
		
	}

	@Then("^verify user will able to run a report for year month$")
	public void verify_user_will_able_to_run_a_report_for_year_month() throws Throwable {
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}