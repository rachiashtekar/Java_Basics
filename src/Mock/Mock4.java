package Mock;

public class Mock4 {
	
	public static void main(String[] args) {
		name();
		
	}
	
	public static void name() {
		int age=18;
		int weight=40;
		
		if(age>=18) {
			 System.out.println("your age fine go further process");
			 
			 if(weight>=50) {
				 System.out.println("your eligible for the blood donating");
			 }
			 else {
				 System.out.println("sorry can do the blood donation");
			 }
			
			
		}else {
			System.out.println("your are not eligible for the blood donating");
		}
		
		
	}

}
