package Access_specifier_pract;

public class Test2 {
	// here the scope of this variable remain throughout the project
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.m2();
		t2.m1();
		t2.m3();
	}
	public void m1() {
		
		System.out.println("m1 is printing");
	}
	
	private void m2() {
		System.out.println("printing the private method");
		
		
	}
	
	protected void m3() {
		System.out.println("printing the protected method ");
	}
	

}
