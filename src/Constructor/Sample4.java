package Constructor;

public class Sample4 {
	public static void main(String[] args) {
		System.out.println("-----user defined constructor with paramater-----");
		
		Sample4 s1 =new Sample4(3,4);
		s1.add();
		
		Sample4 s2 =new Sample4(5,4);
		s2.add();
	}

	int num1;
	int num2;
	
	Sample4(int a, int b){
		num1=a;
		num2=b;
		
		
	}
	public void add() {
		System.out.println(num1 + "+" + num2 + "=" +(num1+num2));
		
		
		
	}
	
}
