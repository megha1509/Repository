package Package1;

public class Student { //Class Declaration

	int rollno;  //Variables Declaration
	int age;
	
	public void display1() { //First Method Declaration
		System.out.println("Welcome to all of you");
	}
	
	public void display2() { //Second Method Declaration
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) { //Main Method ---- Entry Point
		Student Megha = new Student(); //Object Creation
		Megha.rollno = 123;
		Megha.age = 20;
		Megha.display1();
		Megha.display2();
		System.out.println("Student Roll Number = " + Megha.rollno);
		System.out.println("Student Age = " + Megha.age);
	}

}
