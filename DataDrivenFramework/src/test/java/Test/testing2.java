package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testing2 {
	
	@Test
	public void validateTitles() {
		
		System.out.println("Beginning");
		String expected_title = "Yahoo.com";
		String actual_title = "Gmail.com"; //selenium
		
	    /*if(expected_title.equals(actual_title)) {
			
			System.out.println("Test case pass");
		}else {
			
			System.out.println("Test case fail");
		}*/
		
		SoftAssert softAssert = new SoftAssert();
		
		System.out.println("Validating Title");
		softAssert.assertEquals(actual_title, expected_title);
		
		//isElementPresent("xpath") - True, False
		//Assert.assertTrue(false, "Element not found");
		System.out.println("Validating Image");
		softAssert.assertEquals(true, false);
		
		System.out.println("Validate test box presence");
		softAssert.assertEquals(true, false);
		//Assert.fail("Failing the test as the condition is not met");
		System.out.println("Ending");
		
	}

}
