package com.Naukri.QA.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Naukri.QA.Util.TestUtil;

public class TestBase {
     public static WebDriver driver;
     public static Properties prop;// made these two objects as global variable.
public TestBase() {
	try {//code to read the properties
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Indium Software\\eclipse-workspace\\"
				+ "FrameworkAutomation\\src\\main\\java\\com\\Naukri\\QA\\Config\\config.Properties");
		prop.load(ip);
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
}
 
public static void initialization() {//method initialization
	String BrowserName=prop.getProperty("Browser");
if (BrowserName.equals("Chrome")){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indium Software\\Desktop\\ChromeDriverLatest\\chromedriver.exe");
	driver=new ChromeDriver();
	}

else if(BrowserName.equals("FireFox")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indium Software\\Desktop\\Geckdriver\\geckodriver.exe");
	driver=new FirefoxDriver();
}
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));
}
}