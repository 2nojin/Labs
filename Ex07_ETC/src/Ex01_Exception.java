/*
 * 오류발생
 * 1. 에러(error) : 네트워크 장애, 메모리, 하드웨어(개발자 처리 불가능)
 * 2. 예외(Exception) : 로직제어 문제(0으로 나눈다) >> 개발자의 코드 처리 문제.. 해결
 * 2.1 예외가 발생되면 프로그램이 강제 종료..
 * 2.2 목적 : 잘못된 코드를 수정하는 것이 아니고 문제 발생시 비정상적인 종료를 못하게 하는것
 * 
 * 
 * try{
 * 		실행코드...
 * 		문제 발생..
 * 
 * } catch(Exception e){
 * 		문제가 발생했으니 문제에 대한 원인을
 *		1. 화면 출력
 *		2. 로그 기록 남기기
 *		3. 관리자에게 이메일 보내기
 *
 * } finally{
 *		예외가 발생(O), 발생(X)
 *		의무적으로 실행 되어야 하는 구문
 *		ex) DB연결 작업.....>> [연결종료]
 * 
 * }
 * 
 * 개발자는 실행시 발생할 수 있는 예외에 대해서 처리(runtime 예외처리)
 * 
 * 
 */
public class Ex01_Exception {

	public static void main(String[] args) {
		/*
		System.out.println("Main Start");
			System.out.println("Main Logic 처리...");
				System.out.println(0/0);	//비정상 종료
			System.out.println("Main Logic 처리...");
		System.out.println("Main End");
		*/
		System.out.println("Main Start");
			System.out.println("Main Logic 처리...");
		try {
				System.out.println(0/0);
			
		} catch(Exception e) {	// e라고 하는 변수가 주소값을 받는다
			//예외 처리
				//System.out.println("예외 메세지 출력" +e.getMessage());
				e.printStackTrace();
				
				//System.out.println(0/0); 예외가 발생하면 예외에 맞는 객채가 자동 생성됨
				//ArithmeticException arithmetic = new ArithmeticException();
				//arithmetic.set(....담고)
				//java.lang.ArithmeticException
				// by zero
		}
			System.out.println("Main Logic 처리...");
		System.out.println("Main End");
		
		
	}

}
