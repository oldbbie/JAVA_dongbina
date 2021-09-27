//import java.util.Scanner;
//
//public class Main {
//
//	public static int max(int a, int b) {
//		return (a>b) ? a:b;
//	}
//	public static void main(String[] args) {
//		
//		 Scanner scanner = new Scanner(System.in);
//		 System.out.print("생성할 배열의 크기를 만들어주세요 : ");
//		 int number = scanner.nextInt();
//		 int[] array = new int[number];
//		 for(int i = 0; i < number; i++) {
//			 System.out.print("배열에 입력할 정수를 하나씩 입력하세요(양수만) : ");
//			 array[i] = scanner.nextInt();
//		 }
//		 int result = -1;
//		 for(int i = 0; i < number; i++) {
//			 result = max(result, array[i]);
//		 }
//		 System.out.println("배열에 입력한 정수 중에 가장 큰값은 " + result + "입니다.");
//	}
//
//}

public class Main {
	
	public static void main(String[] arg) {
		int[] array = new int[100];
		for(int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 100 + 1 );
		//Math.random() 는 0 <= x < 1 의 숫자를 랜덤하게 생성한다.
		}
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			sum += array[i];
		}
		System.out.println("100개의 1~100까지의 랜덤한 정수의 평균값은 " + sum/100 + " 입니다.");
	}
	
}