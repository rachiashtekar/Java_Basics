package Array;

public class Ex3_charArray {
public static void main(String[] args) {
		
		char[] arr = new char[5];
		
		arr[0]='A';
		arr[1]='B';
		arr[2]='C';
		arr[3]='D';
		arr[4]='E';
		
		System.out.println(arr.length);
		System.out.println(arr[2]);
		for (int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
	}


}
