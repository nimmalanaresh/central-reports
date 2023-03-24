package Selenium_Topics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Iframes {

	WebDriver driver;
	@Test
	public void frames() throws Throwable {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement fr = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(fr);
		WebElement pc = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
	    WebElement pc1 = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
		Actions ac = new Actions(driver);
		ac.clickAndHold(pc).moveToElement(pc1).release().perform();
		
//		WebElement pc2 = driver.findElement(By.xpath("//img[@src='images/high_tatras4_min.jpg']"));
//		ac.clickAndHold(pc2).moveToElement(pc1).release().perform();
//		
		
		
		
	}
}
