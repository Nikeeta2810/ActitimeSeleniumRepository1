package com.actitime.customertest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassAfterClass {
	@BeforeClass
	public void configBC()
	{
		System.out.println("======lunch the Browser=====");
	}
    @BeforeMethod
    public void configBM()
    {
    	System.out.println("login");
    }
    @Test
    public void createCustomerTest()
    {
    	System.out.println("create the Customer ");
    }
   
    @Test
    public void modifyCustomerTest()
    {
    	System.out.println("modify the Customer ");
    }
    @Test
    public void deleteCustomerTest()
    {
    	System.out.println("delete the Customer ");
    }
   @AfterMethod
   public void configAM()
   {
	   System.out.println("logout");
   }
   @AfterClass
   public void configAC()
   {
	   System.out.println("=====close the Browser=====");
   }
}
