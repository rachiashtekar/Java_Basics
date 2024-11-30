package StringClass;

public class Sample5 {
	public static void main(String[] args) {
		String s1 ="my name is abc";
		String [] arr = s1.split("");
		System.out.println(arr[3]);
		System.out.println(arr.length);
		System.out.println("===============");
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]);
		}
	}

}
