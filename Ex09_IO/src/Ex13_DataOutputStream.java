import java.io.DataOutputStream;
import java.io.FileOutputStream;

//보조 스트림
//JAVA API 제공 8기본 타입(타입별로 read, write) 클래스
//DataOutputStream, DataInputStream

public class Ex13_DataOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score = {100,60,55,97,30};
		
		//타입을 인정하면서 write
		try {
			FileOutputStream fos = new FileOutputStream("score.txt");
			//helper
			DataOutputStream dos = new DataOutputStream(fos);
			//DataOutputStream 통해서 score.txt write 하겠다.
			for(int i=0; i<score.length; i++) {
				dos.writeInt(score[i]);	//정수값 write....반드시 read DataInputStream
				//dos.writeUTF(null);	//웹, 채팅 할 떄 주로 사용..
			}
			dos.close();
			fos.close();	//자원해제..
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
