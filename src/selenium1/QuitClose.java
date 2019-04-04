package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitClose {

	public static void main(String[] args) {
		
         System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://demo.guru99.com/popup.php");

		driver.findElement(By.linkText("Click Here")).click();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.close();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		driver.quit();
	}

}
