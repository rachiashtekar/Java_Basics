package Array;

public class Ex1_StringArray {
	
	public static void main(String[] args) {
		
		String[] arr = new String[5];
		
		arr[0]="rachi";
		arr[1]="aniket";
		arr[2]="anu";
		arr[3]="rahul";
		arr[4]="raghav";
		
		System.out.println(arr.length);
		System.out.println(arr[2]);
		for (int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
