package StringClass;

public class Sample6 {
	public static void main(String[] args) {
		String s2 ="my name rachi";
		String [] arr = s2.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
