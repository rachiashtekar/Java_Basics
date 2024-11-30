package Exception_Handling;

public class example5 {
	public static void main(String[] args) {
		String s1 ="velocity";
		try
		{
			System.out.println(s1.charAt(2));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index out of bounds exception handled");
		}
		System.out.println("hii");
		System.out.println("hello");
	}

}
