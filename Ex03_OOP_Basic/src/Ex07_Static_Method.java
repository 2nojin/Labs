//static method

class StaticClass {
	int iv;
	static int cv;

	// 일반함수
	void m() {
		// 일반함수 m()에서 iv값을 처리가능하다 O
		iv = 100;
		// 일반함수 m()에서 cv값을 처리가능하다 O
		// POINT!!
		// Static 자원은 일반자원 보다 먼저(항상) memory에 로드 된다.
		cv = 200;
		// StaticClass.cv = 200;
		System.out.println("iv:" + iv + ", " + "cv:" + cv);
	}

	static void sm() {
		// 일반자원인 iv자원을(member field) 사용불가 X
		// iv=200; sm()함수가 일반 자원보다 memory 먼저 로딩
		// 생성 시점에 대한 문제
		cv = 201;
		// 끼리끼리 놀아라 그러면 error는 없을 것이니
		// static은 static 끼리 놀아라
		System.out.println("static 변수:" + cv);
	}
}

/*
 * 일반함수 : 일반자원, static 자원 모두 사용 static 함수 : static 자원만 사용 가능 (static끼리 놀아라)
 */

public class Ex07_Static_Method {

	public static void main(String[] args) {
		/*
		 * StaticClass s = new StaticClass(); s.m(); s.sm();
		 */

		StaticClass.sm(); // 위 코딩과 동일
	}
}
