package PDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Interface.PlatformInterface;

public class ExportReports extends PlatformInterface {
 public static WebDriver driver ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://tvm-ui.qa.platf0rm.605.nu/login?redirect=1");
		
		
		
		
		
		
		
		
		
		
	}

}
