package Package1;

public class Constructor {

	public Constructor() {
		this(20,30,40);
		System.out.println("Default Constructor");
	}
	
	public Constructor(int a) {
		this();
		System.out.println("One Parametrized Constructor");
	}
	
	public Constructor(int b, int c) {
		this(100);
		System.out.println("Two Parametrized Constructor");
	}
	
	public Constructor(int d, int e, int f) {
		System.out.println("Three Parametrized Constructor");
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor(10,20);
	}

}
