package Array;
import java.util.Arrays;
public class Ex4_ArraySorting1 {
	
	public static void main(String[] args) {
		int [] arr = new int[4];
		arr[0]=30;
		arr[1]=10;
		arr[2]=40;
		arr[3]=20;
		
		System.out.println("--print original data");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("---after sorting printing the data----");
		Arrays.sort(arr);
		System.out.println("ascending order");
		for (int i=0;i<=arr.length-1;i++) {
			
			System.out.println(arr[i]);
		}
		System.out.println("decending order");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
	}

}
