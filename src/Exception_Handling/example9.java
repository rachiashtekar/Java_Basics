package Exception_Handling;

public class example9 {
	public static void main(String[] args) {
		int [] arr = {10,20,50,30,40};
		try 
		{
			System.out.println(arr[9]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("1st try block:- ArrayIndexOutOfBounds Exception handled");
		}
		
		String s1="velocity";
		try
		{
			System.out.println(s1.charAt(9));
		}
		catch(StringIndexOutOfBoundsException a)
		{
			System.out.println("2nd try block:-StringIndexOutOfBounds Exception handled");
		}
		System.out.println("hii");
	}

}

//try {
//    // Some code that may throw an exception
//} finally {
//    // Cleanup actions like closing files or connections
//    System.out.println("This will always execute");
//}