package Casting;

public class TestUpCasting {
	
	public static void main(String[] args) {
		Son s=new Son();
		s.car();
		s.home();
		s.mobile();
		s.money();
		
		
		System.out.println("------------------------------------------");
		
		// create object of subclass with reference/data type of super class
		Father f = new Son();
		f.car();
		f.home();
		f.money();
		
//		System.out.println("----------------------");
//		
//		Father F = new Father();
//		F.car();
//		F.home();
//		F.money();
		
	}

}
