import java.io.File;

public class Mkdir {
	public static void main(String[] args) {
		

		if (args.length != 3 && args.length != 4) {
			System.out.println("���� : [java���ϸ�] [���丮���] mkdir [�������丮��]");
			System.out.println("���� : [java���ϸ�] [���丮���] rename [���ϸ�] [���ο� ���ϸ�]");
			System.out.println("���� : [java���ϸ�] [���丮���] delete [���ϸ�]");
			System.exit(0);
		}

		File f = new File(args[0]);
		if (!f.exists() || !f.isDirectory()) { // �������� �ʰų� ���丮 �ƴ϶��
			System.out.println("��ȿ���� ���� ���丮�Դϴ�");
			System.exit(0);
		}

		if (args[1].equals("mkdir")) {
			String path = "";
			path = f + "\\" + args[2];
			File dir = new File(path);
			
			if(args[2].equals(dir.getName())) {
				System.out.println("�̹� �����մϴ�");
			}
			else {
				dir.mkdir();
				System.out.println("����");
			}
			}
				
			
		}
	}
