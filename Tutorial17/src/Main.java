
public class Main {

	public static void main(String[] args) {
	
		Student student1 = new Student("홍길동",20, 175, 70,"20170101",1,4.5);
		Student student2 = new Student("이순신",30, 170, 70,"20090505",1,3.5);

		student1.show();
		student2.show();
	
		Teacher teacher1 = new Teacher("Johe Doe", 25, 180, 120, "ABC201", 3000000, 5);
		teacher1.show();
	}

}
