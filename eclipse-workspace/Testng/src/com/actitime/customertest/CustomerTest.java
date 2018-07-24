package com.actitime.customertest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerTest {
	@BeforeMethod
	public void configBM()
	{
	System.out.println("login");	
	}
	
  @Test
  public void createCustomerTest()
  {
	  System.out.println("execute create CustomerTest");
	  
  }
  @Test
  public void modifyCustomerTest()
  {
	  System.out.println("modify CustomerTest");
  }
  @AfterMethod
  public void configAM()
  {
	  System.out.println("logout");
  }

}
