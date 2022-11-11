package moduleNameTestNg;

import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	
	public void demo()
	{
		
		String expectedResult="demo";
		String actualResult="test";
		
		org.testng.asserts.SoftAssert soft = new org.testng.asserts.SoftAssert();
		
		soft.assertEquals(actualResult, expectedResult); // it will bypass the failures...use assertAll to detect
		soft.assertAll();
	}

}
