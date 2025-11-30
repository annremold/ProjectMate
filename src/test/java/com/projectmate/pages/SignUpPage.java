package com.projectmate.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
WebDriver driver;
public SignUpPage(WebDriver driver) {
	this.driver=driver;
}
By nameField = By.name("name");
By emailField =By.name("email");
By orgField =By.name("organisationName");
By passField =By.name("password");
By createAccount =By.xpath("//button[@type='submit']");
By errMsg=By.xpath("//p[text()='Invalid email address']");

public void EnterName(String name) {
	driver.findElement(nameField).clear();
	driver.findElement(nameField).sendKeys(name);
}
public void EnterEmail(String email) {
	driver.findElement(emailField).clear();
	driver.findElement(emailField).sendKeys(email);
}

public void EnterOrg(String org) {
	driver.findElement(orgField).clear();
	driver.findElement(orgField).sendKeys(org);
}
public void EnterPass(String pass) {
	driver.findElement(passField).clear();
	driver.findElement(passField).sendKeys(pass);
}
public void clickCreateAcc() {
	driver.findElement(createAccount).click();
}
public String errorMsg() {
	return driver.findElement(errMsg).getText();
}

}
