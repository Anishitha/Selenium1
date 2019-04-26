package TestngClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookMovie {

	WebDriver driver = null;
	
	@BeforeTest
	public void beforeTheTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://in.bookmyshow.com");
		driver.manage().window().maximize();
		
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}	
	}
	
	@Test
	public void testcase01() {
		driver.findElement(By.xpath("//*[@onclick=\"BMS.Region.fnSTopReg('HYD','Hyderabad');\"]")).click();;
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@class=\"primary-menu __active\"]/a[text()='Movies']")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	
	}
	
	@Test
	public void testcase02() throws Throwable{
		driver.findElement(By.xpath("//*[@class=\"card-container wow fadeIn movie-card-container\"]/a[@title=\"Majili\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text()='Book Tickets']")).click();
		driver.findElement(By.xpath("//*[@class=\"date-container \"]/ul[@id=\"showDates\"]")).click();
		driver.findElements(By.xpath("//ul[@id=\"venuelist\"]//li[@data-name=\"AMB Cinemas: Gachibowli\"]//a[@class=\"__showtime-link  time_vrcenter \"]")).get(1).click();
		
		driver.findElement(By.xpath("//*[@id=\"btnPopupAccept\"]")).click();
	}
	
	@Test
	public void testcase03() {
		driver.findElement(By.xpath("//*[@id=\"popQty\"]/li[@id=\"pop_3\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"action-btn\"]")).click();
		
		List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"layout\"]/table//td[@class=\"SRow1\"]"));
		
		int selectedSeat =0;
		
		for(WebElement ele : element) {
			
			List<WebElement> seats = ele.findElements(By.xpath("//a[@class=\"_available\"]"));
			int expectedSeat = 0;
//			for(WebElement seat : seats) {
//				expectedSeat = Integer.parseInt(seat.getText().trim());
				for(int i = 0; i < seats.size() && (seats.size()-i>=3); i++) {
					if(Integer.parseInt(seats.get(i+2).getText().trim()) == Integer.parseInt(seats.get(i).getText().trim())+2);
					seats.get(i).click();
				
				}
		}
		driver.findElement(By.xpath("//*[@class=\"bottom-screen\"]//a[@id=\"btmcntbook\"]")).click();	
	}
	
}
