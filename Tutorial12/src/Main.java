
//public class Main {
//
//	public static int fibonacci(int number) {
//		int one = 1;
//		int two = 1;
//		int result = -1;
//		if(number == 1) return one;
//		else if(number == 2) return two;
//		else {
//			for(int i = 2; i < number; i++) {
//				result = one + two;
//				one = two;
//				two = result;
//			}
//			return result;
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		System.out.println("피보나치 수열의 10번째 원소는" + fibonacci(10) +"입니다.");
//	}
//
//}

public class Main {
// 이런 재귀함수는 오래걸린다. 그래서 동적프로그래밍을 이용해 이러한 문제를 해결할 수 있다.
	public static int fibonacci(int number) {
		if(number == 1) return 1;
		else if(number == 2) return 1;
		else return fibonacci(number-1) + fibonacci(number-2);
	}
	
	public static void main(String[] args) {
		
		System.out.println("피보나치 수열의 10번째 원소는" + fibonacci(10) +"입니다.");
	}

}
