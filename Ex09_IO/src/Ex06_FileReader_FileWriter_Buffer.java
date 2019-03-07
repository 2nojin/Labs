import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex06_FileReader_FileWriter_Buffer {

	public static void main(String[] args) {
	
		/*
		try {
			FileWriter fw = new FileWriter("today.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("�ζ�");
			bw.newLine();//����		\n\r (����)
			bw.write("1,2,3,4,5");	//flush() �ؾ���
			bw.flush();				//bw.close()
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		FileReader filereader = null;
		BufferedReader bufferedreader = null;
		
		try {
			filereader = new FileReader("Ex01_Stream.java");
			bufferedreader = new BufferedReader(filereader);
			
			
			String line ="";
			//bufferedreader.readLine();	���͸� �������� ���پ� read POINT
			for(int i=0; (line=bufferedreader.readLine()) != null; i++) {
//				System.out.println("line");
				//[ ; ] ���Ե� ���常 read�ϰ� �;��
				
				if(line.indexOf(";") != -1) {
					System.out.println(line);
				}
					
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				bufferedreader.close();
				filereader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
