package kr.or.bit;
import java.io.*;
public class Lotto2 {

	public static void main(String[] args) throws Exception {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("1.txt",true));
		
		PrintWriter pw = new PrintWriter(bw,true);
		
		pw.write("1" + "\n");
		pw.write("2" + "\n");
		pw.write("3" + "\n");
		pw.write("4" + "\n");
		pw.write("실행종료" + "\n");
		pw.flush();
		pw.close();
	}

}
