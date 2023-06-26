package TestPractice.Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Practice1 {
	WebDriver driver;

	@Test
	public void start() {
		System.setProperty("webdriver.gecko.driver", "/Users/sapathan/Desktop/WebDrivers/geckodriver");
		driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/client/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("userEmail")).sendKeys("testinfy@test.com");
		driver.findElement(By.id("userPassword")).sendKeys("Test@1234");
		driver.findElement(By.id("login")).click();
		
	}
}
