package Constructor;

public class Sample12 {
	public static void main(String[] a) {  // we can use a in the place of args
		System.out.println("here we will se the multiple contsrutor in same class");
		Sample12 s12 = new Sample12(3,4);
		s12.add();
		Sample12 s13 = new Sample12("rachi");
		s13.name1();
	}
	
	int num1;
	int num2;
	String name;
	
	Sample12(int a,int b){
		num1=a;
		num2=b;
		
		
	}
	
	Sample12(String s1){
		name=s1;
		
	}
	
	public void add() {
		System.out.println(num1+num2);
		
	}
	
	public void name1() {
		System.out.println(name);
		
	}

}
