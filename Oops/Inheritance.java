package Oops;

class Abc{
	
	public static void m1() {
		
		System.out.println("m1-method");
	}
	
public static void m2() {
		
		System.out.println("m2-method");
	}

public static void m3() {
	
	System.out.println("m3-method");
}
	
}
public class Inheritance  extends Abc{
	
	public static  void  main(String args[]) {
		
		m1();
		m2();
		m3();
		
	}

}
