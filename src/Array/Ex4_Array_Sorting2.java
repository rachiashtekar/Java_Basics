package Array;
import java.util.Arrays;
public class Ex4_Array_Sorting2 {
	public static void main(String[] args) {
		String[] arr = new String[5];
		
		arr[0]="rachi";
		arr[1]="aniket";
		arr[2]="anu";
		arr[3]="rahul";
		arr[4]="raghav";
		
        System.out.println("before sorting");
		for (int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("after sorting");
		for(int i=0;i<=4;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	

}
