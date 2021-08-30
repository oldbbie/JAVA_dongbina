
public class Main {
	
	/*
	public static void main(String[] args) {
		
		int intType = 10;
		double doubleType = 150.5;
		String stringType = "동빈나";
		
		System.out.println(intType);
		System.out.println(doubleType);
		System.out.println(stringType);
	}
	
	*/
	
	/*
	final static double PI = 3.141592;
	
	public static void main(String[] args) {
		
		int r = 30;
		System.out.println(r * r * PI);
		
	}
	
	*/
	
	/*
	final static int INT_MAX = 2147483647;

	public static void main(String[] args) {

		int a = INT_MAX;
		System.out.println(a+1);
		
	}
	
	*/
	
//	public static void main(String[] args) {
//
//		int a = 1;
//		int b = 2;
//		
//		System.out.println("a + b = " + (a + b));
//		System.out.println("a - b = " + (a - b));
//		System.out.println("a * b = " + (a * b));
//		System.out.println("a / b = " + (a / b));
//		
//	}
	
	public static void main(String[] args) {

		double b = 0.5;
		int a = (int) (b + 0.5);
		
		System.out.println("형변환을 이용한 반올림하기");
		System.out.println("0.5를 더하고 형변환을 하면 된다.");
		System.out.println("그냥 형변환을 하면 내림이 되는듯.");
		System.out.println("0.5 반올림 : " + a);
		
		b = 0.4;
		a = (int) (b + 0.5);
		System.out.println("0.4 반올림 : " + a);
		
	}

}
