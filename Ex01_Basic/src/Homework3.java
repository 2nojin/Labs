import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		System.out.println("1.����, 2.����, 3.�� �� �ϳ��� �Է��ϼ���(�����Է�)");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		int i = (int) ((Math.random() * 4) + 1);
		if (j == 1) {
			System.out.println("�� ���� : ����");
		} else if (j == 2) {
			System.out.println("�� ���� : ����");
		} else if (j == 3) {
			System.out.println("�� ���� : ��");
		} else
			System.out.println("1,2,3 �� �� �ϳ��� �Է��ϼ���.");

		if (i == 1) {
			System.out.println("��ǻ�� : ����");

			System.out.println();
			if (j == 1) {
				System.out.println("�����ϴ�.");
			} else if (j == 2) {
				System.out.println("�̰���ϴ�.");
			} else if (j == 3) {
				System.out.println("�����ϴ�.");
			} else {
				System.out.println("��Ȯ�� ���� �Է����ּ���");
			}
		} else if (i == 2) {
			System.out.println("��ǻ�� : ����");

			System.out.println();
			if (j == 1) {
				System.out.println("�����ϴ�.");
			} else if (j == 2) {
				System.out.println("�����ϴ�.");
			} else if (j == 3) {
				System.out.println("�̰���ϴ�.");
			} else
				System.out.println("��Ȯ�� ���� �Է����ּ���");
		} else if (i == 3) {
			System.out.println("��ǻ�� : ��");

			System.out.println();
			if (j == 1) {
				System.out.println("�̰���ϴ�.");
			} else if (j == 2) {
				System.out.println("�����ϴ�.");
			} else if (j == 3) {
				System.out.println("�����ϴ�.");
			} else {
				System.out.println("��Ȯ�� ���� �Է����ּ���");
			}
		} else
			System.out.println("Error");

	}
}