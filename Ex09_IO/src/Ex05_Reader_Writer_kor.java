import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//문제점
//1. 한글 1자 >> 2byte >> stream(1Byte) 통로 >> 한글 통과 불과
//2. 통로 하나 더 만들어 줄게 >> 2byte 통로 >> reader, writer

public class Ex05_Reader_Writer_kor {

	public static void main(String[] args) {
		//File reader, writer 작업
		FileReader fr = null;
		FileWriter fw = null;
		
		
		try {
			fr=new FileReader("Ex01_Stream.java");
			fw=new FileWriter("copy_Ex02.txt");	//복사본을 만들겠다.
			
			int data=0;
			while((data = fr.read()) != -1) {
				//System.out.println(data + " : " + (char)data);
				//fw.write(data);
				//요구사항 : 공백 , 엔터 , 텝 , 공백 은 제거하고 파일을 쓰세요
				if(data != '\n' && data != '\r' && data !='\t' && data != ' ') {
					fw.write(data);
					}
				}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
