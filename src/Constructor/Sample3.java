package Constructor;

public class Sample3 {
	public static void main(String[] args) {
		System.out.println(" ----- user defined constructor with no paramaeter-----------");
		
		Sample3 n1 = new Sample3();
		n1.name();
		
		sample2 n2 = new sample2();
		n2.name();
	}
	
	int num1;
	int num2;
	
	Sample3(){
		num1=3;
		num2=5;
		
	}
	
	public void name() {
		System.out.println(num1+num2);
		sample2 n2 = new sample2();
		System.out.println(n2.l);
		
	}

}
