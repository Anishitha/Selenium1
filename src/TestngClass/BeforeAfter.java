package TestngClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfter {
	
	@BeforeTest
	public void beforeTheTest() {
		System.out.println("I am in Hyderbad");
	}
	
	@BeforeMethod
	public void beforeTheMethod() {
		System.out.println("I am listening Music");
	}
	
	@Test
	public void Test() {
		
	}
	
	@AfterTest
	public void afterTheTest() {
		System.out.println("Executing after test");
	}
	
	@AfterMethod
	public void afterTheMethod() {
		System.out.println("Executing after method");
	}
	

}
