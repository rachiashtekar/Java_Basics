package Practicse;

public class compile_poly {
	
	public static void main(String[] args) {
		
		compile_poly s = new compile_poly();
		s.add(3, 4);
		s.add(3, 2, 1);
		
	}
	
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add (int a,int b,int c) {
		System.out.println(a+b+c);
	}

}
