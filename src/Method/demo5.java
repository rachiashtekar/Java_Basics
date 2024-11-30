package Method;

public class demo5 {
public static void main(String[] args) {                  // main method
	System.out.println("Welcome to the demo class 5");
	
	n1();   // static method calling
	demo5 t= new demo5();
	t.n2();
	
	demo3 p=new demo3();
	p.m1();
}
// there is two types of methods 
//1> main method 
//2>Regular method
// in the regular method there is two type of method
// 1. static method 
// 2. non static method

// this is the static method 
public static void n1() {
	System.out.println("n1 is running");
	
}

// this is the non static method
public void n2() {
	System.out.println("n2 is running in the same class");
	
}

}
