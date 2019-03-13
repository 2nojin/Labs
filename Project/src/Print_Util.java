import java.util.Scanner;
import java.util.regex.Pattern;

public class Print_Util {

	private static Scanner sc = new Scanner(System.in);
	
	public static void clearScreen() {
		for (int i = 0; i < 80; i++)
			System.out.println("");
	}
	
	public static void showMenu() {
		System.out.println("³ëÁø¿¡¾î ÁÂ¼® ¿¹¾à ÇÁ·Î±×·¥");
		System.out.println("1. È¸¿ø°¡ÀÔ");
		System.out.println("2. ·Î±×ÀÎ");
		System.out.println("3. Á¾·á");
	}
	public static void logIn() {
		System.out.println("**·Î±×ÀÎ**");
		System.out.println("È¸¿øÀÌ¸§ : ");
		String name = sc.nextLine();
		System.out.println("ºñ¹Ð¹øÈ£ : ");
		String pwd = sc.nextLine();
	}
	public static void logInMenu() {
		System.out.println("1. ¿¹¸ÅÇÏ±â");
		System.out.println("2. ¿¹¸ÅÈ®ÀÎ");
		System.out.println("3. ¿¹¸ÅÃë¼Ò");
		System.out.println("4. ·Î±×¾Æ¿ô");
		System.out.println("5. Á¾·á");
	}
	
	public static Member signIn() {
		String form;
		String name, passportNum, cardInfo, pwd, phoneNum;
		System.out.println("È¸¿ø°¡ÀÔ *********");
		while (true) {
			System.out.println("ÀÌ¸§	      : ");
			name = sc.nextLine();
			form = "[°¡-ÆR]{2,4}+";
			if (!Pattern.matches(form, name)) {
				System.out.println("Çü½ÄÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("¿©±Ç¹øÈ£\t: ");
			passportNum = sc.nextLine();
			form = "([a-zA-Z]{1}|[a-zA-Z]{2})\\d{8}";
			
			if (!Pattern.matches(form, passportNum)) {
				System.out.println("Çü½ÄÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("ÇÚµåÆù¹øÈ£\t : ");
			phoneNum = sc.nextLine();
			form = "(010)-\\d{4}-\\d{4}";
			if (!Pattern.matches(form, phoneNum)) {
				System.out.println("Çü½ÄÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("Ä«µå¹øÈ£\t : ");
			cardInfo = sc.nextLine();
			form = "^\\d{4}-?\\d{4}-?\\d{4}-?\\d{4}$";
			if (!Pattern.matches(form, cardInfo)) {
				System.out.println("Çü½ÄÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
			} else {
				break;
			}
		}
		while(true) {
			System.out.println("ºñ¹Ð¹øÈ£\t : ");
			pwd = sc.nextLine();
			form = "^(?=.*[a-zA-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";
			if (!Pattern.matches(form, pwd)) {
				System.out.println("Çü½ÄÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
			} else {
				break;
			}
		}
		return new Member(name, phoneNum, cardInfo, passportNum, pwd);
	}
	public static void showCal() {
		Calendar.input();
    	Calendar.output(Calendar.year, Calendar.month);
    	System.out.println("¿¹¸ÅÇÒ ³¯Â¥ÀÇ ÀÏÀ» ÀÔ·ÂÇÏ¼¼¿ä.");
	}
}