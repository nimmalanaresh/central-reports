package Selenium_Topics;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Loginpage {
	
    AndroidDriver driver;
    @Test	
	public  void Log() throws Throwable {
		
//	File appdir = new File("src");
//		
//		File app = new File(appdir,"WhatsApp.apk");
		
	DesiredCapabilities caps = new  DesiredCapabilities();
	
	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "naresh");
	
	caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	
	caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Nukkadshops\\eclipse-workspace\\web\\src\\WhatsApp.apk");
	
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
	driver = new AndroidDriver(url,caps);
	
	Reporter.log("Login page opened Succesfull", true);
	
	Thread.sleep(5000);
	
	}
	
	
}
