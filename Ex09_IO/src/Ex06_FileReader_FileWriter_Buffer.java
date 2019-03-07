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
			bw.write("로또");
			bw.newLine();//개행		\n\r (엔터)
			bw.write("1,2,3,4,5");	//flush() 해야함
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
			//bufferedreader.readLine();	엔터를 기준으로 한줄씩 read POINT
			for(int i=0; (line=bufferedreader.readLine()) != null; i++) {
//				System.out.println("line");
				//[ ; ] 포함된 문장만 read하고 싶어요
				
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
