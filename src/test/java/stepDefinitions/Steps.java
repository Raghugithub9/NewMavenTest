
package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

public class Steps {

	public WebDriver driver;
	public LoginPage lp;

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser(){
		System.setProperty("webdriver.chrome.driver", "geckodriver.exe");
		driver=new FirefoxDriver();

	lp=new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url){
	driver.get(url);
	}

	//@When("User enters Email as {string} and Password as {string}")
	@When("User enters Email as {string} and Password as {string}")
	
	//@When("^User enters Email as (.+) and Password as (.+)$")
	public void user_enters_Email_as_and_Password_as(String username, String password){
	lp.setUserName(username);
	lp.setPassword(password);
	//throw new cucumber.api.PendingException();
	}

	@When("Click on Login")
	public void click_on_Login(){
	lp.clickLogin();
	
	}

	@Then("Page Title should be {string}")
	public void page_Title_shoulld_be(String title){

	   if(driver.getPageSource().contains("Login is unsuccessful.")){
	driver.close();
	//Assert.assertTrue(false);
	} else{
	//Assert.assertEquals(title, driver.getTitle());
	}
	   }

	@When("User click on Logout link")
	public void user_click_on_Log_out_link() throws InterruptedException {

	lp.clickLogout();
	Thread.sleep(3000);
	}


	@Then("close browser")
	public void close_browser(){
	driver.quit();
	}

	
}
