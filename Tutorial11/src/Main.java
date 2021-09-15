
public class Main {

	public static int factorial(int number) {
		int result = 1;
		for(int i = 2; i<=number; i++)
		{
			result *= i;
		}
		return result;
	}
	
	public static void main(String[] args) {

		System.out.println("10의 팩토리얼은 " + factorial(10));

	}

}
