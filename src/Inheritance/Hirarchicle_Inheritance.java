package Inheritance;

public class Hirarchicle_Inheritance {
	public static void main(String[] args) {
		Son1 s1 = new Son1();
		s1.luxry();
		s1.car();
		s1.money();
		s1.home();
		
		System.out.println("-------------------------------------------------------------------------------");
		Son2 s2 = new Son2();
		s2.mobile();
		s2.car();
		s2.money();
		s2.home();
		
		System.out.println("-------------------------------------------------------------------------------");
		
		Son3 s3 = new Son3();
		s3.laptop();
		s3.car();
		s3.money();
		s3.home();
		
		System.out.println("-------------------------------------------------------------------------------");
		
		
	}

}
