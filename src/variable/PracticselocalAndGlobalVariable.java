package variable;

public class PracticselocalAndGlobalVariable {
	public static void main(String[] args) {
		System.out.println("doing practicse");
		PracticselocalAndGlobalVariable s1 = new PracticselocalAndGlobalVariable();
		s1.name();
		names();

	
		
		
		
	}
	int i=30;   // this is not static method
	static int j=40;
	
	public void name() {
		System.out.println(i);
		System.out.println(j);    // here we can access the static variable in the non static method
		Sample2 s3 = new Sample2();
		System.out.println(s3.k);
		
	}
	
	public static void names() {
		System.out.println(j); 
		System.out.println(Sample2.m);
		// but here if we want to access the non static variable in the static method we can not access this
		
		
	}

}
