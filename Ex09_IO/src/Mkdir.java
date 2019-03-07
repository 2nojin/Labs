import java.io.File;

public class Mkdir {
	public static void main(String[] args) {
		

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

		if (args[1].equals("mkdir")) {
			String path = "";
			path = f + "\\" + args[2];
			File dir = new File(path);
			
			if(args[2].equals(dir.getName())) {
				System.out.println("이미 존재합니다");
			}
			else {
				dir.mkdir();
				System.out.println("생성");
			}
			}
				
			
		}
	}
