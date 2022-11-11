package moduleNameTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	
	public void demo()
	{
		String expectedResult="demo";
		String actualResult="test";
		
		Assert.assertEquals(actualResult, expectedResult);
		
		System.out.println("Pass");
		
		
	}

}
