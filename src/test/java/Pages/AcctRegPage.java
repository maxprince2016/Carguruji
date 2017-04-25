package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Helper.testBase;


public class AcctRegPage extends testBase{
	@FindBy(how=How.CSS, using = "h1")
	public static WebElement congpage;
	
public void verify_message(){
	 congpage.getText();
	
}
		
		
}
