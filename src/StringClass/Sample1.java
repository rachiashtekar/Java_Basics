package StringClass;

public class Sample1 {
	public static void main(String[] args) {
		//object creation of string
		
		//1.without using new keyword
		String s1="abc";
		
		
		//2.using new keyword
		String s2 = new String("abc1");
		
		String s3;  //only declaation
		String s4 = "abc2";  //declaration and initialization
		
		String s5="ab"; // obj1
		System.out.println(s5);
		
		s5=s5+"cd";
		System.out.println(s5);   //ab+cd=abcd  // obj2
		
		s5=s5+"xyz";
		System.out.println(s5);  //abcd+xyz=abcdxyz //obj3
				
		
	}
	
	

}
