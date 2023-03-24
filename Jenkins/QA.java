package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class QA {
	
	@Test
	public void A() {
		
	    WebDriver driver = new ChromeDriver();
		driver.get("https://reports.nukkadshops.com/new/");
	}

}
