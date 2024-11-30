package Interface;

public class sample  implements l1,l2{
	
	public void s1() {
		System.out.println("this method from interface l1");
		
	}
public void s2() {
	System.out.println("this method from interface l1");
		
	}
public void s3() {
	System.out.println("this method from interface l1");
	
}
public void s4() {
	System.out.println("this method from interface l1");
	
}
public void s5() {
	System.out.println("this method from interface l1 and l2");
}



public static void main(String[] args) {
	sample s = new sample();
	s.s1();
	s.s2();
	s.s3();
	s.s4();
	s.s5();
}


}
