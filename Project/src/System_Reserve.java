import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class System_Reserve {
	static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		Writer writer = null;
		List<Member> member = null;
		try {
			member = new ArrayList();
			 writer = new PrintWriter("C:\\Temp\\Member.txt");
			 while(true) {
				 	Print_Util.clearScreen();
					Print_Util.showMenu();
					String select = sc.nextLine();
					switch(select) {
						case Constants.SIGN_IN :
							Print_Util.clearScreen();
							member.add(Print_Util.signIn());
							System.out.println(member);
							break;
						case Constants.LOG_IN :
							Print_Util.clearScreen();
							Print_Util.logIn();
							System.out.println("로그인 성공!");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						A:	while(true) { 		// 로그인 화면으로 들어옵니다!
							Print_Util.clearScreen();
							Print_Util.logInMenu();
							select = sc.nextLine();
								switch(select) {
									case Constants.RESERVATION : Print_Util.clearScreen();
										Print_Util.showCal();
							        	select = sc.nextLine();
										break;
									case Constants.RESERVATION_CHECK : Print_Util.clearScreen();
										break;
									case Constants.RESERVATION_CANCLE : Print_Util.clearScreen();
										break;
									case Constants.LOG_OUT :			//로그아웃을 하면 메인화면으로 !
										System.out.println("로그아웃 중.");
										try {
											Thread.sleep(500);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										break  A ; 
									case Constants.EXIT2 : 
										return;
									default :
										System.out.println("올바른 숫자를 다시 입력하세요.");

								}
							}
							break;
						case Constants.EXIT : 
							return;
						case Constants.MANAGER_MODE :
							break;
						default : 
							System.out.println("올바른 숫자를 다시 입력하세요.");
					}
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}