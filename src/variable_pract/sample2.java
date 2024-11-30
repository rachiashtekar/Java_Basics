package variable_pract;
public class sample2 {
	public static void main(String [] args) {
		m1();
		sample2 s2 = new sample2();
		s2.m2();
		
	}
	static int c=40;
	
	public static void m1() {
		System.out.println(c);
	}
	
	public void m2() {
		System.out.println(c);
	}
}