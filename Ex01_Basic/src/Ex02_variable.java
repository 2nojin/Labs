class Vtest{	//설계도
	int iv;
	void print() {
		System.out.println("instance variable : " +iv);
		
	}
}

class Apt {
	String color; // String은 클래스이지만.... 당분간 [문자열] 타입으로...

	Apt(String color) {
		// 함수 (특수한 함수) : 함수의 이름이 클래스 이름과 동일
		// 생성자 함수(constructor)
		this.color = color;

	}

	void aptPrint() {
		System.out.println("색상 : " + this.color);
	}
	
}
public class Ex02_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vtest t = new Vtest();
		t.print();
		
		Vtest t2 = new Vtest();
		t2.iv=300;
		t2.print();
		
		Apt sk = new Apt("gold");
		
		sk.aptPrint();
		
		Apt naver = new Apt("red");
		naver.aptPrint();
		
	}
 
}
