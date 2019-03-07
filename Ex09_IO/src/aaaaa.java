import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class aaaaa {

	public static void main(String[] args) {
		// java ExDos C:\Temp mkdir newDir
		// java ExDos C:\Temp rename file.txt file2.txt
		// java ExDos C:\Temp delete new.txt
		
		File f = new File(args[0]);
		String name = f.getName();
		System.out.println(name);
		FileReader fr = null;
		FileWriter fw = null;
		System.out.println(args[1].equals("copy"));
		if (args[1].equals("copy")) {
			for (int i = 0; i < f.length(); i++) {
				try {
					fr = new FileReader(f);
					System.out.println(fr);
					fw = new FileWriter(args[2]+"\\"+name );
					int data = 0;
					
					while ((data = fr.read()) != -1) {
						fw.write(data);
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						fw.close();
						fr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}