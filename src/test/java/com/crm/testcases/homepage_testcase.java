package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.pages.homepage;

public class homepage_testcase extends baseclass {
	
	 
  @Test(priority=1)
  public void verifyurl() {
	String actual_url= hp.get_app_title();
  //  Assert.assertTrue(actual_url.contains("CRM"));
	Assert.assertEquals(actual_url, "https://automationplayground.com/crm/","does not match");
	System.out.println("url match");
  }
  
  
   @Test(priority=2)
  public void verifytitle() {
	 String act_title= hp.get_app_title();
	 Assert.assertTrue(act_title.contains("Customer Service"),"title does not match");
	 System.out.println("title match");
  }
  
   @Test(priority=3)
  public void verifysignlink() {
	   String act_link=hp.get_status_oflink();
	   Assert.assertTrue(act_link.contains("login.html"),"link does not match");
	   System.out.println("link match");
	   
  }
}
