package Exception_Handling;

public class example1 {
	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		int num3=0;
		try
		{
			num3=num1/num2;
		}
	    
		catch(ArithmeticException e)
		{
		
		}
		System.out.println(num3);
		System.out.println("good morning");
		

	}
	
}