package TestngClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailPage {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void beforeTheTest() {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void beforeMethod() {

		driver.get("https://mail.google.com/mail/?tab=rm/");
	}
	
	@Test
	public void testcase01() 
	{
		driver.findElement(By.id("identifierId")).sendKeys("kunduranishitha");
		driver.findElement(By.className("CwaK9")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("reddy8909");
		driver.findElement(By.className("CwaK9")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		
		}
	}
	
		@Test
		public void testcase02() {
			driver.findElement(By.xpath("//*[@id=\":ik\"]")).click();
	        try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	        //enter reciepient mail id
	        driver.findElement(By.xpath("//*[@name=\"to\"]")).sendKeys("anishithareddy@gmail.com");
		    //enter subject line
	        driver.findElement(By.xpath("//*[@name=\"subjectbox\"]")).sendKeys("Selenium");
	        //enter mail body
	        driver.findElement(By.xpath("//*[@id=\":p5\"]")).sendKeys("Hi How are you");
	        
	        try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			  }
			}
		
	@Test
	public void testcase03() {
		
		driver.findElement(By.xpath("//*[@id=\":nq\"]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Email sent successfully");
		
	}
	
}
