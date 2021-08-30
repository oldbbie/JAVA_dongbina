
public class Main {

//	public static void main(String[] args) {
//		
//		int score = 95;
//		
//		if(score >= 90)
//		{
//			System.out.println("A+입니다.");
//		}
//		else if(score >= 80)
//		{
//			System.out.println("B+입니다.");
//		}
//		else if(score >= 70)
//		{
//			System.out.println("C+입니다.");
//		}
//		else
//		{
//			System.out.println("F입니다.");
//		}
//
//	}
	
//	public static void main(String[] args) {
//		
//		String a = "Man";
//		int b = 0;
//		
//		if(a.equals("Man")) // 문자열이 같은지 본다.(대소문구분)
//		{
//			System.out.println("남자입니다.");
//		}
//		else
//		{
//			System.out.println("남자가 아닙니다..");
//		}
//		
//		if(b == 3)
//		{
//			System.out.println("b는 3입니다.");
//		}
//		else
//		{
//			System.out.println("3이 아닙니다.");
//		}
//		
//		if(a.equalsIgnoreCase("man") && b == 0) //대소문자 무시하고 같은지 본다.
//		{
//			System.out.println("참입니다.");
//		}
//		else
//		{
//			System.out.println("거짓입니다.");
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
//		System.out.println("1부터 1000까지의 합은 " + sum + "입니다." );
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
		System.out.println("반복이 끝났습니다. ");
	}
}
