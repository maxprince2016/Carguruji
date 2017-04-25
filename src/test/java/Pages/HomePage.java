package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Helper.testBase;

public class HomePage extends testBase{
@FindBy(how=How.LINK_TEXT, using = "My Account")
public static WebElement My_Account;


public void My_Account(){
	 My_Account.click();
}
	 public HomePage(WebDriver driver){
		 this.driver=driver;
	 }
}










