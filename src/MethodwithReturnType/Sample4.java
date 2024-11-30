package MethodwithReturnType;

public class Sample4 {
	public static void main(String[] args) {
		String name = ConvertNameToUpperCase("rachi");
		System.out.println(name);
		
		int l1 = getLengthOfName("aniket");
		System.out.println(l1);
		
	}
   public static String ConvertNameToUpperCase(String name) {
	   String s1 = name.toUpperCase();
	   return s1;
   }
   
   public static int getLengthOfName(String name) {
	   int length = name.length();
	   return length;
   }
}
