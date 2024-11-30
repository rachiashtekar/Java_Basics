package Exception_Handling;

public class example12 {
	public static void main(String[] args) {
		String s1="velocity";
		try
		{
		System.out.println(s1.charAt(9)); //risky code
		}
		finally
		{
			System.out.println("Hi");
			System.out.println("Hello");    // it will print  before finally
		System.out.println("running finally blocks");
		}
//		System.out.println("Hi");
//		System.out.println("Hello");     // it will not print fater finally excecuted
	}

}
