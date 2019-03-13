import java.util.Scanner;
import java.util.regex.Pattern;

public class Print_Util {

	private static Scanner sc = new Scanner(System.in);
	
	public static void clearScreen() {
		for (int i = 0; i < 80; i++)
			System.out.println("");
	}
	
	public static void showMenu() {
		System.out.println("노진에어 좌석 예약 프로그램");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
	}
	public static void logIn() {
		System.out.println("**로그인**");
		System.out.println("회원이름 : ");
		String name = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pwd = sc.nextLine();
	}
	public static void logInMenu() {
		System.out.println("1. 예매하기");
		System.out.println("2. 예매확인");
		System.out.println("3. 예매취소");
		System.out.println("4. 로그아웃");
		System.out.println("5. 종료");
	}
	
	public static Member signIn() {
		String form;
		String name, passportNum, cardInfo, pwd, phoneNum;
		System.out.println("회원가입 *********");
		while (true) {
			System.out.println("이름	      : ");
			name = sc.nextLine();
			form = "[가-힣]{2,4}+";
			if (!Pattern.matches(form, name)) {
				System.out.println("형식이 올바르지 않습니다. 다시 입력하세요.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("여권번호\t: ");
			passportNum = sc.nextLine();
			form = "([a-zA-Z]{1}|[a-zA-Z]{2})\\d{8}";
			
			if (!Pattern.matches(form, passportNum)) {
				System.out.println("형식이 올바르지 않습니다. 다시 입력하세요.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("핸드폰번호\t : ");
			phoneNum = sc.nextLine();
			form = "(010)-\\d{4}-\\d{4}";
			if (!Pattern.matches(form, phoneNum)) {
				System.out.println("형식이 올바르지 않습니다. 다시 입력하세요.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("카드번호\t : ");
			cardInfo = sc.nextLine();
			form = "^\\d{4}-?\\d{4}-?\\d{4}-?\\d{4}$";
			if (!Pattern.matches(form, cardInfo)) {
				System.out.println("형식이 올바르지 않습니다. 다시 입력하세요.");
			} else {
				break;
			}
		}
		while(true) {
			System.out.println("비밀번호\t : ");
			pwd = sc.nextLine();
			form = "^(?=.*[a-zA-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";
			if (!Pattern.matches(form, pwd)) {
				System.out.println("형식이 올바르지 않습니다. 다시 입력하세요.");
			} else {
				break;
			}
		}
		return new Member(name, phoneNum, cardInfo, passportNum, pwd);
	}
	public static void showCal() {
		Calendar.input();
    	Calendar.output(Calendar.year, Calendar.month);
    	System.out.println("예매할 날짜의 일을 입력하세요.");
	}
}