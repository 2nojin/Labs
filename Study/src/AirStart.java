import kr.or.bit.AirPlane;

public class AirStart {

	public static void main(String[] args) {
		AirPlane ap = new AirPlane();
		ap.airName = "대한항공";
		ap.airNum = 101;
		ap.airCount++;
		System.out.printf("항공사:%s \n항공기번호:%d \n누적대수:%d \n", ap.airName, ap.airNum, ap.airCount);
		
		name(ap);
		num(ap);
		count(ap);
		icount(ap.airCount);
		
		AirPlane.airName="아시아나";
		AirPlane.airNum=202;
		AirPlane.airCount++;
		System.out.printf("항공사:%s \n항공기번호:%d \n누적대수:%d \n", ap.airName, ap.airNum, ap.airCount);
	}
	static void name(AirPlane a) {
		System.out.println("항공사:" +AirPlane.airName);
	}
	
	static void num(AirPlane a) {
		System.out.println("항공기번호:" +AirPlane.airNum);
	}
	
	static void count(AirPlane a) {
		System.out.println("누적대수:" +AirPlane.airCount);
	}
	
	static void icount(int a) {
		System.out.println("누적대수:" +AirPlane.airCount);
	}
	
	
	
}
