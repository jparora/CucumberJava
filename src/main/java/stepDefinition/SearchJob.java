//package stepDefinition;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class SearchJob {
//	
//	WebDriver driver;
//
//	@Given("^User is available on login page$")
//    public void user_available_on_login_Page() {	
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Chromedriver\\chromedriver.exe");
//		driver = new ChromeDriver();
//	    driver.get("https://www.cv-library.co.uk/candidate/login");	
//   } 
//	
//	@When("^Title of login page is CV Library$")
//	public void title_of_login_page(){
//		
//	String title =	driver.getTitle();
//	System.out.println(title);
//	Assert.assertEquals("Candidate Login - CV-Library Candidate Area", title);
//	}
//	
//	@Then("^User Enters Email and Password$")
//	public void User_Enter_Email_Password(DataTable credentials){
//		 List<List<String>> detail =  credentials.raw();
//	driver.findElement(By.xpath("//*[@id=\"cand_email\"]")).sendKeys(detail.get(0).get(0));
//	driver.findElement(By.xpath("//*[@id=\"cand_password\"]")).sendKeys(detail.get(0).get(1));	
//	}
//	
//	@And("^User Click on Login btn$")
//	public void user_click_login_btn(){
//		
//    WebElement element = driver.findElement(By.cssSelector("#login > div.login-card.card > div.cand-login > input.cvl-btn"));
//	JavascriptExecutor executor = (JavascriptExecutor)driver;
//	executor.executeScript("arguments[0].click();", element);
//	}
//	
//	@Then("^User land on My account page$")
//	public void User_on_home_page(){
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	String text = driver.findElement(By.xpath("//*[@id=\"candidate-home\"]/div[5]/div[1]/div[1]/h2")).getText();
//	System.out.println(text);
//	Assert.assertEquals("Jai Prakash Arora", text);
//	}
//	
//
//    @Then("^User Enters job details the Keyword, Location and Search limit$")
//    public void user_Enters_job_details_the_Keyword_Location_and_Search_limit(DataTable JobDetails){
//    List<List<String>> search = JobDetails.raw();
//    driver.findElement(By.xpath("//*[@id=\"header-search-keywords\"]")).sendKeys(search.get(0).get(0));
//    driver.findElement(By.xpath("//*[@id=\"header-search-location\"]")).sendKeys(search.get(0).get(1));
//    Select distance = new Select(driver.findElement(By.xpath("//*[@id=\"header-search-distance\"]")));
//    distance.selectByVisibleText(search.get(0).get(2));
//    }
//
//    @Then("^User Click on the Find Jobs btn$")
//    public void user_Lick_on_the_Find_Jobs_btn(){
//    WebElement find = driver.findElement(By.xpath("//*[@id=\"header-new-960\"]/div[2]/div/form/input[2]"));
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//	executor.executeScript("arguments[0].click();", find);
//    }
//    
//    @Then("^user get list of jobs available with refine seatch option$")
//    public void user_get_list_og_jobs_available() {
//    String results = driver.findElement(By.cssSelector("#advancedsearch > h2")).getText();
//    Assert.assertEquals("Refine your search", results);
//    }
//
//
//} 
