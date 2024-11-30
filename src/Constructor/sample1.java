package Constructor;

public class sample1 {
	public static void main(String[] args) {
		sample1 s1 = new sample1();
		s1.name();
		System.out.println(s1.i);
		
		sample2 s2 = new sample2();
		s2.name();
	}
	
	int i=34;
	int k=90;
	public void name() {
		System.out.println("hiiiii");
		System.out.println(k);
		
	}
}
