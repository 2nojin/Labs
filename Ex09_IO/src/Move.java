import java.io.File;
public class Move {
	public static void main(String[] args) {
		
	
	File f = new File(args[0]);
	if (!f.exists() || !f.isDirectory()) { // 존재하지 않거나 디렉토리 아니라면
		System.out.println("유효하지 않은 디렉토리입니다");
		System.exit(0);
	}

	if (args[1].equals("move")) {
		
		
	}
}
}