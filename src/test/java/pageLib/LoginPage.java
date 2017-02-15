package pageLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{
 WebDriver dr;
 WebDriverWait wait;
	public LoginPage(WebDriver dr) {
		this.dr=dr;
		wait= new WebDriverWait(dr,15);
		PageFactory.initElements(dr, this);
	}
//WebDriverWait wait= new WebDriverWait(dr,15);
@FindBy(id="login_field")
WebElement username;

@FindBy(id="password")
WebElement password;

@FindBy(name="commit")
WebElement signinbtn;

@FindBy(xpath=".//*[@id='js-flash-container']/div/div")
WebElement errortext;

public void enterCredentials(String uname, String pass){
	//wait.until(ExpectedConditions.visibilityOf(username));
	username.sendKeys(uname);
	password.sendKeys(pass);
}
public void signin(){
	signinbtn.click();
}
public void clearAllBox(){
	username.clear();
	password.clear();
}
public String getErrorMsg(){
	wait.until(ExpectedConditions.visibilityOf(errortext));
	return errortext.getText();
}
}
