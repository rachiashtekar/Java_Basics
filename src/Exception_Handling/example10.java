package Exception_Handling;

public class example10 {
	public static void main(String[] args) {
		String [] arr = {"abc1","xyz1","abc2","xyz"};
		String s1 ="velocity";
		try 
		{
			try
			{
				System.out.println(arr[9]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("inner try block code handles");
			}
			System.out.println(s1.charAt(9));
			
		}
		catch(StringIndexOutOfBoundsException e)
		{
		System.out.println("outer try block code handled");	
		}
		System.out.println("hii");
	}

}
