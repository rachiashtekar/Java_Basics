package MethodwithReturnType;

public class Sample2 {
public static void main(String[] args) {
	int num1=5;
	int num2 = add(20,30);
	System.out.println(num2);
	int num3 = mul(num1,num2);
	System.out.println(num3);
	
	
}
public static int add(int a,int b) {
	int c=a+b;
	return c;
}
public static int mul(int c,int d) {
	int e = c*d;
	return e;
}
}
