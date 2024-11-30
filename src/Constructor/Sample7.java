package Constructor;

public class Sample7 {
	
	public static void main(String[] args) {
		
		Sample7 m1 = new Sample7("rachi",45,'A',45.4f);
		m1.name();
		}
	String name;
	int roll_no;
	char Grade;
	float per;
	static int i =10;
	
	Sample7(String name1,int roll_no1,char Grade1,float per1){
		name=name1;
		roll_no=roll_no1;
		Grade=Grade1;
		per=per1;
		
	}
	public void name() {
		System.out.println("hiii");
		System.out.println(name+" "+roll_no+" "+Grade+" "+per);
		System.out.println("name : "+name);
		System.out.println("roll_no : "+roll_no);
		System.out.println(i);
		System.out.println(name+roll_no);
	}
	
	

}
