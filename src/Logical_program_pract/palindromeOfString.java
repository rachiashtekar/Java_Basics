//1.take one string
//2. take one empty string
//3.take the for loop reverse
//4.resver = reverse +str.charAt[i]
//5. if(str.equals(Reversestr)



package Logical_program_pract;

public class palindromeOfString {
	public static void main(String[] args) {
		String str = "madams";
		String reverseStr = "";

		for (int i=0;i<str.length();i++)
		{
			reverseStr =  str.charAt(i) +reverseStr ;
		}
		if(str.equals(reverseStr)) {
			System.out.println("this is palindronnnnnnnnnnnnnnnnnnnme");
		}
		else
		{
			System.out.println("this is not palindrome");
		}
	}

}

//package Logical_program_pract;
//
//public class palindromeOfString {
//    public static void main(String[] args) {
//        String str = "madam";  // Hardcoded string
//        String reverseStr = "";
//        
//        // Reverse the string
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reverseStr = reverseStr + str.charAt(i);
//        }
//
//        // Check if the original string is equal to the reversed string
//        if (str.equals(reverseStr)) {
//            System.out.println("This is a palindrome.");
//        } else {
//            System.out.println("This is not a palindrome.");
//        }
//    }
//}
