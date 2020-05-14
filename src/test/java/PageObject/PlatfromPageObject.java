/**
 * 
 */
package PageObject;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Interface.PlatformInterface;

/**
 * @author Mohammad Hasan
 *
 *
 * This clas will store all the locators and methods of platform page
 *
 */
public class PlatfromPageObject  {
 public WebDriver driver; 

	public PlatfromPageObject (WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
// LOGIN PAGE
	
//Credensial
	@FindBy(xpath= "/html/body/div/main/div/form/div[1]/input")
	WebElement username;
	
	@FindBy(xpath= "/html/body/div/main/div/form/div[2]/input")
	WebElement password;
	
	@FindBy(xpath= "/html/body/div/main/div/form/div[4]/button")
	WebElement loginbutton;
	
	// platform logo
	@FindBy(xpath= "/html/body/div/div/div[1]/header/div[1]/a/img")
	WebElement logo;

/// Home Page ?//	
	
	// main deshboard text 
	@FindBy(xpath= "//*[@id=\"content\"]/div/header/div[1]/h1")
	WebElement homePagetext;
	
	//user name on the home page
	
	
	@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/div[2]/aside[1]/div[1]/ul[1]/li[2]/a[1]/span[1]")
	WebElement reportsButton;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/header/div[1]/h1")
	WebElement reportsText;
	
	//user name on the home page
	@FindBy(xpath= "/html/body/div/div/div[1]/header/div[2]/ul[1]/li/a/div")
	WebElement UserProfile_Button;
	
	@FindBy(xpath= "/html/body/div/div/div[1]/header/div[2]/ul[1]/li/ul/li[5]/a")
	WebElement Logout_Button;
	
	@FindBy(xpath= "//span[contains(text(),'User Settings')]")
	WebElement User_Setting;
	
	@FindBy(xpath= "/html/body/div/div/div[1]/header/div[2]/ul[1]/li/ul/li[2]/a")
	WebElement Clear_Cache;
	
	@FindBy(xpath= "//span[contains(text(),'Demo Mode')]")
	WebElement Demo_Mode;
	
	@FindBy(xpath= "//span[contains(text(),'Advanced Mode')]")
	WebElement Advanced_Mode;
	
//// OLD REPORT PAGE// 
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/header/div[1]/div/button")
	WebElement newButton;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/section/table/thead[1]/tr/th/input")
	WebElement reportsSearchBox;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/section/table/thead[2]/tr/th[1]")
	WebElement nameColumn;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/section/table/thead[2]/tr/th[2]")
	WebElement createdColumn;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/section/table/thead[2]/tr/th[3]")
	WebElement modifiedColumn;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/section/table/thead[2]/tr/th[4]")
	WebElement lastModifiedColumn;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/section/table/thead[2]/tr/th[5]")
	WebElement publicColumn;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/section/table/thead[2]/tr/th[6]")
	WebElement actionsColumn;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/div[2]/div[2]")
	WebElement newReportText;
	
	
	
//// NEW REPORT PAGE ////	
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/div[1]/div[2]/date-range-picker2/div/a/div[1]")
	WebElement calendarButton;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/div[1]/div[2]/date-range-picker2/div/div/div[2]/div[1]/div/input")
	WebElement calendarDateFrom;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/div[1]/div[2]/date-range-picker2/div/div/div[2]/div[3]/div/input")
	WebElement calendarDateTO;
	
	@FindBy(xpath= "/html/body/div/div/div[1]/header/div[2]/div")
	WebElement CurrentDate;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/div[3]/div[1]/div[2]/div[2]/div/filter-dropdown/div/div[1]/span")
	WebElement Select_Dimension;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/div[3]/div[1]/div[2]/div[2]/div/filter-dropdown/div/div[2]/ul/li[4]/div")
	WebElement NETWORK ;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/div[3]/div[1]/div[2]/div[2]/div/filter-dropdown/div/div[2]/ul/li[4]/ul[1]/li/div/div")
	WebElement NetworkDropdown;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/div[1]/div[1]/div[2]/div/div")
	WebElement run;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/div[3]/div[4]/div[3]/div/div/table/thead/tr[2]/th[5]/div[1]")
	WebElement ShowInChart ;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/div[1]/div[1]/div[3]/div")
	WebElement exportButton ;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/div[1]/div[1]/div[1]/div")
	WebElement saveButton ;
	
	@FindBy(xpath= "//*[@id=\"input_2941\"]")
	WebElement newReportname ;
	
	@FindBy(xpath= "/html/body/div[3]/md-dialog/md-dialog-actions/button[2]")
	WebElement OkButtonForNewReport ;
	
	@FindBy(xpath= "//div[contains(text(),'Config')]")
	WebElement configButton ;
	
	@FindBy(xpath= "//body//div//div//div//div//div//div[1]//div[1]//div[5]//div[1]")
	WebElement auditButton ;
	
	@FindBy(xpath= "//div[contains(text(),'Metrics')]")
	WebElement MetricsText ;
	
	@FindBy(xpath= "//div[contains(text(),'Dimensions')]")
	WebElement dimensionsText ;
	
	@FindBy(xpath= "//div[contains(text(),'Interval')]")
	WebElement intervalText ;
	
	@FindBy(xpath= "//div[contains(text(),'Order By')]")
	WebElement OrderBy_Text ;
	
	@FindBy(xpath= "//div[contains(text(),'Rules')]")
	WebElement Rules_Text ;
	
	@FindBy(xpath= "//body/div/div/div/div/div/div/div/div[6]/div[1]")
	WebElement TargetText ;
	
	@FindBy(xpath= "//*[@id=\"content\"]/div/div[3]/div[1]/div[6]/div[2]/filter-dropdown/div/div[1]")
	WebElement Add_Target_Button ;
	
	@FindBy(xpath= "//label[contains(text(),'Metric displayed')]")
	WebElement Metric_Displayed_Text ;
	
	@FindBy(xpath= "//span[contains(text(),'Add New Rule')]")
	WebElement Add_New_Rule_Button ;
	
	
	
	
	public void CloseTheBrowser () throws InterruptedException {
		Thread.sleep(500);
		driver.quit();
		
	}
	
public void ValidateExportReports () throws InterruptedException {
		
		exportButton.click();
		Thread.sleep(500);
		
		File fileLocation = new File ("C:\\Users\\Mohammad Hasan\\Downloads");
		
	File[] totalFiles=	fileLocation.listFiles();
		
		for ( File file : totalFiles) {
			if (file.getName().equals("Networks_report")) {
				System.out.println("Exported report..");
				break; 
			} else {
				System.out.println("report didnt export");
				break; 
			}
		}
}

public void VerifyExportButtonDisplayed() {
	 exportButton.isDisplayed();
}

	 public void SleepTime() {
		 driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	 }
	 
	public void EnterPlatformCredential ( ) {
		username.sendKeys("mhasan@605.tv");
		password.sendKeys("Welcome1!");
	}
	
	public void ClickOnLoginButton ( ) {
		loginbutton.click();
	}
	
	public void LogoDisplay ( ) {
		logo.isDisplayed();
	}
	
	public void ReportsTextDisplay ( ) {
		reportsText.isDisplayed();
	}
	
	public void UserNameOnHomePage ( ) {
		UserProfile_Button.isDisplayed();
	}
	public void ClickOnTheReportsButton ( ) {
		Actions action = new Actions(driver);
		WebElement temp = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/aside[1]/div[1]/ul[1]/li[2]/a[1]/span[1]"));
		action.moveToElement(temp).build().perform();
		temp.click();
	}
	public void ClickOnNewButton ( ) {
		newButton.click();
	}
	public void SearchBoxForReports ( ) {
		reportsSearchBox.sendKeys("Hasan");
	}
	public void NameColumnButton ( ) {
		nameColumn.isDisplayed();
	}
	public void CreatedColumnButton ( ) {
		createdColumn.isDisplayed();
	}
	public void ModifiedColumnButton ( ) {
		modifiedColumn.isDisplayed();
	}
	public void LastModifiedColumnButton ( ) {
		lastModifiedColumn.isDisplayed();
	}
	public void PublicColumnButton ( ) {
		publicColumn.isDisplayed();
	}
	public void MainDashboardDisplay ( ) {
		homePagetext.isDisplayed();
	}
	public void ActionsColumnButton ( ) {
		actionsColumn.isDisplayed();
	}
	
	public void NewReportText ( ) {
		Assert.assertTrue("New Report", newReportText.isDisplayed());
		System.out.println("New Report Displayed");
	}
	
	public void ClickOnTheCalendar () {
		calendarButton.click();
		
	}
	
	// Report for 1 week
	public void EnterTheDateFrom () {
		calendarDateFrom.clear();
		calendarDateFrom.sendKeys("2020-01-01 06:00");
	}
	
	public void EnterTheDateTo () {
		calendarDateTO.clear();
		calendarDateTO.sendKeys("2020-01-07 06:00");
	}
	public void ClickAwayOnCurrentDate () {
		CurrentDate.click();
		
	}
	
	public void ClickAwayOnSelectDimension () {
		Select_Dimension.click();
		
	}
	public void ClickAwayOnNETWORK () {
		NETWORK.click();
		
	}
	public void ClickAwayOnNetworkDropdown () {
		NetworkDropdown.click();
		
	}
	public void ClickOnRunButton () throws InterruptedException {
		run.click();
		
		
	}
	public void DisplayedShowInChartText () throws InterruptedException {
		
		Assert.assertTrue("Show In Chart", ShowInChart.isDisplayed());
		System.out.println("Report Ran Succesfully ");
		Thread.sleep(500);
	}
	
	
	public void ClickSaveButton() {
		saveButton.click();
		
	}
	public void VerifySaveButtonDisplayed() {
		saveButton.isDisplayed();
		
	}
	
	public void NewReportName() {
		newReportname.clear();
		newReportname.sendKeys("Networks Report");
		
	}
	
	public void OkButtonNewReport() throws InterruptedException {
		OkButtonForNewReport.click();
		Thread.sleep(500);
	}
	
	// Report for one month
	public void EnterTheDateFromForMonth () {
		calendarDateFrom.clear();
		calendarDateFrom.sendKeys("2020-01-01 06:00");
	}
	
	public void EnterTheDateToFormonth () {
		calendarDateTO.clear();
		calendarDateTO.sendKeys("2020-01-30 06:00");
	}
	// Report for year month
		public void EnterTheDateFromForYear () {
			calendarDateFrom.clear();
			calendarDateFrom.sendKeys("2020-01-01 06:00");
		}
		
		public void EnterTheDateToForYear () {
			calendarDateTO.clear();
			calendarDateTO.sendKeys("2020-01-30 06:00");
		}
		
	
	
  public void VerifyMetricsText () throws InterruptedException {
		
		Assert.assertTrue("Metrics", MetricsText.isDisplayed());
		System.out.println("Metrics Displayed");
		
	}
	
  public void VerifyDimensionText () throws InterruptedException {
	
	Assert.assertTrue("Dimensions", dimensionsText.isDisplayed());
	System.out.println("Dimensions Displayed");
	
}
	
  public void VerifyIntervalText () throws InterruptedException {
		
		Assert.assertTrue("Interval", intervalText.isDisplayed());
		System.out.println("Interval Displayed");
		
	}
  
  public void VerifyOrderByText () throws InterruptedException {
		
		Assert.assertTrue("Order By", OrderBy_Text.isDisplayed());
		System.out.println("Order By Displayed");
		
	}
	
  public void VerifyRulesText () throws InterruptedException {
		
		Assert.assertTrue("Rules", Rules_Text.isDisplayed());
		System.out.println("Rules Displayed");
		
	}
	
  public void VerifyTargetText () throws InterruptedException {
		
		Assert.assertTrue("Target ", TargetText.isDisplayed());
		System.out.println("Target Displayed");
		
	}
	
  public void VerifyAddTargetText () throws InterruptedException {
		
		Assert.assertTrue("Add Target ", Add_Target_Button.isDisplayed());
		System.out.println("Add Target Displayed");
		
	}
	
  public void VerifyMetricDisplayedText () throws InterruptedException {
		
		Assert.assertTrue("Metric displayed ", Metric_Displayed_Text.isDisplayed());
		System.out.println("Metric  displayed Displayed");
		
	}
	
  public void VerifyConfigText () throws InterruptedException {
		
		Assert.assertTrue("Config ", configButton.isDisplayed());
		System.out.println("Config Displayed");
		
	}
	
  public void VerifyAudiText () throws InterruptedException {
		
		Assert.assertTrue("Audit", auditButton.isDisplayed());
		System.out.println("Audit Displayed");
		
	}
	
  public void VerifyAddNewRuleText () throws InterruptedException {
		
		Assert.assertTrue("Add New Rule ", Add_New_Rule_Button.isDisplayed());
		System.out.println("Add New Rule Displayed");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
	
