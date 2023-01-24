package com.Naukri.QA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Naukri.QA.Base.TestBase;

public class ProfilePage extends TestBase{
	
	@FindBy(xpath="//input[@id='attachCV']")
	WebElement Uploadbtn;

	@FindBy(xpath="//img[@alt='naukri user profile img']")
	WebElement Profileicon;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement Logout;


public ProfilePage() {
	PageFactory.initElements(driver, this);
}

public void ResumeUpdate() {
	Uploadbtn.sendKeys("C:\\Users\\Indium Software\\Downloads\\Resume (1).pdf");
	Profileicon.click();
	Logout.click();
}
}
