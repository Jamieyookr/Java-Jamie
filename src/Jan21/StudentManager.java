package Jan21;

import java.util.Scanner;

public class StudentManager {
	static Scanner scan = new Scanner(System.in);
	static Scanner scan2 = new Scanner(System.in);
	
	static final int MAX = 2;
	static Student[] stArr = new Student[MAX];
	static int top = 0;
	
	static Student mkStudent() {
		Student student = new Student();
		System.out.print("����>>> ");
		student.name = scan2.nextLine();
		System.out.print("�а�>>> ");
		student.mj = scan.next();
		System.out.print("����>>> ");
		student.score = scan.nextDouble();
		System.out.print("���>>> ");
		student.rank = scan.nextInt();
		
		return student;
	}
	
	static int menu() {
		int no = 0;
		System.out.println("1.input 2.output 3.search 4.modify 5.delete 6.end");
		System.out.print("Choice>>> ");
		try {
			no = scan.nextInt();
		} catch (Exception e) {
			System.out.println("������ �Է� �����մϴ�!");
			scan.next(); // ���۸� ����ش�.
			menu(); // ���ȣ��
		}
		return no;
	}
	
	static void input() {
		System.out.println("::: INPUT :::");
		// stArr �迭�� top������ ��ü�� �����ϰ� top�� �����Ѵ�.
		if(top>=MAX) {
			System.out.println("�� �̻� �Է� �Ұ����մϴ�!");
			return;
		}
		stArr[top++] = mkStudent();
		System.out.println("�Է� ����!!");
	}
	
	static void output() {
		System.out.println("::: OUTPUT :::");
		for(int i=0; i<top; i++) {
			System.out.println(stArr[i]);
		}
	}
	
	static void search() {
		System.out.println("::: SEARCH :::");
	}
	
	static void modify() {
		System.out.println("::: MODIFY :::");
	}
	
	static void delete() {
		System.out.println("::: DELETE :::");
	}
	
	static void end() {
		System.out.println("::: END :::");
		System.out.println("���α׷��� �����մϴ�. \n�����ϼ̽��ϴ�!");
		System.exit(0);// ���� ����!
	}

	public static void main(String[] args) {
		while(true) {
			int no = menu();
			switch(no) {
			case 1 : input(); break;
			case 2 : output(); break;
			case 3 : search(); break;
			case 4 : modify(); break;
			case 5 : delete(); break;
			case 6 : end(); break;
			default : System.out.println("���: �ش���� �����ϴ�!");
			}
			System.out.println("---------------------------------");
		}
	}
}
