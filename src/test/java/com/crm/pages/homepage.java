package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homepage {
	//encapsulation=private data + public method
	
private WebDriver driver;
	
	//initialize driver
   public homepage(WebDriver driver) {
	   this.driver=driver;
	 
	}
	
	//data member(locator)
 private By link=By.linkText("Sign In");
	
	 
 
   //method(funtionality to test)
 
 public String get_app_url() {
return  driver.getCurrentUrl();
	 
 }
 
 public String get_app_title() {
	return driver.getTitle();
 }
 
  public String get_status_oflink() {
	  driver.findElement(link).click();
	  return driver.getCurrentUrl();
  }
}
