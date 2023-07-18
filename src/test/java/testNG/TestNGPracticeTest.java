package testNG;

import org.testng.annotations.Test;

public class TestNGPracticeTest {

	@Test(priority=0)
	public void createCustomer()
	{
		System.out.println("Customer is created");
	}
	
	@Test(priority = -1)
	public void deleteeCustomer()
	{
		System.out.println("Customer is deleted");
	}
	
	@Test
	public void modifyCustomer()
	{
		System.out.println("Customer is modified");
	}
}
