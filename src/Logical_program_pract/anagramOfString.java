//1.take a two string for comparison
//2.covert it into the lowercase and lowercase
//3.then give the condition  str1.length==str2.length in the else part print not anagram
//4.then that string convert into the chararray
//5.after that sort that array using java.util.method
//6.then check two charArray1 and charArray2 using equal method
//7.then take one variable as result and datatype is boolean it will show the result what true or false



package Logical_program_pract;
import java.util.Arrays;
public class anagramOfString {
	public static void main(String[] args) {
		String str1= "RACE";
		String str2 = "CARE";
		
		//convert it into the lowercase
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		
		
	 //	check the length of array
		if(str1.length()==str2.length()) {
			
			//convert string into char array
			
			char [] charArray1=str1.toCharArray();
			char [] charArray2=str2.toCharArray();
			
			// sort the char array
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			boolean result = Arrays.equals(charArray1, charArray2);
			if(result) {
				System.out.println("this is anagram strings");
			}
			else
			{
				System.out.println("this is not anagram strigns");
			}
			
			
			
		}
		else {
			System.out.println("this strings is not anagram");
		}
		
	}

}
