package Practicse;

public class else_if_pract {
	
	public static void main(String[] args) {
	else_if_pract p = new else_if_pract();
	p.name();
		
	}
	
	public void name() {
		int a=3;
		int b=4;
		int c=6;
		if(a>b&&a>c) {
			System.out.println("a is greater");
		}
		
		else if(b>a&&b>c) {
			System.out.println("b is greater");
		}
		
		else if(c>a&&c>b) {
			System.out.println("c is greater");
		}
		
	}

}
