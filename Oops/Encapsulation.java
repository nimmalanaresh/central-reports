package Oops;

import org.openqa.selenium.WebDriver;

public class Encapsulation extends c {
	
	
	private void m1() {
		
		System.out.println("fasdv");
	}
	
	public static void main(String args[]) {
		
//		m2();
		
		c var = new c();
		var.driver.close();
			
	}
	
}

class c{
	
	public  WebDriver driver;
	
	private static void m2() {
		
		System.out.println("Encapsulation");
		
		
	}
}



