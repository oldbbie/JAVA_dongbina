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
//		 System.out.print("������ �迭�� ũ�⸦ ������ּ��� : ");
//		 int number = scanner.nextInt();
//		 int[] array = new int[number];
//		 for(int i = 0; i < number; i++) {
//			 System.out.print("�迭�� �Է��� ������ �ϳ��� �Է��ϼ���(�����) : ");
//			 array[i] = scanner.nextInt();
//		 }
//		 int result = -1;
//		 for(int i = 0; i < number; i++) {
//			 result = max(result, array[i]);
//		 }
//		 System.out.println("�迭�� �Է��� ���� �߿� ���� ū���� " + result + "�Դϴ�.");
//	}
//
//}

public class Main {
	
	public static void main(String[] arg) {
		int[] array = new int[100];
		for(int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 100 + 1 );
		//Math.random() �� 0 <= x < 1 �� ���ڸ� �����ϰ� �����Ѵ�.
		}
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			sum += array[i];
		}
		System.out.println("100���� 1~100������ ������ ������ ��հ��� " + sum/100 + " �Դϴ�.");
	}
	
}