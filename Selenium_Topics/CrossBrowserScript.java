package Selenium_Topics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserScript {
	 
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
	
	if(browser.equalsIgnoreCase("firefox")){
	
	driver = new FirefoxDriver();
	}
	 
	else if(browser.equalsIgnoreCase("chrome")){
	
	driver = new ChromeDriver();
	 
	}
	else if(browser.equalsIgnoreCase("Edge")){
	
	driver = new EdgeDriver();
	}
	else{
	
	throw new Exception("Browser is not correct");
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	 
	@Test
	public void testParameterWithXML() throws InterruptedException{
	driver.get("https://www.edureka.co/");
	WebElement Login = driver.findElement(By.linkText("Log In"));
	Login.click();
	Thread.sleep(4000);
	WebElement userName = driver.findElement(By.id("si_popup_email"));
	userName.sendKeys("your email id");
	Thread.sleep(4000);
	WebElement password = driver.findElement(By.id("si_popup_passwd"));
	password.sendKeys("your password");
	Thread.sleep(6000);
	 
	WebElement Next = driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']"));
	Next.click();
	Thread.sleep(4000);
	WebElement search = driver.findElement(By.cssSelector("#search-inp"));
	search.sendKeys("Selenium");
	Thread.sleep(4000);
	 
	WebElement searchbtn = driver.findElement(By.xpath("//span[@class='typeahead__button']"));
	searchbtn.click();
	}
	}

