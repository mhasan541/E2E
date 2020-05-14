package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class baseBrowsers  {
 
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver  () throws IOException, InterruptedException
	{
		prop= new Properties();
		FileInputStream fis= new FileInputStream ("C:\\Users\\Mohammad Hasan\\eclipse-workspace\\E2E\\config.properties");
		
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println("Script executing on " + browserName +" browser");
		
		if(browserName.equals("PC - Win - Chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad Hasan\\eclipse-workspace\\605TvWebsites\\drivers\\chromedriver\\");
			//System.setProperty("webdriver.chrome.driver",
				//	System.getProperty("user.dir") + "/drivers/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/drivers/chromedriver.exe");

			driver = new ChromeDriver();
			 driver.manage().window().maximize();
			
			
		}
		
		else if(browserName.equals("PC - Win - Firefox")) {
//			System.setProperty("webdriver.gecko.driver", 
//					System.getProperty("user.dir") + "\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			 
		}
		
	   else if(browserName.equals("PC - Win - IE")) {
		   System.setProperty("webdriver.ie.driver",
				   System.getProperty("user.dir") + "\\drivers\\IEDriverServer.exe");
				//   "C:\\Users\\Mohammad Hasan\\eclipse-workspace\\605tv.com\\drivers\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			 driver.manage().window().maximize();
		
		}
	   else if(browserName.equals("Mac - Mac OS - Safari")) {
		   System.setProperty("webdriver.safari.driver", "");
			 driver = new SafariDriver();
			 driver.manage().window().maximize();
			 
		}
		
	   else if (browserName.equals("PC - Win - IE")){
	   System.setProperty("webdriver.ie.driver",
				System.getProperty("user.dir") + "\\drivers\\IEDriverServer.exe");

				DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
				 driver.manage().window().maximize();
	   }
	   else if (browserName.equals("PC - Win - Edge")){
		   System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "\\drivers\\MicrosoftWebDriver.exe");
		   EdgeOptions caps = new EdgeOptions();
		   driver.manage().window().maximize();
		   
	   }
		
	   else {
		   System.out.println("no browser value is given");
	   }
		
	//driver.get(prop.getProperty("application_id"));
	//System.out.println( " URL " + driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return driver;
		
		
		

		
	  
		}
}

/*	public static void browsers () throws IOException {
	
	WebDriver driver = null;
	Properties pro = new Properties();
	FileInputStream ip= new FileInputStream("C:\\Users\\Mohammad Hasan\\eclipse-workspace\\605tv.com\\config.properties");
	pro.load(ip);
	
	System.out.println(pro.getProperty("browser"));
	String browserName = pro.getProperty("browser");
	
	
	
	if(browserName.equals("chrome")) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad Hasan\\eclipse-workspace\\605TvWebsites\\drivers\\chromedriver\\");
		//System.setProperty("webdriver.chrome.driver",
			//	System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
	}
	
	else if(browserName.equals("ff")) {
//		System.setProperty("webdriver.gecko.driver", 
//				System.getProperty("user.dir") + "\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 
	}
	
   else if(browserName.equals("ie")) {
	   System.setProperty("webdriver.ie.driver", "C:\\Users\\Mohammad Hasan\\eclipse-workspace\\605tv.com\\drivers\\IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
		 
	
	}
   else if(browserName.equals("safari")) {
	   System.setProperty("webdriver.ie.driver", "");
		 driver = new SafariDriver();
		 driver.manage().window().maximize();
		 
	}
   else {
	   System.out.println("no browser value is given");
   }
	
	driver.get(pro.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.close();
	
	
	

	
  
	}*/

//}


