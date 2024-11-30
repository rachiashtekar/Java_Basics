package Interface_pract;

public class Testing_Demo implements Demo1, Demo2 {
	
	public static void main(String[] args) {
		Testing_Demo d = new Testing_Demo();
		d.d1();
		d.d2();
		d.d3();
	}


	public void d3() {
		System.out.println("pinting d3 method");
		
	}


	public void d1() {
		System.out.println("printing d1 method");
		
		
	}


	public void d2() {
		System.out.println("printing d2 method");  // it is common method from Demo1 and Demo2
		
		
	}

}
