//1. take the string
//2. conver it into the lowercase
//2. take two variable for count 
//3.write the for loop
//3. write if condition for vovwels count
//4. write if condition for consonants count

package Logical_program_pract;

public class CountVowelsAndConsonants {
	public static void main(String[] args) {
		String str = "this is my String rachi ";
		int Vcount=0, Ccount=0;
		str=str.toLowerCase();
		

		
		for(int i=0;i<str.length();i++) {
			// write if condition for vowels
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				Vcount++;
			}
			
			// write if condition for consonants
			
		else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				Ccount++;
			}
			
			
		}
	System.out.println("vovwels count" + Vcount);
	System.out.println("Consonant count" + Ccount);
	
	
	}

}


