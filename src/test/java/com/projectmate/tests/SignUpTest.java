package com.projectmate.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectmate.pages.SignUpPage;

public class SignUpTest {
	WebDriver driver;
	SignUpPage signup;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://architect-testing.projectsmate.com/signup");
		 signup = new SignUpPage(driver);
	}
    @Test(priority=1)
	public void validSignUpTest() {
		signup.EnterName("Ann");
		signup.EnterEmail("ann12345@gmail.com");
		signup.EnterOrg("qst");
		signup.EnterPass("877ghjkl");
		signup.clickCreateAcc();
		String currentUrl=driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("/dashboard"),"BUG: App does not redirect to  Dashboard after signup\"");

	}
    @Test(priority=2)
	public void invalidSignUpTest() {
		signup.EnterName("Ann");
		signup.EnterEmail("ann12gmail.com");
		signup.EnterOrg("qst");
		signup.EnterPass("877ghjkl");
		signup.clickCreateAcc();
		String errortextActual=signup.errorMsg();
		String expected="Invalid email address";
		Assert.assertEquals(errortextActual, expected, "Not as expected");

	}
	
	@AfterClass
    public void tearDown() {
        driver.quit();
    }

}
