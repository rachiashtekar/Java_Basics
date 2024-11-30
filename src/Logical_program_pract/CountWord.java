package Logical_program_pract;

public class CountWord {
	public static void main(String[] args) {
		String str = "one two three four";
		int countWord = str.split("\\s").length;
		System.out.println(countWord);
		
	}

}
