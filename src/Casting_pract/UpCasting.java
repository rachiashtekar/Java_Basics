package Casting_pract;

public class UpCasting {
	public static void main(String[] args) {
		Son s = new Son();
		s.bike();
		s.car();
		
		
		Father f = new Son();
		f.bike();
		f.car();
	}

}
