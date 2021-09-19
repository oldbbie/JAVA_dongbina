
//public class Main {
//
//	public static int factorial(int number) {
//		int result = 1;
//		for(int i = 2; i<=number; i++)
//		{
//			result *= i;
//		}
//		return result;
//	}
//	
//	public static void main(String[] args) {
//
//		System.out.println("10ÀÇ ÆÑÅä¸®¾óÀº " + factorial(10));
//
//	}
//
//}

public class Main {

	public static int factorial(int number) {
		if(number == 1)
			return 1;
		else
			return number * factorial(number-1);
	}
	
	public static void main(String[] args) {
		System.out.println("10 ÆÑÅä¸®¾óÀº " + factorial(10));
	}
}