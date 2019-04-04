package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;

public class SeleniumClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.flipkart.in");
		
		//driver.navigate().to("http://www.flipkart.in ");
		
		driver.quit();
		
		System.out.println("My execution is done");
	}

}
