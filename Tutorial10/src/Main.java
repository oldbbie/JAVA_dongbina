
//public class Main {
//
//	// number의 k번째 약수를 찾는 함수
//	public static int function(int number, int k) {
//		for(int i = 1; i <= number; i++)
//		{
//			if(number % i == 0)
//			{
//				k--;
//				if(k == 0)
//				{
//					return i;
//				}
//			}
//		}
//		return -1;
//	}
//	
//	public static void main(String[] args) {
//		int result = function(3050, 10);
//		if(result == -1)
//		{
//			System.out.println("3050의 10번째 약수는 없습니다.");
//		}
//		else
//		{
//			System.out.println("3050의 10번재 약수는 " + result + " 입니다.");
//		}
//	}
//
//}

//public class Main {
//	
//	public static char function(String input) {
//		//charAt 어디에 위치한 값을 리턴한다.
//		return input.charAt(input.length() - 1);
//	}
//	
//	public static void main (String[] args) {
//		System.out.println("Hello World의 마지막 단어는 " + function("Hello World"));
//	}
//	
//}

public class Main {
	
	public static int max(int a, int b) {
		return (a>b) ? a : b;
	}
	
	public static int function(int a, int b, int c) {
		int result = max(a,b);
		result = max(result,c);
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("(354, 756, 222) 중에서 가장 큰 값은 " + function(354, 756, 222));
	}
	
}