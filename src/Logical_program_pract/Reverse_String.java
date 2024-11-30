//1. first take a string
//2. second take empty string
//3. write for loop for traverse the string
//4. then add the last value to empty string

package Logical_program_pract;

public class Reverse_String {
public static void main(String[] args) {
	String str =" rachi";
	String emptyStr = "";
	for(int i=0;i<str.length();i++) {
		emptyStr = str.charAt(i)+ emptyStr ;
	}
	System.out.println(emptyStr);
}
}
