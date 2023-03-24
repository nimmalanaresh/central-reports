package Selenium_Topics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class DropDowns {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
        WebElement elem =  driver.findElement(By.id("course"));
	    List<WebElement> ele =	driver.findElements(By.id("course"));
		Select s = new Select(elem);
		s.selectByVisibleText("Dot Net");
		s.selectByIndex(0);
		
		
		for(WebElement Options:ele) {
			String name = Options.getText();
			Reporter.log(name, true);		
		driver.quit();
			
		}
	}
}



