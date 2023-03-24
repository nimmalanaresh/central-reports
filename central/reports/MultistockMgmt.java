package central.reports;

import org.testng.annotations.Test;

import pageobjects.MultistockMgmtpage;

public class MultistockMgmt {
	
	
	@Test
	public static void sfrc() throws Throwable {
		Baseclass b = new Baseclass();
		b.Logininfo();
		MultistockMgmtpage m = new MultistockMgmtpage(Baseclass.driver);
		m.stocktransfer(Baseclass.driver);
		m.storeselection();
		m.selectitems();
	}
}
