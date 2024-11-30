package Exception_Handling;

public class example6 {
	public static void main(String[] args) {
		String s1 ="velocity";
		try
		{
		System.out.println(s1.charAt(9));
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound exception handled");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String index out of bound exception");
		}
		System.out.println("hii");
	}

}
