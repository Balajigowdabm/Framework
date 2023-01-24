package com.Naukri.QA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Naukri.QA.Base.TestBase;

public class LoginPage extends TestBase{

private static final String Profilelink = null;

//PageFactory or Object Repository
	@FindBy(id="usernameField")
	WebElement username;
	
	@FindBy(id="passwordField")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement loginbtn;
	
	@FindBy(xpath="//div[@title='Balaji Gowda BM']")
	WebElement profile;

	public LoginPage() {//Constructor to initialize the above objects
		PageFactory.initElements(driver, this);//this is to initialize the page factory
	}
	//Actions: or different features available on the page.
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	
    public void login(String un, String pwd) {
	username.sendKeys(un);
	password.sendKeys(pwd);
	loginbtn.click();
    }
	
	public ProfilePage ClickOnProfilepage() {
		profile.click();
		return new ProfilePage();//returning the Profile page objects.
	}
}

