package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {
	static WebDriver dr=null;
	
	public static WebDriver getBrowser() {
    String bname="";
    Properties prop;
	try {
		prop = CommonLib.readFromFile();
		bname= prop.getProperty("browser");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    //System.out.println(prop.getProperty("browser"));
    
    if(bname.equalsIgnoreCase("FF")){
     //System.out.println(bname);
     dr= new FirefoxDriver();
    }
    else if(bname.equalsIgnoreCase("CH")){
    	System.setProperty("webdriver.chrome.driver",".//exe_files/chromedriver.exe");
    	dr= new ChromeDriver();
    }
    else if(bname.equalsIgnoreCase("IE")){
    	System.setProperty("webdriver.ie.driver",".//exe_files/IEDriverServer.exe");
    	dr= new InternetExplorerDriver();
    }
    
    
    return dr;
    
	}
}
