package Selenium_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners
public class Handling_Webtable {
@Test
	public void Web_table() throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	//	driver.findElement(By.xpath("//table[@id='customers']/descendant::tbody/tr[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)", "costColumns");
        WebElement aa= driver.findElement(By.xpath("//table[@id='customers']/descendant::tbody"));  
        String mm =  aa.getText();
        System.out.println(mm);
      //  driver.close();  
  
	}
	
}
