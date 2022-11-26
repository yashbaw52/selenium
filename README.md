# selenium
Selenium code for automation of a login page 

I have written a selenium code for the automation of a login form

I am adding my selenium code for login page in for chrome browser 


//code starts here

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
		driver.navigate().to("https://codenboxautomationlab.com/registration-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//for first name
		driver.findElement(By.id("nf-field-17")).sendKeys("admin");
		Thread.sleep(5);
		
		//for last name
		driver.findElement(By.id("nf-field-18")).sendKeys("admin123");
		
		//for email
		WebElement email = driver.findElement(By.id("nf-field-19"));
		email.sendKeys("admin@gmail.com");
		
		
		Select dropdown = new Select(driver.findElement(By.id("nf-field-22")));
		dropdown.selectByVisibleText("Selenium Automation");
		
		//for month of the batch
		
		Select dropdown1 = new Select(driver.findElement(By.id("nf-field-24")));
		dropdown1.selectByVisibleText("November");
		
		WebElement radio = driver.findElement(By.id("nf-label-class-field-23-1"));
		
		
		
		
	
		

	}

}
