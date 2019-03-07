import java.io.File;

public class Rename {
	public static void main(String[] args) throws Exception {
		// java ExDos C:\Temp mkdir newDir
		// java ExDos C:\Temp rename file.txt file2.txt
		// java ExDos C:\Temp delete new.txt

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

		if (args[1].equals("rename")) {
			String path = "";
			String path2 = "";
			path = f + "\\" + args[2];
			path2 = f + "\\" + args[3];
			File oldFile = new File(path);
			File newFile = new File(path2);
			if (!oldFile.isFile() && !oldFile.isDirectory()) {
				System.out.println("���� �Ǵ� ���͸��� �ƴմϴ�");
			} else {
				oldFile.renameTo(newFile);
				System.out.println("����Ǿ����ϴ�.");
			}
		}
	}
}