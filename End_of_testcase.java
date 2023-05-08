package central.reports;

import org.testng.annotations.AfterTest;

public class End_of_testcase {

	@AfterTest
	public void After_testcase() {
		
		Baseclass b = new Baseclass();
		b.driver.close();
	}
}
