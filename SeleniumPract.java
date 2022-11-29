package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPract {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://test.qatechhub.com/alert-handling/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//for handling alert
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.partialLinkText("Proceed to test.qatechhub.com (unsafe)")).click();
		
		driver.findElement(By.id("NormalAlert")).click();
		driver.switchTo().alert();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
