import java.util.Properties;

/*
 * Map �������̽��� ������ Ŭ����
 * Ư���� ���� : Ÿ���� ����
 * <String, String> Ÿ�� ����! (key���� value���� String)
 * 
 * ������ :
 * App ����Ӽ� ���� (ȯ�溯�� : ���) 
 * 1. ���α׷��� ����
 * 2. ���� ���
 * 3. ���� ����
 * 4. �ٱ��� ó��
 * 
 */
public class Ex16_Properties {
	public static void main(String[] args) {
	
		Properties prop = new Properties();
		prop.setProperty("master_email", "bit@bit.or.kr");
		prop.setProperty("version", "1.0.0.0");
		prop.setProperty("defaultpath", "C:\\Temp\\images");
		
		
		
		//�����
		System.out.println(prop.getProperty("master_eamil"));
		System.out.println(prop.getProperty("version"));
		System.out.println(prop.getProperty("defaultpath"));
		
		
		//System.out.println(prop.getProperty("master_eamil"));
		//�� �ڵ尡 100�� ������ ���
		//prop.setProperty("master_email", "bit@bit.or.kr");
		//���⼭ "value"���� ����
		
	}
}
