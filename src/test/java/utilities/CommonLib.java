package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonLib {
	WebDriver dr=null;
	public CommonLib(WebDriver dr){
		this.dr=dr;
	}

	public static Properties readFromFile() throws IOException{
		File fl = new File(".\\src\\test\\java\\utilities\\constant.properties");
		 FileInputStream src = new FileInputStream(fl);
		 Properties prop = new Properties();
		 prop.load(src);
		 return prop; 
	}
	
	public void maximize(){
		dr.manage().window().maximize();
	}
	
	public void waitPageLoad(){
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void alertAccept(){
		Alert al = dr.switchTo().alert();
		al.accept();
	}
	public void alertDismiss(){
		Alert al = dr.switchTo().alert();
		al.dismiss();
	}
	public void selectFromDrop(WebElement el, String vsbltext){
		Select sl = new Select(el);
		sl.selectByVisibleText(vsbltext);
		
	}
	
	
	
	
}
