package Polymorphism_pract;

public class compile_poly {
	int a=3;
	int b=5;
	public void add(int a, int b) {
		System.out.println(a+b);
	}
    public void add(int a,int b,int c) {
    	System.out.println(a+b+c);
    }
    
    public static void main(String[] args) {
		compile_poly c = new compile_poly();
		c.add(3, 4);
		c.add(1, 2, 3);
	}
}
