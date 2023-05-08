package central.reports;

import org.testng.annotations.Test;

import pageobjects.MultistockMgmtpage;


public class MultistockMgmt {
	
	
	@Test
	public static void sfrc() throws Throwable {
		Baseclass b = new Baseclass();
		b.Login();
		b.driver.navigate().refresh();
		MultistockMgmtpage m = new MultistockMgmtpage(b.driver);
		m.stocktransfer(b.driver);
		m.storeselection();
		m.selectitems();
	}
}
