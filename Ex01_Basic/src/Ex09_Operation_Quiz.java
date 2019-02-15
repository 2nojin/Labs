import java.util.*;
public class Ex09_Operation_Quiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력 하세요 :");
		double num1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("기호를 입력 하세요 :");
		String opr = sc.nextLine(); //기호받는거
		
		System.out.println("두번째 숫자를 입력 하세요 :");
		double num2 =Double.parseDouble(sc.nextLine());
		
		double result=0;
		
		
		// 문자열의 비교는 equals 라는 함수를 사용한다!!!!!! 
		if(opr.equals("+")) {
			result = num1+num2;
		}		
		else if(opr.equals("-")) {
			result = num1-num2;
		}
		else if(opr.equals("*")) {
			result = num1*num2;
		}
		else if(opr.equals("/")) {
			result = num1/num2;
		}
		else {
			System.out.println("지원하지 않는 연산자 입니다.");
			//key point (여기서는 main 함수)
			//return 키워드 : [함수단위]의 종결자 > main 함수 탈출 > 종료
			return;
		}
		System.out.println("결과값은 :" +result);
		
		
	}

}
