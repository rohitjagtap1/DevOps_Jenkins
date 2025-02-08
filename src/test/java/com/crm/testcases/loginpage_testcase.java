package com.crm.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginpage_testcase extends baseclass {
	
	
	@BeforeClass
	public void pagesetup() {

	hp.get_status_oflink();
	}
	
	
	
  @Test
  public void  validatelogin() {
	  
	 String url= lp.dologin("test@gmail.com", "test");
	 Assert.assertTrue(url.contains("customers"),"login fail");
	 System.out.println("login successfully");
	 
  }
}
