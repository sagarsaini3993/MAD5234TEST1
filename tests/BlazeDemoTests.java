// Student Name : Sagar Saini
// Student ID : C0736242


import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemoTests {
	
	final String URL = "http://www.blazedemo.com/";
	final String DRIVER_PATH = "C:\\chromedriver.exe";
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver",DRIVER_PATH);
		driver = new ChromeDriver();
		
		driver.get(URL);
	}

	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(2000);				
		driver.close();
		
	}

	@Test
	public void test() throws InterruptedException {
		
		WebElement link = driver.findElement(By.className("div#jumbotron a"));
		Thread.sleep(3000);
		link.click();
		
		String urlPage2 = driver.getCurrentUrl();
		System.out.println(urlPage2);
		
	}

}
