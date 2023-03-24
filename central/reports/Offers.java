package central.reports;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageobjects.Offerspage;

public class Offers {



@Test
	public void offers() throws Throwable {
	
	    Baseclass b =new Baseclass();
	    b.Logininfo();
		Offerspage o = new Offerspage(Baseclass.driver);
		o.createoffer();
		o.selectoffertype();
		JavascriptExecutor js = (JavascriptExecutor)Baseclass.driver;
		js.executeScript("window.scrollBy(0,500) ", "o.prodname");
	//	o.submit();
		Baseclass.driver.switchTo().alert().accept();
		o.radiobtn.click();
	}
}
