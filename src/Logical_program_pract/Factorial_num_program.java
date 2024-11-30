package Logical_program_pract;

public class Factorial_num_program {
	public static void main(String[] args) {
		int num=5;
		long factorial = 1;
		
		for(int i=1;i<=num;i++) {
			factorial = factorial *i;
			System.out.println(factorial);
		}
		
	}

}


//num=5;
//1X2X3x4X5
//1*1=1
//1*2=2
//2*3=6
//6*4=24
//24*5=120