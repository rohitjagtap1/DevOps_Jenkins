package com.crm.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.crm.pages.homepage;
import com.crm.pages.loginpage;

public class baseclass  {
	
	public WebDriver driver;
	public homepage hp;
	public loginpage lp;
	@BeforeTest
	public void setup() {
driver=new FirefoxDriver();
driver.get("https://automationplayground.com/crm/");
hp=new homepage(driver);
lp=new loginpage(driver);
  

}
}
