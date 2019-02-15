//연습용  (Ex04_Variable_Scope.java 파일 안에다)

class Variable {
	int iv;
	/*
	 * 1. member field, instance variable 2. 목적 : 정보를 담으려고 만든다.(상태, 고유, 참조(부품)) 3.
	 * 특징 : 초기값을 (default) 가지고 있다. (정수의 기본값 0, 실수의 기본값 0.0, boolean의 기본값 false) 초기화를
	 * 하지 않는다.(생성되는 객체마다 다른 값을 갖는다.) 4. 생성시점(memory에 로딩되는 시점) : new라는 연산자를 통해서 heap
	 * 객체가 만들어지고 나서
	 */

	static int cv;
	/*
	 * 1. class variable, static variable(공유자원) 2. 목적 : 정보를 담으려고 만든다. >> [생성되는 모든
	 * 객체가 공유하는 자원] >> 객체간 공유자원 3. 특징 : 접근방법 >> 클래스이름.static자원(Variable.cv) >> 객체가
	 * 만들어지지 않아도 접근 가능 (Math.random()) 4. 생성시점 : 프로그램이 실행(java hello) class loader
	 * system에 의해서 클래스 정보를 읽고 (class area, method)에 올리고 나서 올려진 클래스 안에 static 자원을가지고
	 * 있다면 static 자원도 같이 memory에 road합니다. >>static은 객체 생성 이전에 memory에 올라가는 자원
	 */

	void method() {
		int lv = 0;
		// local variable(지역변수)
		// 특징 : 지역변수는 사용하기 전 반드시 초기화 필요
		// 생성시점 : 함수가 호출되면 만들어지고 함수가 끝나면 소멸(stack) 영역

	}

}

public class Ex04_Variable_Scope {

	public static void main(String[] args) {
		/*
		Variable.cv = 100;	//static 변수(공유)
		System.out.println("Variable.cv : " +Variable.cv);
		
		Variable v = new Variable();
		v.iv=200;
		v.cv=500;
		System.out.println("Variable.cv : " +Variable.cv);
		*/
		
		System.out.println("Variable.cv : " +Variable.cv);
		//객체간 공유자원
		Variable v = new Variable();
		System.out.println(v.cv);
		
		Variable v2 = new Variable();
		System.out.println(v.cv);
		
		
		
		
	}

}
