package StepDef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Helper.testBase;
import Pages.AcctInfoPage;
import Pages.HomePage;
import Pages.WelcomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class WelcomePageStep extends testBase {
	
	@Before
	public void SetUp() throws IOException{
		initialize();
	}
	@Given("^I am on carguruji HomePage$")
	public void i_am_on_carguruji_HomePage() throws Throwable {
		driver.get(CONFIG.getProperty("testSiteName"));
		driver.manage().window().maximize();	
	}

	@Given("^I click My Account button$")
	public void i_click_My_Account_button() throws Throwable {
	  HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	  homepage.My_Account();
	}

	@Given("^I click countinue button$")
	public void i_click_countinue_button() throws Throwable {
	   WelcomePage welcome=PageFactory.initElements(driver, WelcomePage.class);
	   welcome.Continue();
	}

	@When("^I tick gender option$")
	public void i_tick_gender_option() throws Throwable {
	 AcctInfoPage acctinfo =   PageFactory.initElements(driver, AcctInfoPage.class);
	 acctinfo.click_gender();
	}

	@When("^I fill all the mandatory fileds$")
	public void i_fill_all_the_mandatory_fileds() throws Throwable {
		AcctInfoPage acctinfo =   PageFactory.initElements(driver, AcctInfoPage.class);
		acctinfo.type_firstname();
		acctinfo.type_lastname();
		acctinfo.click_dob();
		acctinfo.type_age();
		acctinfo.type_email_address();
		acctinfo.type_street_address();
		acctinfo.type_postcode();
		acctinfo.type_city();
		acctinfo.type_state();
		acctinfo.click_country();
		acctinfo.type_country();
		acctinfo.type_telephone();
		acctinfo.type_password();
		acctinfo.type_confirmation();
		
	}

	@When("^I click the continue link$")
	public void i_click_the_continue_link() throws Throwable {
		AcctInfoPage acctinfo =   PageFactory.initElements(driver, AcctInfoPage.class);
		acctinfo.click_countinue_button();
	}

	@Then("^I see my account has been created$")
	public void i_see_my_account_has_been_created() throws Throwable {
		
	Assert.assertEquals("Your Account Has Been Created!", driver.findElement(By.cssSelector("h1")).getText());
	System.out.println("congpage");
		 
		
	
	}
	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	driver.close();
	
	}
}
