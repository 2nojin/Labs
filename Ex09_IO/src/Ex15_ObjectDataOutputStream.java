import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.or.bit.UserInfo;

public class Ex15_ObjectDataOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//UserInfo 객체를 >> UserData.txt >> write(직렬화)
		String filename = "UserData.txt";
		
		try {
			FileOutputStream fos = new FileOutputStream(filename,true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			//append하는것 (true)
			
			//객체 직렬화
			//객체 단위로(줄을 세워서)
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			UserInfo u1 = new UserInfo("supermane","super", 500);
			UserInfo u2 = new UserInfo("scoot","tiger", 50);
			
			//직렬화작업...	(객체 단위로 write)
			out.writeObject(u1); //u1 객체를 조각내서 userData.txt write
			out.writeObject(u2); //u2 객체를 조각내서 userData.txt write
			
			out.close();
			bos.close();
			fos.close();
			System.out.println("파일생성 >> buffer > 직렬화 객체 > write");
			
			
			
		} catch (Exception e) {
			
			
			
			
			
		}

	}

}
