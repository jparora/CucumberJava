//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinition {
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
//	@Then("^User Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void User_Enter_Email_Password(String Email,String Password){
//		
//	driver.findElement(By.xpath("//*[@id=\"cand_email\"]")).sendKeys(Email);
//	driver.findElement(By.xpath("//*[@id=\"cand_password\"]")).sendKeys(Password);	
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
//	@Then("^User is on Home Page$")
//	public void User_on_home_page(){
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	String text = driver.findElement(By.xpath("//*[@id=\"candidate-home\"]/div[5]/div[1]/div[1]/h2")).getText();
//	System.out.println(text);
//	Assert.assertEquals("Jai Prakash Arora", text);
//	}
//} 
