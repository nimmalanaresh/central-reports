package Selenium_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class File_Uploading {

	@Test
	public void upload() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		
	//	driver.findElement(By.id("uploadfile_0")).sendKeys("D:\\Study materials\\SQL Joints. .pdf");
		
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        uploadElement.sendKeys("D:\\Study materials\\SQL Joints. .pdf");

        driver.findElement(By.id("terms")).click();

        driver.findElement(By.name("send")).click();
	}
}
