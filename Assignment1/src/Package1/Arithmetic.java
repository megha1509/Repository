package Package1;

public class Arithmetic {
	
	public int Sum (int a, int b) {
		int c =  a + b;
		return c;
	}
	
	public int Subtract (int d, int e) {
		int f =  d - e;
		return f;
	}
	
	public int Multiplication(int g, int h) {
		int i = g*h;
		return i;
	}
	
	public int Division(int j, int k) {
		int l = j/k;
		System.out.println("Final Result = " + l + "\n");
		return l;
	}


	public static void main(String[] args) {
		Arithmetic obj = new Arithmetic();
		
		System.out.println("Assigment 1 ((((10+2)+2)-2)*2)/2):");
		int sumResult = obj.Sum(10,2);
		int sumResult1 = obj.Sum(sumResult,2);
		int subResult = obj.Subtract(sumResult1,2);
		int multiResult = obj.Multiplication(subResult,2);
		obj.Division(multiResult,2);
		
		
		System.out.println("Assigment 2 ((((10*2)-2)+2)-2)/2):");
		int multiResult1 = obj.Multiplication(10,2);
		int subResult1 = obj.Subtract(multiResult1,2);
		int sumResult2 = obj.Sum(subResult1,2);
		int subResult2 = obj.Subtract(sumResult2,2);
		obj.Division(subResult2,2);
	}

}
