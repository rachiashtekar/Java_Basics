package This_super_keyword_pract;

public class Test1 extends Test2 {
	// this keyword
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.name();
	}
	int a=4;
	
	public void name() {
		int a=7;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.c);
		
	}

}
