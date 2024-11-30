package Inheritance_practicse;

public class dog extends Animal {
	
	public void honesty() {
		System.out.println("animal is very honest");
		
	}
	
	public static void main(String[] args) {
		dog d = new dog();
		d.color();
		d.sound();
		d.honesty();
	}

}
