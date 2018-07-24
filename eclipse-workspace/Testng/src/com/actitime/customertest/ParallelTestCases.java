package com.actitime.customertest;

import org.testng.annotations.Test;

public class ParallelTestCases {
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
	  @Test
	    public void deleteCustomerTest()
	    {
		  System.out.println("delete the Customer ");
	    }

}
