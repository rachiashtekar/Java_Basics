package Practicse;

public class mock1 {
	public static void main(String[] args) {
		System.out.println("now we are starting our first mock");
		name(24,"rachi");
		
		mock1 s1=new mock1();
		s1.names(2, 3);
		ifname();
		ifelsename();
		elseifname();

	}
	// variable
	
	// variable  is nothing but a memory for storing the data at time we have only one data can be stored
	
	// data type
	
	// data type is used to represent the type of the data whether it is string int long double etc
	
	// we have here two types of datatypes.
	//1> premitive
	//2> Non premitive
	
	// In the premitive datatype memory is fixed 
	//1.int
	//2.long
	//3.double
	//4.float
	//5.byte
	//6.boolean
	//7.char
	//8.short
	
	// In the non premitive datatype the memory is not fixed
	//1.string
	
//	-------------------------------------------------------------------------------
//	Methods
	// A Method is a block of code which only runs when it is called
	// Here we have two types of methods 
	//1.Main method
	//2.Regular Method
	
	// 1.Main Method :-  Without main method java program can not be run the main methods is the starting point of java program from where compiler start to compile
	// 2. Regular Methods :- In the regular method we have two method
	 // 2.1 static method 
	 public static void name(int age , String name) {
		 System.out.println("Your name and age :-"+age+" "+name);
		
	}
	
	//  2.2 Non static method
	 public void names(int num1, int num2) {
		 System.out.println("num1+num2 ="+(num1+num2));
		
	}
//-------------------------------------------------------------------------------------
// Control statement
	 // 1. if
	 // 2. if else
	 // 3. else if
	 // 4. nested if
	 // 5. switch
	
	//1. if
	 
	
	public static void ifname() {
		int a=10;
		if(a==11) {
			System.out.println("you are corrcet");
		}
	}
	
	// 2. if else
	public static void ifelsename() {
		int a=10;
		if(a==11) {
			System.out.println("you are corrcet");
		}else
		{
			System.out.println("you are not correct");
		}
	}
	
	//3.else if
	public static void elseifname() {
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
	
	//4. nested if
	
	
	
	
		
	}