import java.util.Scanner;
import java.util.regex.Pattern;

public class Print_Util {

	private static Scanner sc = new Scanner(System.in);
	
	public static void clearScreen() {
		for (int i = 0; i < 80; i++)
			System.out.println("");
	}
	
	public static void showMenu() {
		System.out.println("�������� �¼� ���� ���α׷�");
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		System.out.println("3. ����");
	}
	public static void logIn() {
		System.out.println("**�α���**");
		System.out.println("ȸ���̸� : ");
		String name = sc.nextLine();
		System.out.println("��й�ȣ : ");
		String pwd = sc.nextLine();
	}
	public static void logInMenu() {
		System.out.println("1. �����ϱ�");
		System.out.println("2. ����Ȯ��");
		System.out.println("3. �������");
		System.out.println("4. �α׾ƿ�");
		System.out.println("5. ����");
	}
	
	public static Member signIn() {
		String form;
		String name, passportNum, cardInfo, pwd, phoneNum;
		System.out.println("ȸ������ *********");
		while (true) {
			System.out.println("�̸�	      : ");
			name = sc.nextLine();
			form = "[��-�R]{2,4}+";
			if (!Pattern.matches(form, name)) {
				System.out.println("������ �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("���ǹ�ȣ\t: ");
			passportNum = sc.nextLine();
			form = "([a-zA-Z]{1}|[a-zA-Z]{2})\\d{8}";
			
			if (!Pattern.matches(form, passportNum)) {
				System.out.println("������ �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("�ڵ�����ȣ\t : ");
			phoneNum = sc.nextLine();
			form = "(010)-\\d{4}-\\d{4}";
			if (!Pattern.matches(form, phoneNum)) {
				System.out.println("������ �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("ī���ȣ\t : ");
			cardInfo = sc.nextLine();
			form = "^\\d{4}-?\\d{4}-?\\d{4}-?\\d{4}$";
			if (!Pattern.matches(form, cardInfo)) {
				System.out.println("������ �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
			} else {
				break;
			}
		}
		while(true) {
			System.out.println("��й�ȣ\t : ");
			pwd = sc.nextLine();
			form = "^(?=.*[a-zA-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";
			if (!Pattern.matches(form, pwd)) {
				System.out.println("������ �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
			} else {
				break;
			}
		}
		return new Member(name, phoneNum, cardInfo, passportNum, pwd);
	}
	public static void showCal() {
		Calendar.input();
    	Calendar.output(Calendar.year, Calendar.month);
    	System.out.println("������ ��¥�� ���� �Է��ϼ���.");
	}
}