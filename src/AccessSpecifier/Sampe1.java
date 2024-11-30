package AccessSpecifier;
// private Access specifier    scope is only for this class
public class Sampe1 {
	public static void main(String[] args) {
		Sampe1 s1 = new Sampe1();
		s1.squareOfNum();
	}
	 int num;
	Sampe1(){
		num=3;
	}
	
 
	public void squareOfNum() {
		System.out.println(num*num);
		
	}

}
