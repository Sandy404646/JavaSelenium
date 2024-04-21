package santhosh.Selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
	public static WebDriver driver;

	@BeforeSuite
	public void BaseClass() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@AfterSuite
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
