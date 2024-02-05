package Utilities;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {
	
	
	public WebDriver driver;
	
	public ScreenshotUtils(WebDriver driver) {
		this.driver = driver;
	}

		public byte[] takeScreenshot() throws IOException
	{
		
		byte[] scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		   return scrFile;
		 
           
	}

		

}
