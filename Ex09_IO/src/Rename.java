import java.io.File;

public class Rename {
	public static void main(String[] args) throws Exception {
		// java ExDos C:\Temp mkdir newDir
		// java ExDos C:\Temp rename file.txt file2.txt
		// java ExDos C:\Temp delete new.txt

		if (args.length != 3 && args.length != 4) {
			System.out.println("사용법 : [java파일명] [디렉토리경로] mkdir [생성디렉토리명]");
			System.out.println("사용법 : [java파일명] [디렉토리경로] rename [파일명] [새로운 파일명]");
			System.out.println("사용법 : [java파일명] [디렉토리경로] delete [파일명]");
			System.exit(0);
		}

		File f = new File(args[0]);
		if (!f.exists() || !f.isDirectory()) { // 존재하지 않거나 디렉토리 아니라면
			System.out.println("유효하지 않은 디렉토리입니다");
			System.exit(0);
		}

		if (args[1].equals("rename")) {
			String path = "";
			String path2 = "";
			path = f + "\\" + args[2];
			path2 = f + "\\" + args[3];
			File oldFile = new File(path);
			File newFile = new File(path2);
			if (!oldFile.isFile() && !oldFile.isDirectory()) {
				System.out.println("파일 또는 디렉터리가 아닙니다");
			} else {
				oldFile.renameTo(newFile);
				System.out.println("변경되었습니다.");
			}
		}
	}
}