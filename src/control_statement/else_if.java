package control_statement;

public class else_if {
  public static void main(String[] args) {
	int marks =87;
	if(marks>=90) {
		System.out.println("you secure A grade");
	}
	else if(marks>=80 & marks<=90){
		System.out.println("you secure B grade");
		
	}
	else if(marks>=60 & marks<=80) {
		System.out.println("you secure C grade");
	}
	else if(marks>=40 & marks<=60) {
		System.out.println("you secure D grade");
	}
	else if(marks<40) {
		System.out.println("you are failed in this exam");
	}
}
}
