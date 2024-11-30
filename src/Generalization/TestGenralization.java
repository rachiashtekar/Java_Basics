package Generalization;

public class TestGenralization {
public static void main(String[] args) {
	System.out.println("Features of saving Acc:");
	SavingsAcc saving = new SavingsAcc();
	saving.CD();
	saving.CW();
	saving.MT();
	saving.newfeaturesA();
	
	System.out.println("---------------------------------------------");
	
	System.out.println("features of current account");
	CurrentAcc current = new CurrentAcc();
	current.CD();
	current.CW();
	current.MT();
//	current.newfeaturesB();
	
	
	System.out.println("------------------------------------------------");
	
	System.out.println("features of Salary account ");
	SalAcc sal = new SalAcc();
	sal.CD();
	sal.CW();
	sal.MT();
	sal.newfeaturesC();
}
}
