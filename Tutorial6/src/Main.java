
public class Main {

//	public static void main(String[] args) {
//		
//		int score = 95;
//		
//		if(score >= 90)
//		{
//			System.out.println("A+�Դϴ�.");
//		}
//		else if(score >= 80)
//		{
//			System.out.println("B+�Դϴ�.");
//		}
//		else if(score >= 70)
//		{
//			System.out.println("C+�Դϴ�.");
//		}
//		else
//		{
//			System.out.println("F�Դϴ�.");
//		}
//
//	}
	
//	public static void main(String[] args) {
//		
//		String a = "Man";
//		int b = 0;
//		
//		if(a.equals("Man")) // ���ڿ��� ������ ����.(��ҹ�����)
//		{
//			System.out.println("�����Դϴ�.");
//		}
//		else
//		{
//			System.out.println("���ڰ� �ƴմϴ�..");
//		}
//		
//		if(b == 3)
//		{
//			System.out.println("b�� 3�Դϴ�.");
//		}
//		else
//		{
//			System.out.println("3�� �ƴմϴ�.");
//		}
//		
//		if(a.equalsIgnoreCase("man") && b == 0) //��ҹ��� �����ϰ� ������ ����.
//		{
//			System.out.println("���Դϴ�.");
//		}
//		else
//		{
//			System.out.println("�����Դϴ�.");
//		}
//	}
	
//	public static void main(String[] args) {
//		
//		int i = 1, sum = 0;
//		while(i <= 1000)
//		{
//			sum += i++;
//		}
//		
//		System.out.println("1���� 1000������ ���� " + sum + "�Դϴ�." );
//		
//	}
	
//	final static int N = 30;
//	
//	public static void main(String[] args) {
//		
//		for(int i = N; i > 0; i--)
//		{
//			for(int j = i; j>0; j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

//	final static int N = 15;
//	
//	public static void main(String[] args) {
//	
//		for(int i = -N; i <= N; i++)
//		{
//			for(int j= -N; j <= N; j++)
//			{
//				if(i * i + j * j <= N * N)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println("");
//		}
//		
//	}
	
	public static void main(String[] args) {
		
		int count = 0;
		
		for(;;)
		{
			System.out.println(count);
			count++;
			if(count == 10)
			{
				break;
			}
		}
		System.out.println("�ݺ��� �������ϴ�. ");
	}
}
