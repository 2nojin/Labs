import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
HashMap ����� �α��� �ý���

		//ȸ�� �α��� ������ HashMap ���� ����
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		
		//�ý��ۿ� �α��� �ϴ� �ó�����
		//ID(0) , PWD(0)  >> ȸ��  (ȯ��)
		//ID(0) , PWD(x)  >> ����  (����ٽ� �Է�)
		
		//ID(x) , PWD(x)  >> ����  (�ٽ� �Է���)
		//ID(x) , PWD(0)
		
		//Scanner ����ؼ�  ID, PWD �Է¹�������
		//loginmap ���ؼ� ���� ���� ó��
		//ID �Ǵ�  PWD Ʋ���� �ٽ� �Է� ��û
		//ID , PWD �� ������ ȸ���� �湮 ȯ���մϴ� ^^ (��� ���α׷� ����)
	    //ID �� ����ڰ� �Է��� ID ���� �ҹ��ڷ�
*/
public class Ex13_HashMap_Quiz {

	public static void main(String[] args) {

		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		//ȸ�� ������..
		
		
		//�����Ϸ��°� == �α��� �ý���
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("���̵� �Է��ϼ���");
//		String id = sc.nextLine();
//		System.out.println("��й�ȣ�� �Է��ϼ���");
//		String pw = sc.nextLine();
		
		
		
		while(true) {
			System.out.println("���̵� �Է��ϼ���");
			String id = sc.nextLine().trim().toLowerCase();
			System.out.println("��й�ȣ�� �Է��ϼ���");
			String pw = sc.nextLine().trim();
		
			if(!loginmap.containsKey(id)) { //!loginmap.containsKey(id)
				System.out.println("���̵� �����ʽ��ϴ�. �ٽ� �Է��ϼ���!");
				
		}else {
			if(loginmap.get(id).equals(pw)) { //loginmap.get(id).equals(pw)
				System.out.println("�ݰ����ϴ�");
				break;
			}else {
				System.out.println("��й�ȣ�� �����ʽ��ϴ�. �ٽ��Է��ϼ���!");
				}
			}

		}

	}
}

