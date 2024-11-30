package Practicse;

public class nested_if_pract {
	
	public static void main(String[] args) {
		nested_if_pract t=new nested_if_pract();
		t.name();
		
	}
	
	public void name() {
		int age=45;
		int weight = 5;
		
		if(age>18 && age<60) {
			System.out.println("you are eligible for further test");
			if(weight>50) {
				System.out.println("you are eligible for blood donation");
				
			}
			else {
				System.out.println("you are not eligible for blood donation");
			}
			
		}
		
		else {
			System.out.println("you are not eligible for blood donating");
		}
				
	}

}
