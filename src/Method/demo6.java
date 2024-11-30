//method with parameter
package Method;
public class demo6 {
public static void main(String[] args) {
	name(2,3);
	name(7,5);
	
	demo6 x = new demo6();
	x.n5(4,5);
	x.n5(3,2);
	
} 
// this is static method with parameter
public static void name(int num1, int num2) {
	System.out.println("sum of 2 number:"+(num1+num2));
}
	

	
// this is non static method with parameter
 public void n5(int a,int b) {
 System.out.println(a+b);
 
	

}
}
 