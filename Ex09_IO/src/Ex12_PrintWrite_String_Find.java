import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//특정 폴더에서 검색할 단어가 주어지면
//그 단어가 포함된 파일 목록 출력하기
public class Ex12_PrintWrite_String_Find {

	String baseDir = "C:\\Temp";	//검색할 디렉토리
	String word = "hello";	//검색할 단어
	String save = "reslut.txt";	//검색결과에 대한 출력 
	
	public void Find() throws IOException{
		File dir = new File(baseDir);	//정보얻기 
		
		if(!dir.isDirectory()) {
			System.out.println("baseDir : " +"is not Directory or Exist");
			System.exit(0);
		}
		
		PrintWriter writer = new PrintWriter(new FileWriter(save));
		BufferedReader br = null;
		
		
		File[] files = dir.listFiles();	//Temp 폴더 하위에 있는 모든 자원
		for(int i=0; i<files.length; i++) {
			if(!files[i].isFile()) {	//파일이 아니라면
				continue;	//이후 구문 skip
			}
			br= new BufferedReader(new FileReader(files[i]));
			
			//a.txt, b.txt 파일 read 준비(buffer 통해서 line() 단위)
			String line="";
			while((line=br.readLine()) != null) {
				//POINT
				if(line.indexOf(word) != -1) {
					//기록 (result.txt) 파일명을 
					writer.write(word +" = " +files[i].getAbsolutePath() + "\n");
				}
			}
			
			writer.flush();
			
		}
		br.close();
		writer.close();
	}
	
	public static void main(String[] args) {
		
		try {
			Ex12_PrintWrite_String_Find StringFind = new Ex12_PrintWrite_String_Find();
			StringFind.Find();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	
	}
}
