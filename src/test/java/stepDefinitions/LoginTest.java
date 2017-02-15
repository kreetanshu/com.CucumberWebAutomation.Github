package stepDefinitions;

import cucumber.api.java.en.Given;
import pageLib.BasePage;
import pageLib.LoginPage;
import utilities.CommonLib;
import utilities.Drivers;


import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.*;

public class LoginTest{
	WebDriver dr;
	BasePage bp;
	LoginPage lp;
	CommonLib lb;
    
    @Before
	public void select_the_browser_and_url(){
		dr= Drivers.getBrowser();
	    dr.manage().window().maximize();
	    dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    bp=new BasePage(dr);
	    lp=new LoginPage(dr);
	    lb=new CommonLib(dr);
	    System.out.println("Before Hook");
	}
	
	
	@After
	public void tear_Down(){
		System.out.println("After Hook");
		dr.close();
	}

		
	@Given("^The url and browser is selected$")
	public void the_url_and_browser_is_selected() throws Throwable {
		Properties prop= CommonLib.readFromFile();
		System.out.println(prop.getProperty("url"));
	    dr.get(prop.getProperty("url"));
	    lb.waitPageLoad();
	}

	@Then("^The github is opened in required browser$")
	public void the_github_is_opened_in_required_browser() throws Throwable {
	   Asserts.check(dr.getTitle().contains("GitHub"), "Pass");
	   System.out.println(dr.getTitle());
	}

	@Then("^user clicks on sign in button$")
	public void user_clicks_on_sign_in_button() throws Throwable {
	    bp.signClick();
	}

	@When("^user clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
	    lp.signin();
	}

	@Then("^user gets an error message \"(.*?)\"$")
	public void user_gets_an_error_message(String arg1) throws Throwable {
	    System.out.println(lp.getErrorMsg());
	}

	@When("^user enter username and password$")
	public void user_enter_username_and_password(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> data = arg1.raw();
		for(int i=1;i<data.size();i++){
			   lp.clearAllBox();
			   lp.enterCredentials(data.get(i).get(0), data.get(i).get(1));
			   System.out.println(data.get(i).get(0));
               System.out.println(data.get(i).get(1));
               Thread.sleep(6000);
               lp.signin();
              
			}
		}
	  

	@Then("^user (?:can|cannot) login with credentials$")
	public void user_can_login_with_credentials() throws Throwable {
	   
	}
    

}
