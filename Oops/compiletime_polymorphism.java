package Oops;

class A{
	
	public static void abc(String name, int rollno) {
		
		System.out.println(name);
	}
	
	
    public static void abc(int rollno) {
		
		System.out.println(rollno);
}

	
}

public class compiletime_polymorphism extends A{
	
	public static void abc(String password) {
			
		System.out.println(password);
	}
	
	public static void main(String args[]) {
		
		abc(10);
		abc("naresh");		
	}

}
