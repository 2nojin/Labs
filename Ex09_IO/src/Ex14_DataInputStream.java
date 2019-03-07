import java.io.DataInputStream;
import java.io.FileInputStream;

//DataOutputStream write 한 데이터는 반드시 DataInputStream read 해야한다.

public class Ex14_DataInputStream {

	public static void main(String[] args) {

		int sum=0;
		int score=0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("score.txt");
			dis = new DataInputStream(fis);
			while(true) {
				score = dis.readInt();
				System.out.println("score int 타입 : " +score);
				sum+=score;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외발생 : " +e.getMessage());
			System.out.println("sum결과 : " +sum);
		}finally {
			try {
				dis.close();
				fis.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
