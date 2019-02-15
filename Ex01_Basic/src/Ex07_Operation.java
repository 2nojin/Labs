//연산자, 제어문
import java.lang.*;

public class Ex07_Operation {

	public static void main(String[] args) {
		int sum = 0;
		// 대입연산자 (+= , -= , *= , /=) 습관적으로...
		sum += 1; // sum = sum+1;
		sum -= 1; // sum = sum-1;
		System.out.println("sum : " + sum);

		// 간단한 학점 계산기
		// 학점에 대해서 A+, B-, F
		// 94점이라면
		// 90점 이상이면A 95점 이상이라면A+

		int score = 93;
		String grade = ""; // 문자열 초기화
		System.out.println("당신의 점수는 : " + score);

		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println("당신의 학점은 : " + grade + " 입니다.");

		// 함수 안에서 syso > ctrl + space
		System.out.println();

		// 코드 정렬하기 : ctrl + A 블럭 선택 > ctrl + shift + F(자동 들여쓰기)

		//분기문(switch)
		int data = 100;
		switch (data) {
		case 100:
			System.out.println("100 입니다.");
			break;
		case 200:
			System.out.println("200 입니다.");
			break;
		case 300:
			System.out.println("300 입니다.");
			break;
		default:
			System.out.println("default");
		}
		
		//break 구문은 없어도 된다.
		switch(data) {
		case 100 : System.out.println("100 입니다. ^^");
		case 90 : System.out.println("90 입니다. ^^");
		case 80 : System.out.println("80 입니다. ^^");
		default : System.out.println("default ^^");
		}
		
		int month = 5;
		String res = "";	//빈 문자열로 초기화
		
		
		switch(month) {
		case 1: 
		case 3: 
		case 5: 
		case 7: 
		case 8: 
		case 10:
		case 12: res = "31";
		break;
		
		case 4: 
		case 6: 
		case 9: 
		case 11:res="30";
		break;
		
		case 2:res="29";
		break;
		
		default : res ="월이 아닙니다.";
				
		
		}
		System.out.println(month + "월은 " +res +"일까지 입니다.");
		
		//참조문서
		//https://docs.oracle.com/javase/8/docs/api/index.html
		//package ( 폴더 : 잘 정리된 폴더)
		//package 상자안에는 : interface, class 들어있어요.
		//수학계열
		//java.lang.Math(Math 클래스)
		//언제 만들었고 부모가 누구고 자원은 무엇을 가지고 있는지...)
		//Random : a pesudorandom double greater than or equal to 0.0 and less than 1.0
		//난수 발생 : return double(0.0<=value<1.0);
		//public static double random() => 
		//원칙 : 클래스 new 사용가능
		//그런데 class static 자원을 가지고 있다면 new 없이도 사용가능
		//java.lang.Math m = new java.lang.Math(); 
		//m.random()
		
		//java.lang.Math
		
		//import java.lang.*; 원칙 java 파일에 default 선언
		System.out.println("Math.random() : " +Math.random());
		System.out.println("Math.random() * 10 : " +Math.random()*10);
		
		System.out.println("(int)(Math.random() * 10) : " +(int)(Math.random()*10));
		//0~9정수
		
		System.out.println("(int)(Math.random() * 10 +1) : " +(int)(Math.random()*10+1));
		//1~10정수
		System.out.println((int)(Math.random()*10+1));
		
		
		
		int jumsu = ((int)(Math.random()*10+1)*100);
		System.out.println("jumsu :" +jumsu);
		
		/* Quiz
		 * 만들려고 하는 시스템은 백화점 경품 추첨 시스템입니다.
		 * 경품 추첨시 1000 점수가 나오면
		 * 경품으로 TV, NoteBook, 냉장고, 한우세트, 휴지
		 * 경품 추첨시 900 점수가 나오면
		 * 경품으로 NoteBook, 냉장고, 한우세트, 휴지
		 * 경품 추첨시 800 점수가 나오면
		 * 경품으로 냉장고, 한우세트, 휴지
		 * 경품 추첨시 700 점수가 나오면
		 * 경품으로 한우세트, 휴지
		 * 경품 추첨시 600 점수가 나오면
		 * 경품으로 휴지
		 * 그외는 100~500까지는 칫솔
		 * 
		 * 사용자가 와서 경품시스템 사용하게 되면 랜덤하게 100~1000까지의 점수가 나옴
		 */
		String s = "";
		switch(jumsu) {
		case 1000:  s += "TV, ";
		case 900:	s += "NoteBook, ";
		case 800:	s += "냉장고, ";
		case 700:	s += "한우세트, ";
		case 600:	s += "휴지";
				break;
		default : s += "칫솔";
				
		}
		System.out.println("점수는 " +jumsu +"이고 경품은 " +s +"입니다.");
	}

}
