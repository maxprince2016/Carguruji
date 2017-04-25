package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Helper.testBase;

public class AcctInfoPage extends testBase {
	@FindBy(how=How.NAME, using = "gender")
	public static WebElement Male;
	@FindBy(how=How.NAME, using = "firstname")
	public static WebElement My_FisrtName;
	
	@FindBy(how=How.NAME, using = "lastname")
	public static WebElement My_LastName;
	
	@FindBy(how=How.ID, using ="dob")
	public static WebElement Age;
	
	@FindBy(how=How.NAME, using ="email_address")
	public static WebElement Email;
	
	@FindBy(how=How.NAME, using ="street_address")
	public static WebElement My_Street_Address;
	
	@FindBy(how=How.NAME, using ="postcode")
	public static WebElement My_Postcode;
	
	@FindBy(how=How.NAME, using ="city")
	public static WebElement My_City;
	
	@FindBy(how=How.NAME, using ="state")
	public static WebElement My_State;
	
	@FindBy(how=How.NAME, using ="country")
	public static WebElement My_Country;
	
	@FindBy(how=How.NAME, using ="telephone")
	public static WebElement My_telephone;
	
	@FindBy(how=How.NAME, using ="password")
	public static WebElement My_Password;
	
	@FindBy(how=How.NAME, using ="confirmation")
	public static WebElement My_Confirmation;
	
	@FindBy(how=How.ID, using = "tdb4")
	public static WebElement Countinue_button;
	
	public void click_gender(){
		Male.click();
	}
		public void type_firstname(){
			My_FisrtName.sendKeys("feranmi");		
	}
		public void type_lastname(){
			My_LastName.sendKeys("Olad");		
		}
		public void click_dob(){
			Age.click();		
	}
		public void type_age(){
			Age.sendKeys("04/23/1999");			
}
		public void type_email_address(){
			Email.sendKeys("folad17@gmail.com");	
		}
		public void type_street_address(){
			My_Street_Address.sendKeys("19 Callender road");	
		}	
		public void type_postcode(){
			My_Postcode.sendKeys("DA8 3DD"); 	
		}
			
		public void type_city(){
			My_City.sendKeys("London");
		}
		public void type_state(){
			My_State.sendKeys("Kent");
		}
			public void click_country(){
				My_Country.click();	
		}
		public void type_country(){
			My_Country.sendKeys("United Kingdom");
			
		}
		public void type_telephone(){
			My_telephone.sendKeys("07886123984");
		}
		public void type_password(){
			My_Password.sendKeys("kurukere");	
}
		public void type_confirmation(){
			My_Confirmation.sendKeys("kurukere");	
}	
		public void click_countinue_button(){
			Countinue_button.click();
		}
		
		public AcctInfoPage(WebDriver driver){
		    this.driver=driver;
}
		
		
		
}	
		
		
		
		
		