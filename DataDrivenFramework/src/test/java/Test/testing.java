package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testing {
	
	public void creatingDBConn() {
		System.out.println("Creating db conn");
	}
	
	public void closeDbConn() {
		System.out.println("Close db conn");
	}
	
	@BeforeMethod
	public void launchBrower () {
		System.out.println("launching browser");
		
	}
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Close the browser");
	}

	@Test(priority=2)
	public void Test1 () {
		System.out.println("Executing login test");
	}
	
	@Test(priority=1)
	public void Test2 () {
		System.out.println("Exectuing second test");
	}
	
	
}
