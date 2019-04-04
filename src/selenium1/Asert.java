package selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Asert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//*[@name=\"submit\"]")).click();
		
		Alert a = driver.switchTo().alert();
		
		System.out.println(a.getText());
		
		Assert.assertEquals(a.getText().equals("Do you really want to delete this Customer?"), true);

		Assert.assertEquals(a.getText().contains("Do you really want to delete"), true);
		
		Assert.assertEquals(a.getText(),"Do you really want to delete", "The message received is different from original message");
		
		
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		a.accept();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		a = driver.switchTo().alert();
		
		System.out.println(a.getText());
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		a.accept();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.quit();
		
	}

}
