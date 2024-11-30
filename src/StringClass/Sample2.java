package StringClass;

public class Sample2 {
	public static void main(String[] args) {
		String s1 = "velocity";
		String s2 = "ABCD";
		String s3 = "abcd";
		String s4 ="ABCD";
		String s5 = "abcd";
		String s6 ="";
		String s7=" ";
		String s8="my name is rachi";
		String s9 = "abcaba";
		
		
		System.out.println("----------------");
		System.out.println(s6.isEmpty());  //true
		System.out.println(s5.isEmpty());  //false
		System.out.println(s7.isEmpty());  //false
		System.out.println(s7.isBlank());  //true
		System.out.println(s6.isBlank());  //true
		System.out.println(s8.contains("o"));  //false
		System.out.println(s1.charAt(2)); // l
		System.out.println(s1.indexOf("c")); // 4
		System.out.println(s9.lastIndexOf("b")); // 4
		System.out.println(s8.startsWith("name")); //false
		System.out.println(s8.endsWith("rachi"));  //true
		
		System.out.println("----------------------------------");
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		
		s1=s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s1);
		
		System.out.println("haa"+s2.equals(s3));  // false  compare both data and case
		System.out.println(s2.equalsIgnoreCase(s3)); // true compare only data
		System.out.println("taa"+s2.equals(s4));
		System.out.println(s2==s4);  
		System.out.println("---");
		System.out.println(s3==s5);
		s2=s2.toLowerCase();
	    s4=s4.toLowerCase();
	    System.out.println(s2.equals(s4));
	    System.out.println(s2==s4);
		
	}

}
