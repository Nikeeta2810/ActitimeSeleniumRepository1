

	
import org.testng.annotations.Test;

	public class CustomerTestPriority {
		@Test
		public void createCustomerTest()
		{
			System.out.println("execute createCustomerTest");
			
		}
		@Test(priority=1)
		public void modifyCustomerTest()
		{
			System.out.println("execute modifyCustomerTest");
			
		}
		@Test(enabled=false)
		public void deleteCustomerTest()
		{
			System.out.println("execute deleteCustomerTest");
			
		}

	}

