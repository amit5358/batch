package moduleNameTestNg;

import org.testng.annotations.Test;

public class Class1 {
	
	@Test (invocationCount= 6) //(priority= 2)
	
	public void demo1()
	{
		System.out.println("from Demo 1");
	}
	@Test    //(priority= 1) To set Priotiy to whom run first //
	public void demo2()
	{
		System.out.println("from Demo 2");
	}
	@Test (enabled= false)    //(priority= 3)
	public void demo3()
	{
		System.out.println("from Demo 3");
	}

}
