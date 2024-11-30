package StringClass;

public class Sample3 {
	public static void main(String[] args) {
		String s2 = "ABCD";
		String s4 = "ABCD";
		System.out.println(s2==s4);   //true
		System.out.println(s2.equals(s4));   //true
		s2=s2.toLowerCase();
	    s4=s4.toLowerCase();
	    System.out.println(s2.equals(s4));  // true, because content is the same: "abcd"
	    System.out.println(s2==s4);   // false, because they are different objects in memory
         
	    String s5 = new String("rachi");  
	    String s6 = new String("rachi");
	    System.out.println(s5==s6);   //false beacuse both are created in the different object  here s5 having different rachi and s6 having dffrent rachi
	    
	    System.out.println("---------------------");
       String s7 = "aniket";
       String s8 = "aniket";
       System.out.println(s7==s8);     //true because both are created in only object   s7 and s8 are point to aniket only
		
	}
	
}

//equals() Method:
//
//This checks if the content of two strings is the same.
//In your code, after converting both s2 and s4 to lowercase, they both become "abcd".
//Since the content is the same, s2.equals(s4) returns true.

//== Operator:
//
//This checks if two strings are exactly the same object in memory.
//After you convert s2 and s4 to lowercase, they point to two different new strings in memory, even though they both contain "abcd".
//Because they are different objects, s2 == s4 returns false.


//equals() checks if the letters in the strings are the same: "abcd" and "abcd" are the same, so true.
//== checks if both strings are the exact same thing in memory: "abcd" and "abcd" are in different places in memory, so false.