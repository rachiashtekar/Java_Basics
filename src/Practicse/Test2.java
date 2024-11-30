package Practicse;

public class Test2 extends Test1 {

	
	public void m2() {
		System.out.println("m2 is running");
	
		
	}

	
	public void m3() {
		System.out.println("m3 is running");
		
		
	}
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.m1();
		t.m2();
		t.m3();
	}
	

}
