package control_statement;

public class nested_if {
	public static void main(String[] args) {
		int pem = 550;
		int men = 250;
		if(pem>=350) {
			System.out.println("you are eligible for men");
			if(men>=350) {
				System.out.println("you got selected");
				
			}else {
				System.out.println("you are not selected");
				
			}
			
		}else
		{
			System.out.println("at this time you are not selcetd try it after one year");
			
			
		}
		

}
}
