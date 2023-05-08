package central.reports;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageobjects.Offerspage;

public class Offers {

@Test
	public void offers() throws Throwable {
	
	    Baseclass b =new Baseclass();
	    b.Login();
		Offerspage o = new Offerspage(b.driver);
		o.createoffer();
		o.selectoffertype();
		JavascriptExecutor js = (JavascriptExecutor)b.driver;
		js.executeScript("window.scrollBy(0,500) ", "o.prodname");
//		o.submit();
//		o.activateoffer();
//		b.driver.switchTo().alert().accept();
//		o.radiobtn.click();
	}

}
