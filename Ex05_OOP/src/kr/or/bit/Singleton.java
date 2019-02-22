package kr.or.bit;
//디자인 패턴 중에서 생성 패턴에 속함	(new......)
//싱글톤 :: 객체를 하나만 만들어서 공유

//하나의 객체를 생성해서 (공유)
//이 패턴을 사용하면 하나의 객체만 사용 보장

//static (객체간 공유 자원)..

//JDBC (DB연동 하는 작업시 사례)
public class Singleton {
	private static Singleton p;
	//Singleton 사용하면 method area 영역에 올라가 있다.
	//private 접근 불가
	private Singleton() {	}	//생성자가 private 이면 객체 생성 불가
	
	
	public static Singleton getInstance() {
		if(p==null) {
			p = new Singleton();	// 생성자 호출(private 이지만 클래스 내부에서는 실행)
		}
		
		return p;
	}
	
}
