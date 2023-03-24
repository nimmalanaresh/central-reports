package Oops;

class B{
	
	public void m1() {
		
		System.out.println("m1 method in B class");
		
	}
}

public class Runtime_polymorphism extends B{
	
	 public void m1() {
		
		System.out.println("m1 method in Runtime_polymorphism");
	}
	 
	 public static void main(String args[]) {
		 
		 B b= new B();
		 b.m1();
		 Runtime_polymorphism r =new Runtime_polymorphism();
		 r.m1();
		 
		 
	 }

}
