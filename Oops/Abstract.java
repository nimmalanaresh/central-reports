package Oops;

abstract class Efg{
	abstract public void m1();
}
class e extends Efg{
	public void m1() {
		System.out.println("Abstraction");
	}
}
class f {
	public Efg getObject() {
		Efg a = new e();
		return a;
	}
}


public class Abstract {
	public static void main(String[] args) {
		f c1 = new f();
	    Efg b =c1.getObject();
	    b.m1();
	}

}
