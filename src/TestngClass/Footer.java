package TestngClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Footer {
	WebDriver driver = null;
	
	@BeforeTest
	public void beforeTheTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void beforeMethod() {

		driver.get("https://www.amazon.in/");
		
	}
	
	@Test
	public void testcase01(){
		
		driver.findElement(By.xpath("//*[@id=\"navFooter\"]")).click();
		String currentWindowHandle = driver.getWindowHandle();
		driver.get("http://www.abebooks.com/");
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Set<String> WindowHandles = driver.getWindowHandles();
		
		for(String eachHandle : WindowHandles) {
			
			driver.switchTo().window(eachHandle);
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
					
			driver.switchTo().window(currentWindowHandle);	
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}

	}
	
	public void testcase02(){
		driver.findElement(By.xpath("//*[@id=\"navFooter\"]")).click();
		String currentWindowHandle = driver.getWindowHandle();
		driver.get("http://aws.amazon.com/");
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
					
			driver.switchTo().window(currentWindowHandle);	
			
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
		
}
