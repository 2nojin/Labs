import java.io.File;
public class Move {
	public static void main(String[] args) {
		
	
	File f = new File(args[0]);
	if (!f.exists() || !f.isDirectory()) { // �������� �ʰų� ���丮 �ƴ϶��
		System.out.println("��ȿ���� ���� ���丮�Դϴ�");
		System.exit(0);
	}

	if (args[1].equals("move")) {
		
		
	}
}
}