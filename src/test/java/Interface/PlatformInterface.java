package Interface;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Config.baseBrowsers;
import PageObject.PlatfromPageObject;

public class PlatformInterface extends baseBrowsers {
	public WebDriver driver;
	//public WebDriver driver ;

 //PlatfromPageObject PlatfromPageObject ;
	public PlatfromPageObject PlatformPageObject ;
	
	

	
	 
	
	
	public WebDriver NavigateToBrowser () throws IOException, InterruptedException {
		return driver= initializeDriver();
	}

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
