package Array;

public class Ex9_2DimentionalArray_declarationInitializationSingleStep {
	public static void main(String[] args) {
		int [][] arr= {{10,20,20},{40,50,60},{70,80,90}};
		System.out.println(arr.length);
		System.out.println(arr[1][2]);
		System.out.println("--------------");
		for(int i=0;i<=2;i++) {
			for(int j=0; j<=2;j++) {
				System.out.print(arr[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
	}

}
