package test.test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	@Test
	public void t1() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium pro\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/mnjuser/profile?id=&orgn=homepage");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("sachinmk068@gmail.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("naukri");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Resume Headline']//following-sibling::span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='Save' and @type='submit'])[2]")).click();
		driver.quit();
	}
}