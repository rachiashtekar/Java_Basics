package AccessSpecifier;
// scope this private accessspecifier is throughout pacakge but if we want access this from another pacakge the can access using inheritance and use import keyword 
 public class Test1 {
	
	
  protected	int a;
	
	protected Test1(){
		a=2;
		
	}
	protected void m1() {
		System.out.println(a*a);
		System.out.println("here we priting the m1 method");

}
}
