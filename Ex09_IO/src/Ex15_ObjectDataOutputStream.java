import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.or.bit.UserInfo;

public class Ex15_ObjectDataOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//UserInfo ��ü�� >> UserData.txt >> write(����ȭ)
		String filename = "UserData.txt";
		
		try {
			FileOutputStream fos = new FileOutputStream(filename,true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			//append�ϴ°� (true)
			
			//��ü ����ȭ
			//��ü ������(���� ������)
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			UserInfo u1 = new UserInfo("supermane","super", 500);
			UserInfo u2 = new UserInfo("scoot","tiger", 50);
			
			//����ȭ�۾�...	(��ü ������ write)
			out.writeObject(u1); //u1 ��ü�� �������� userData.txt write
			out.writeObject(u2); //u2 ��ü�� �������� userData.txt write
			
			out.close();
			bos.close();
			fos.close();
			System.out.println("���ϻ��� >> buffer > ����ȭ ��ü > write");
			
			
			
		} catch (Exception e) {
			
			
			
			
			
		}

	}

}
