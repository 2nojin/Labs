import kr.or.bit.AirPlane;

/*
 * 
 * ������� �䱸����
 * 1. ����⸦ �����ϸ� ������� �̸��� ��ȣ�� �ο��ؾ��մϴ�.
 * 2. ����Ⱑ ����Ǹ� ������� �̸��� ��ȣ�� �°� �ο��Ǿ����� Ȯ�� ���(�������)
 * 3. ����Ⱑ ��� �ɶ����� ������� ��������� Ȯ�� �� �� �ֽ��ϴ�.
 * 
 * ����⸦ �����.(AirPlane air = new AirPlane())
 * 
 *  ���赵�� ���ݱ��� ��� �ڵ�� �ۼ�..... �ּ��� 3��.... ���弼��
 */
public class Ex06_Static_AirPlane {

	public static void main(String[] args) {
		
		AirPlane air = new AirPlane();
		air.airName="�����װ�";
		air.airNum=101;
		air.airInfo();
		
		AirPlane air2 = new AirPlane();
		air2.airName="�ƽþƳ�";
		air2.airNum=101;
		air2.airInfo();
		
		AirPlane air3 = new AirPlane();
		air3.airName="������";
		air3.airNum=102;
		air3.airInfo();
	}
	

}
