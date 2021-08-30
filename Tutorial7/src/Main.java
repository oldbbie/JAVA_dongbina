//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//	
//		Scanner sc = new Scanner(System.in);
//		System.out.print("������ �Է��ϼ��� : ");
//		int i = sc.nextInt();
//		System.out.println("���µ� ������ " + i + "�Դϴ�.");
//		sc.close();
//	}
//
//}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		File file = new File("input.txt");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt())
			{
				System.out.println(sc.nextInt() * 100);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("������ �ҷ����� ���߿� ������ �߻��߽��ϴ�.");
		}
	}
	
}


