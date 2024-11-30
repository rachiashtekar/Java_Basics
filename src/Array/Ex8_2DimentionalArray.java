package Array;

public class Ex8_2DimentionalArray {
	public static void main(String[] args) {
		//  0  1  2
		//0 10 20 30
		//1 40 50 60
		
		//1.Array Declaration 
		int [][] arr=new int [2][3];      //row[2] column[3]
		
		//2.Array initialization
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		System.out.println(arr[1][2]);
		System.out.println(arr.length);
		System.out.println("-----------------");
		for (int i=0;i<=1;i++) { // 1:outer for loop ->rows
			for(int j=0;j<=2;j++) {   // 2.inner for loop -> cols
				System.out.print(arr[i][j]+" ");  //3.print info using statement
			}
			System.out.println();    //4. empty println statement
		}
		
	}

}
