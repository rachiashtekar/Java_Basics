package Practicse;

public class ConstructorMock {
	public static void main(String[] args ) {
		ConstructorMock c1 = new ConstructorMock("rachi","ashtekar");
		c1.fullname();
		
//		method2 n1 = new method2();
//	n1.n();
	
		
	}
	String name;
	String lname;
	ConstructorMock(String a,String b){
		name=a;
		lname=b;
		
		
	}
	public void fullname() {
		System.out.println(name+lname);
	}
	
}
