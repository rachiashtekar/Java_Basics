package Logical_program_pract;

public class reverse_string1 {
	public static void main(String[] args) {
		String str1 ="my name is rachi";
		String str2= "";
		for(int i=0;i<str1.length();i++) {
			str2 = str1.charAt(i) + str2;
		}
		System.out.println("reverse string =" + str2);
	}

}
