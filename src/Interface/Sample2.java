package Interface;

public class Sample2 implements Sample1 {


	public void m1() {
		System.out.println("m1 print");
		
	}

	
	public void m2() {
		
		System.out.println("m2 print");
	}
	public void m3() {
		System.out.println("print m3");
	}
public static void main(String[] args) {
	Sample2 s2 = new Sample2();
	s2.m1();
	s2.m2();
	s2.m3();
	
	
}
}
