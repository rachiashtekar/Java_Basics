package Logical_program_pract;

public class Reverse_num {
	public static void main(String[] args) {
		int number=12345;
		int ReverseDigit=0;
		while(number!=0) {
			int digit = number%10;
			 ReverseDigit=ReverseDigit*10+digit;
			 number /= 10;
			
		}
		System.out.println(ReverseDigit);
		
	}

}
