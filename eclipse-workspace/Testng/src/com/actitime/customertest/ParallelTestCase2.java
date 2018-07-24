package com.actitime.customertest;

import org.testng.annotations.Test;

public class ParallelTestCase2 {
		 @Test
		  public void createCustomerTest()
		  {
			  System.out.println(" don't execute create CustomerTest");
			  
		  }
		  @Test
		  public void modifyCustomerTest()
		  {
			  System.out.println(" don't modify CustomerTest");
		  }
		  @Test
		    public void deleteCustomerTest()
		    {
			  System.out.println(" don't delete the Customer ");
		    }

	}



