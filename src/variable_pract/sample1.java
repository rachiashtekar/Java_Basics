package variable_pract;



public class sample1 {
	public static void main(String[] args) {
		sample1 s=new sample1();
		s.name();
		
		sample1 s2=new sample1();
		s2.name1();
		
	}
	
	int a=20;
	
	public void name() {
		int b=30;
		System.out.println(a);
	}
	
	public void name1()
	{
		System.out.println(a);
		sample2 s3 = new sample2() ;
		System.out.println(s3.c);
			
		
	}
}


