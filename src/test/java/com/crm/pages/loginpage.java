package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	
	private WebDriver driver;
	
	//initialize driver
	public loginpage(WebDriver driver ) {
	this.driver=driver;
	
	}
	
	//locators
	
	private By email=By.id("email-id");
	private By Pass=By.id("password");
	private By button=By.id("submit-id");
	
	
	//method
	
	public String dologin(String em , String ps)
	{

	driver.findElement(email).sendKeys(em);
	driver.findElement(Pass).sendKeys(ps);
	driver.findElement(button).click();
	
	return driver.getCurrentUrl();
	
	}
}
