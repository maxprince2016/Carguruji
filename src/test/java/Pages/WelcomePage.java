package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Helper.testBase;

public class WelcomePage extends testBase {
	@FindBy(how=How.CSS, using = "#tdb4 > span.ui-button-text")
	public static WebElement Continue;
	
	@FindBy(how=How.NAME, using ="email_address")
	public static WebElement email;
    @FindBy(how=How.NAME, using ="password")
    public static WebElement password;
    @FindBy(how=How.ID, using= "tdb5")
    public static WebElement SignIn;

	public void Continue(){
		 Continue.click();
	}
    public WelcomePage(WebDriver driver){
    this.driver=driver;
		 }
	}

