package TestngClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngFirst {
	
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	public void beforeTheTest() {
	System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
	driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void testcase01(){
		WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox"));	
		searchElement.sendKeys("iPhone");
		driver.findElement(By.className("nav-input")).click();;
	}
	
	@Test
	public void testcase02(){
		driver.findElement(By.linkText("Amazon Pay")).click();
	}
	
	@Test
	public void testcase03() {
		Select s = new Select(driver.findElement(By.xpath("//*[@title=\"Search in\"]")));
		s.selectByVisibleText("Electronics");
	}
}
