package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import java.io.IOException;

// Assuming you have a setup for Selenium WebDriver
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.DashboardPagePOM;
import PageObjects.LoginPagePOM;
import Utilities.ScreenshotUtils;
import Utilities.WebDriverUtil;


public class LoginStepDefinitions {

    public WebDriver driver;
    public LoginPagePOM LoginPage;
    public DashboardPagePOM DashboardPage;
    public ScreenshotUtils screenshot;
    
    @Before
    public void InitialiseResources() throws Exception
    {
    	this.driver = WebDriverUtil.getSharedWebDriver("chrome");
    	LoginPage = new LoginPagePOM(this.driver);
    	DashboardPage = new DashboardPagePOM(this.driver);
    	screenshot = new  ScreenshotUtils(this.driver);
    }
    
    @After
	public void tearDown(Scenario scenario) throws Exception
	{
		if(scenario.isFailed()) {
			
			
			scenario.attach(screenshot.takeScreenshot(),"image/jpg",scenario.getName());
			
		}
    	driver.close();
					
	}
	

    @Given("^Navigate to Markerspro App$")
    public void navigate_to_Markerspro_App() {
        LoginPage.navigateToURL("https://matrix.markerspro.in/");
        
    }

    @When("^enter the username \"([^\"]*)\"$")
    public void enter_the_username(String username) {
    	LoginPage.waitForPageToLoad();
    	LoginPage.enterUsername(username);
    }

    @When("^enter the password \"([^\"]*)\"$")
    public void enter_the_password(String password) {
    	
    	LoginPage.enterPassword(password);
    }

    @When("^submit the credentials$")
    public void submit_the_credentials() {
    	
    	LoginPage.clickOnSubmitButton();
    }

    @Then("^Validate dashboard is displayed$")
    public void validate_dashboard_is_displayed() {
        
    	//DashboardPage.waitForPageToLoad();
    	String message = DashboardPage.verifyDashboardTitle();
    	assertEquals(message,"Dashboard");
    	
    	
    }

    @Then("^Error message should be displayed$")
    public void error_message_should_be_displayed() {
        
    	String message = LoginPage.verifyErrorMessage();
        assertEquals(message,"Invalid login attempt, User not found");
    }
}
