import kr.or.bit.AirPlane;

public class AirStart {

	public static void main(String[] args) {
		AirPlane ap = new AirPlane();
		ap.airName = "�����װ�";
		ap.airNum = 101;
		ap.airCount++;
		System.out.printf("�װ���:%s \n�װ����ȣ:%d \n�������:%d \n", ap.airName, ap.airNum, ap.airCount);
		
		name(ap);
		num(ap);
		count(ap);
		icount(ap.airCount);
		
		AirPlane.airName="�ƽþƳ�";
		AirPlane.airNum=202;
		AirPlane.airCount++;
		System.out.printf("�װ���:%s \n�װ����ȣ:%d \n�������:%d \n", ap.airName, ap.airNum, ap.airCount);
	}
	static void name(AirPlane a) {
		System.out.println("�װ���:" +AirPlane.airName);
	}
	
	static void num(AirPlane a) {
		System.out.println("�װ����ȣ:" +AirPlane.airNum);
	}
	
	static void count(AirPlane a) {
		System.out.println("�������:" +AirPlane.airCount);
	}
	
	static void icount(int a) {
		System.out.println("�������:" +AirPlane.airCount);
	}
	
	
	
}
