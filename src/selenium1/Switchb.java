package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://demo.guru99.com/popup.php");
		
		String currentWindowHandle = driver.getWindowHandle();

		driver.findElement(By.linkText("Click Here")).click();
		
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
			
			boolean bool = false;			
			try {
				
				bool = driver.findElement(By.xpath("//*[@name=\"emailid\"]")).isDisplayed();
			
			}catch (Exception ignore) {
				
			}
			
			if(bool) {
				
				driver.close();
			}
			
		}
		
		driver.switchTo().window(currentWindowHandle);
		
		//driver.close();
		
		
		
		driver.quit();

	}

}
