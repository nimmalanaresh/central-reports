package central.reports;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import pageobjects.Baseclasspage;

public class Baseclass {
	
public static  WebDriver driver;
 @BeforeClass
 public   void Logininfo() throws Throwable {
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 System.getProperty("user.dir");
	 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Global.properties");
	 Properties prop=new Properties();
	 prop.load(fis);
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get(prop.getProperty("url"));
	 Baseclasspage b = new Baseclasspage(driver);
	 b.Login();	
	 Reporter.log(driver.getTitle(),true);
 }
}
