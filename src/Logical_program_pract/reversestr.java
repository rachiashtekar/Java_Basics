package Logical_program_pract;

public class reversestr {
	public static void main(String[] args) {
		String str ="rachi iss name";
		String [] arr = str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

//		String str1 ="rachi";
//		String str2="";
//		for(int i=0;i<=str1.length()-1;i++)
//		{
//			str2 = str1.charAt(i) + str2;
//		}
//		System.out.println(str2);

}
}
