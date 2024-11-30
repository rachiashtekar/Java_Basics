package AccessSpecifier;
// scope of this public access specifier is throughout the class
public class Sample2 {
	public static void main(String[] args) {
		Sampe1 s2=new Sampe1();
		System.out.println(s2.num);
		
		Sampe1 s3=new Sampe1();
		s3.squareOfNum();
		System.out.println(s3.num);
		
	}

}
