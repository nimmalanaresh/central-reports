package central.reports;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.Baseclasspage;

public class Baseclass {
	
	public WebDriver driver;
	
 @BeforeClass
 public void Login() throws Throwable {
	 System.getProperty("user.dir");
	 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Global.properties");
	 Properties prop=new Properties();
	 prop.load(fis);
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	 driver.manage().window().maximize();
	 driver.get(prop.getProperty("stage_url"));
	 Baseclasspage b = new Baseclasspage(driver);
	 b.Login();
 }
 
}
