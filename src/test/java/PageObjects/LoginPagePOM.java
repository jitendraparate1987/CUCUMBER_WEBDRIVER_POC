package PageObjects;

import java.awt.Robot;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePOM {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public Robot robot;
		

	public LoginPagePOM(WebDriver driver) throws Exception
	{
	  this.driver = driver;
	  this.wait = new WebDriverWait(this.driver,Duration.ofSeconds(180));
	  robot = new Robot();

	}
	
	public void navigateToURL(String URL) {
		driver.get(URL);
				
	}
	
	public void waitForPageToLoad()
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Username")));
	}
	
	public void enterUsername(String Username)
	{
		driver.findElement(By.id("Username")).sendKeys(Username);;
	}
	
	public void enterPassword(String Password)
	{
		driver.findElement(By.id("Password")).sendKeys(Password);
	}
	
	public void clickOnSubmitButton()
	{
		driver.findElement(By.className("btn-success")).click();
	}

	public String verifyErrorMessage()
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("swal-text")));
		System.out.println(driver.findElement(By.className("swal-text")).getText());
		return driver.findElement(By.className("swal-text")).getText();
		
	}
	
	public void clickOnConfirmationButton()
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("swal-button--confirm")));
		driver.findElement(By.className("swal-button--confirm")).click();
		
	}

	
		
	
}
