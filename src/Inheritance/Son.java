package Inheritance;

public class Son extends Father {
	public static void main(String[] args) {
		Son s = new Son();
		s.car();
		s.money();
		s.home();
		s.mobile();
		
	}
	
	public void mobile() {
		System.out.println("vivo");
		
	}

}
