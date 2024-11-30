package Array;

public class Ex3_printArrayReverseOrder {
	public static void main(String[] args) {
		int [] arr= new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println(arr.length);
		System.out.println(arr[2]);
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

	
	

}
