package Logical_program_pract;

public class Factorial_program {
	public static void main(String[] args) {
		int num=10;
		int firstTerm=0 , secondTerm=1;
		System.out.println("\"Fibonacci Series up to \" + n + \" terms:\"");
		
		for(int i=1;i<=num;i++) {
//			System.out.println(firstTerm+" ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			System.out.println(firstTerm+" ");
		}
	}

}
