import java.io.DataOutputStream;
import java.io.FileOutputStream;

//���� ��Ʈ��
//JAVA API ���� 8�⺻ Ÿ��(Ÿ�Ժ��� read, write) Ŭ����
//DataOutputStream, DataInputStream

public class Ex13_DataOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score = {100,60,55,97,30};
		
		//Ÿ���� �����ϸ鼭 write
		try {
			FileOutputStream fos = new FileOutputStream("score.txt");
			//helper
			DataOutputStream dos = new DataOutputStream(fos);
			//DataOutputStream ���ؼ� score.txt write �ϰڴ�.
			for(int i=0; i<score.length; i++) {
				dos.writeInt(score[i]);	//������ write....�ݵ�� read DataInputStream
				//dos.writeUTF(null);	//��, ä�� �� �� �ַ� ���..
			}
			dos.close();
			fos.close();	//�ڿ�����..
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}