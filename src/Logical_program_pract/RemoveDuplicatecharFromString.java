package Logical_program_pract;

public class RemoveDuplicatecharFromString {
	public static void main(String[] args) {
		String str = "programming";
		String result = "";
		for (int i=0;i<str.length();i++) {
			if(result.indexOf(str.charAt(i))==-1) {
				result = result + str.charAt(i);
			}
		}
		
		
		System.out.println(result);
		
	}

}
