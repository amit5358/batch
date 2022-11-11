package moduleNameTestNg;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyAProductTest {
	
	@Test (priority= 1)
	
	public void LoginInTest()
	{
		System.out.println("Logged In succesfully");
	}
	@Test (priority= 2)
	
	public void SearchForProductTest()
	{
		System.out.println("Product Found  succesfully");
	//	Assert.fail();  
	}
	@Test (dependsOnMethods ="SearchForProductTest")
	
	public void AddToProductTest()
	{
		System.out.println("Product Added succesfully");
	}
	@Test (dependsOnMethods="AddToProductTest")
	
	public void PaymentTest()
	{
		System.out.println("Payment Was succesfull");
		
	}
	@Test (priority=3)
	
	public void LogoutTest()
	{
		System.out.println("Logged Out succesfully");
	}
}
