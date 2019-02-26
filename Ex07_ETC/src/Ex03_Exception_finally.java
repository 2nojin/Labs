import java.io.IOException;

public class Ex03_Exception_finally {
	static void startInstall() {
		System.out.println("INSTALL");
	}
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	static void fileDelete() {
		System.out.println("DELETE FILES");
	}
	
	
	
	public static void main(String[] args) {
		
		try {
			
			copyFiles();
			startInstall();
			
			//�������� ���Ƿ� ���ܸ� ���� �� �� �ִ�.
			//A,B,C �����Է�... D�Է�(������)
			//����� ���� ������(���� ��ü�� �����ڰ� ���� ���� (new))
			throw new IOException("INSTALL ó�� �� ���� �߻�");
			
		} catch(Exception e) {
			System.out.println("���� �޽��� ��� : " +e.getMessage());
			
		} finally {	//���ܰ� �߻��ϴ� �߻� ���ϴ� ������ �����
			
			fileDelete();
		}
		//���ǻ���
		//******�Լ� ����(return) �ִ� �ϴ��� finally���� �����ϰ� �Լ� ����.....******
		
		
		System.out.println("MAIN END");

	}
}
