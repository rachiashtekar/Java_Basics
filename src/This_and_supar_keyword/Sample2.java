package This_and_supar_keyword;

public class Sample2 {
	public static void main(String[] args) {
		Sample2 m2=new Sample2();
		m2.m1();
		
	}
	
	int a=2;
	int b=6;
	
	public void m1() {
		int a=5;
		System.out.println(a);   // here 5 will print
		System.out.println(this.a);  // here 2 will print
		System.out.println(b);
	}
	
	
	

}
