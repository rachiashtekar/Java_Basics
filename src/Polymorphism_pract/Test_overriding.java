package Polymorphism_pract;

public class Test_overriding  {
	public static void main(String[] args) {
		Father f = new Father();
		f.car();
		f.laptop();
		f.Tv();
		
		System.out.println("---------------------------");
		Son s = new Son();
		s.car();
		s.laptop();
		s.Tv();
	
		
		
	}

	
}
