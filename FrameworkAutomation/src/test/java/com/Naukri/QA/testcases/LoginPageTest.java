package com.Naukri.QA.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Naukri.QA.Base.TestBase;
import com.Naukri.QA.pages.LoginPage;
import com.Naukri.QA.pages.ProfilePage;

public class LoginPageTest extends TestBase {
	LoginPage lp;
	ProfilePage pp;

	public LoginPageTest() {
		 super();// it will call the parent class constructors.i.e to call TestBase call the
				// constructors while is already been defined.
	}

	@BeforeMethod
	public void SetUp() {
		initialization();
		lp = new LoginPage();
		pp= new ProfilePage();
		
	}

	@Test(priority=1)
	public void TanishTest() {
		String title=lp.ValidateLoginPageTitle();
	Assert.assertEquals(title,"Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com");
	System.out.println("I executed first");
	}
	
	@Test(priority=1)
	public void AbhiTest() {
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
	lp.ClickOnProfilepage();
		pp.ResumeUpdate();
		System.out.println("I exceuted second");
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		System.out.println("Pushed to git");
	}

}
