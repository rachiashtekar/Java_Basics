package variable;

public class global_and_local {
	
	public static void main(String[] args) {
		System.out.println("here we will see the global and local variable");
		global_and_local s1=new global_and_local();
		s1.name();
		s1.names();
		p1();
		sample1.n1();
		
		sample1 n2 = new sample1();
		System.out.println(n2.j);   // getting non static variable from diff class
		
	
		
	}
	int a=34;
	int c=56;
	static int d=78;
		
	public  void name() {      // here i have used non static method 
		int b=60;
		
		System.out.println(a);
		System.out.println(b);
//		
	}
	
	public void names() {     // non static method
		System.out.println(c);
		sample1 n3 = new sample1();
		System.out.println(n3.j); 
		
		
	}
	
	public static void p1() {    
		System.out.println(d);
		System.out.println(sample1.i);   //  getting this variable from diff class
		global_and_local m = new global_and_local();
     	System.out.println(m.a);
	}
	
	
}
