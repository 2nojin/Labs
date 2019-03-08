//지금까지의 작업은 싱글프로세스 + 싱글쓰레드(main함수)
//JVM >> call stack [하나]만 제공
//함수 10개 가지고 있어도 현재 실행되는 함수는 1개

//한번에 하나의 함수만 실행
//함수를 순차적으로 실행
public class Ex01_Single_Thread {

	public static void main(String[] args) {

		System.out.println("나 main 일꾼이야");
		worker();
		worker2();
		System.out.println("나 main 종료");
	}
	
	static void worker(){
		System.out.println("나는 1번 일꾼이야");
	}

	static void worker2() {
		System.out.println("나는 2번 일군이야");
	}
}
