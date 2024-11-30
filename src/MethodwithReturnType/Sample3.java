package MethodwithReturnType;

public class Sample3 {
	public static void main(String[] args) {
		Sample3 s3 = new Sample3();
		int num1=5;
		int num2 = s3.add(20, 30);
		int num3 = s3.mul(num1, num2);
		System.out.println(num3);
		
	}
	public int add(int a,int b) {
		int c= a+b;
		return c;
	}
    public int mul(int c , int d) {
    	int e= c*d;
    	return e;
    }
}
