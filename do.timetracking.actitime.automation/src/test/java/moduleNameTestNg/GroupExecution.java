package moduleNameTestNg;

import org.testng.annotations.Test;

public class GroupExecution {
@Test (groups="smoke")
	
	public void LoginInTest()
	{
		System.out.println("Logged In succesfully");
	}
	@Test (groups="smoke")
	
	public void SearchForProductTest()
	{
		System.out.println("Product Found  succesfully");
	//	Assert.fail();  
	}
	@Test (groups="regression")
	
	public void AddToProductTest()
	{
		System.out.println("Product Added succesfully");
	}
	@Test (groups="regression")
	
	public void PaymentTest()
	{
		System.out.println("Payment Was succesfull");
		
	}
	@Test (groups="smoke")
	
	public void LogoutTest()
	{
		System.out.println("Logged Out succesfully");
	}



}

