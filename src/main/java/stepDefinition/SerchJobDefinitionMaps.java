package stepDefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

   public class SerchJobDefinitionMaps {

		WebDriver driver;

		@Given("^User is available on login page$")
	    public void user_available_on_login_Page() {	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		    driver.get("https://www.cv-library.co.uk/candidate/login");	
	   } 
		
		@When("^Title of login page is CV Library$")
		public void title_of_login_page(){
			
		String title =	driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Candidate Login - CV-Library Candidate Area", title);
		}
		
		@Then("^User Enters Email and Password$")
		public void User_Enter_Email_Password(DataTable credentials){
		for(Map<String, String> detail : credentials.asMaps(String.class, String.class)){
		driver.findElement(By.xpath("//*[@id=\"cand_email\"]")).sendKeys(detail.get("Email"));
		driver.findElement(By.xpath("//*[@id=\"cand_password\"]")).sendKeys(detail.get("Password"));	
		}
		}
		@And("^User Click on Login btn$")
		public void user_click_login_btn(){
			
	    WebElement element = driver.findElement(By.cssSelector("#login > div.login-card.card > div.cand-login > input.cvl-btn"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}
		
		@Then("^User land on My account page$")
		public void User_on_home_page(){
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		String text = driver.findElement(By.xpath("//*[@id=\"candidate-home\"]/div[5]/div[1]/div[1]/h2")).getText();
		System.out.println(text);
		Assert.assertEquals("Jai Prakash Arora", text);
		}
		
	    @Then("^User Enters job details the Keyword, Location and Search limit$")
	    public void user_Enters_job_details_the_Keyword_Location_and_Search_limit(DataTable JobDetails){
	    for(Map<String,String>search : JobDetails.asMaps(String.class, String.class)) {
	    driver.findElement(By.xpath("//*[@id=\"header-search-keywords\"]")).sendKeys(search.get("Keyword"));
	    driver.findElement(By.xpath("//*[@id=\"header-search-location\"]")).sendKeys(search.get("Location"));
	    Select distance = new Select(driver.findElement(By.xpath("//*[@id=\"header-search-distance\"]")));
	    distance.selectByVisibleText(search.get("Distance"));
	    WebElement find = driver.findElement(By.cssSelector("#header-new-960 > div.search-nav.search-nav--old > div > form > input.search-nav__submit.cvl-btn"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", find);
		driver.navigate().back();
	    }
	    }
	    
	    @Then("^user get list of jobs available with refine search option$")
	    public void user_get_list_og_jobs_available() {
	    driver.navigate().forward();	
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    String results = driver.findElement(By.cssSelector("#advancedsearch > h2")).getText();
	    Assert.assertEquals("Refine your search", results);
	    }


	} 


