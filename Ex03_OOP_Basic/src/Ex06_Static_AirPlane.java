import kr.or.bit.AirPlane;

/*
 * 
 * 사장님의 요구사항
 * 1. 비행기를 생산하면 비행기의 이름과 번호를 부여해야합니다.
 * 2. 비행기가 생산되면 비행기의 이름과 번호가 맞게 부여되었는지 확인 기능(정보출력)
 * 3. 비행기가 출고 될때마다 비행기의 누적대수를 확인 할 수 있습니다.
 * 
 * 비행기를 만든다.(AirPlane air = new AirPlane())
 * 
 *  설계도는 지금까지 배운 코드로 작성..... 최소한 3대.... 만드세요
 */
public class Ex06_Static_AirPlane {

	public static void main(String[] args) {
		
		AirPlane air = new AirPlane();
		air.airName="대한항공";
		air.airNum=101;
		air.airInfo();
		
		AirPlane air2 = new AirPlane();
		air2.airName="아시아나";
		air2.airNum=101;
		air2.airInfo();
		
		AirPlane air3 = new AirPlane();
		air3.airName="진에어";
		air3.airNum=102;
		air3.airInfo();
	}
	

}
