package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverUtil {
	
	
	public static WebDriver driver;
	
	
	public static WebDriver getSharedWebDriver(String WebBrowser)
	{
		if(WebBrowser.equalsIgnoreCase("chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			  
			  options.addArguments("disable-infobars");
			  options.addArguments("disable-extensions");
			  options.addArguments("disable-notifications");
			  
		     System.setProperty("webdriver.chrome.driver","C:\\Users\\JitendraPara_rqdxkn\\eclipse-workspace\\WEBDRIVER\\drivers\\chromedriver.exe");
			 
				driver = new ChromeDriver(options);
					     
		}
		else if(WebBrowser.equalsIgnoreCase("InternetExplorer"))
		{
			
		}
		else if(WebBrowser.equalsIgnoreCase("Mozilla"))
		{
			
		}
		else if(WebBrowser.equalsIgnoreCase("Edge"))
		{
			
		}
		else
		{
			System.out.println("Web Browser is not available. Script will terminate");
			System.exit(0);
			
		}
		
		return driver;

	}

}
