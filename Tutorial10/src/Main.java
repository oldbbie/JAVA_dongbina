
//public class Main {
//
//	// number�� k��° ����� ã�� �Լ�
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
//			System.out.println("3050�� 10��° ����� �����ϴ�.");
//		}
//		else
//		{
//			System.out.println("3050�� 10���� ����� " + result + " �Դϴ�.");
//		}
//	}
//
//}

//public class Main {
//	
//	public static char function(String input) {
//		//charAt ��� ��ġ�� ���� �����Ѵ�.
//		return input.charAt(input.length() - 1);
//	}
//	
//	public static void main (String[] args) {
//		System.out.println("Hello World�� ������ �ܾ�� " + function("Hello World"));
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
		
		System.out.println("(354, 756, 222) �߿��� ���� ū ���� " + function(354, 756, 222));
	}
	
}