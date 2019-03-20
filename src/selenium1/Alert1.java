package selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get(" http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//*[@name=\"submit\"]")).click();
		
		Alert a = driver.switchTo().alert();
		
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
