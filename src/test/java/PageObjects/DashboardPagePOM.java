package PageObjects;

import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPagePOM {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public Robot robot;
	
	public DashboardPagePOM(WebDriver driver) throws Exception
	{
	  this.driver = driver;
	  this.wait = new WebDriverWait(this.driver,Duration.ofSeconds(180));
	  robot = new Robot();

	}
	
	public String verifyDashboardTitle()
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("page-title")));
		System.out.println(driver.findElement(By.className("page-title")).getText());
		return driver.findElement(By.className("page-title")).getText();
	}
	
	public void waitForPageToLoad()
	{
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("")));
	}

}
