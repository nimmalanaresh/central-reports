package Selenium_Topics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TouchActions {
@Test(invocationCount =1)
	public void  sample() {
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Nukkadshops\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().window().maximize();
		WebElement ele =driver.findElement(By.xpath("//a[text()='Selenium Practice']"));		
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();
	//	driver.close();
	}
	
}
