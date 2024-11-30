package Array;
import java.util.Arrays;

public class Ex5_ArraySorting_find_smallest_and_highestNumFromArray {
	public static void main(String[] args) {
		int [] arr = new int[5];
		arr[0]=50;
		arr[1]=10;
		arr[2]=30;
		arr[3]=40;
		arr[4]=20;
		
		Arrays.sort(arr);  // here first sort
		System.out.println(arr[0]);  // then print smallest array of number
		System.out.println(arr[arr.length-1]); // then print highest number of array
		
	}

}
