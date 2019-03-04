import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
HashMap 사용한 로그한 시스템

		//회원 로그인 데이터 HashMap 으로 관리
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		
		//시스템에 로그인 하는 시나리오
		//ID(0) , PWD(0)  >> 회원  (환영)
		//ID(0) , PWD(x)  >> 실패  (비번다시 입력)
		
		//ID(x) , PWD(x)  >> 실패  (다시 입력해)
		//ID(x) , PWD(0)
		
		//Scanner 사용해서  ID, PWD 입력받으세요
		//loginmap 통해서 검증 로직 처리
		//ID 또는  PWD 틀리면 다시 입력 요청
		//ID , PWD 다 맞으면 회원님 방문 환영합니다 ^^ (출력 프로그램 종료)
	    //ID 는 사용자가 입력한 ID 값은 소문자로
*/
public class Ex13_HashMap_Quiz {

	public static void main(String[] args) {

		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		//회원 데이터..
		
		
		//구현하려는것 == 로그인 시스템
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("아이디를 입력하세요");
//		String id = sc.nextLine();
//		System.out.println("비밀번호를 입력하세요");
//		String pw = sc.nextLine();
		
		
		
		while(true) {
			System.out.println("아이디를 입력하세요");
			String id = sc.nextLine().trim().toLowerCase();
			System.out.println("비밀번호를 입력하세요");
			String pw = sc.nextLine().trim();
		
			if(!loginmap.containsKey(id)) { //!loginmap.containsKey(id)
				System.out.println("아이디가 맞지않습니다. 다시 입력하세요!");
				
		}else {
			if(loginmap.get(id).equals(pw)) { //loginmap.get(id).equals(pw)
				System.out.println("반갑습니다");
				break;
			}else {
				System.out.println("비밀번호가 맞지않습니다. 다시입력하세요!");
				}
			}

		}

	}
}

