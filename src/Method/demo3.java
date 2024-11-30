// non static method
package Method;

public class demo3 {
	public static void main(String[] args) {
		System.out.println("hello Good morning ");
		demo4 s1= new demo4();
		s1.name();
		
		demo3 s2= new demo3();
		s2.m1();
	}
public void m1() {
	System.out.println("this is the non static regular method from same class");
	
}
}
