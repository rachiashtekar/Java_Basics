package MethodwithReturnType;

public class Sample1 {
public static void main(String[] args) {
//  int num2 = add(10,20);
//  System.out.println(num2);
//  System.out.println(add(5,6));
	
	int sum= add(10,20);
	System.out.println(sum);
}
public static int add(int a,int b) {
    int c= a+b;
	return c;
}
}
//int return type: Returns an integer value that can be used or assigned.

//void return type: Does not return any value; only performs an action (like printing, modifying something) without giving a result back.