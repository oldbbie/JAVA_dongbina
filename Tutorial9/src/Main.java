
public class Main {

	// ��ȯ�� �Լ���(�Ű�����)
	public static int function(int a, int b, int c) {
		int min = a;
		
		if(min > b) min = b;

		
		if(min > c) min = c;

		for(int i = min; i > 0; i--)
		{
			if(a % i == 0 && b % i == 0 && c % i ==0) return i;
		}
	
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("(400, 300, 750)�� �ִ� ����� : "+ function(400, 300, 750));

	}

}
