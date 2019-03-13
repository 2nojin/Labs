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
							System.out.println("�α��� ����!");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						A:	while(true) { 		// �α��� ȭ������ ���ɴϴ�!
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
									case Constants.LOG_OUT :			//�α׾ƿ��� �ϸ� ����ȭ������ !
										System.out.println("�α׾ƿ� ��.");
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
										System.out.println("�ùٸ� ���ڸ� �ٽ� �Է��ϼ���.");

								}
							}
							break;
						case Constants.EXIT : 
							return;
						case Constants.MANAGER_MODE :
							break;
						default : 
							System.out.println("�ùٸ� ���ڸ� �ٽ� �Է��ϼ���.");
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