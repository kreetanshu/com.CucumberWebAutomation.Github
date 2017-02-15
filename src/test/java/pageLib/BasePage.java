package pageLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Drivers;

public class BasePage {
   WebDriver dr;
   WebDriverWait wait;
   
    
	public BasePage(WebDriver dr){
		this.dr =dr;
		wait= new WebDriverWait(dr,15);
		PageFactory.initElements(dr, this);
	}

	
@FindBy(linkText="Sign in")
WebElement signinbtn;

public void signClick(){
	wait.until(ExpectedConditions.visibilityOf(signinbtn));
	signinbtn.click();
}

	
}
