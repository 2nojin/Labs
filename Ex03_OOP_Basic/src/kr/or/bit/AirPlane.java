package kr.or.bit;
/*
 * 1. ����⸦ �����ϸ� ����⸦ �̸��� ��ȣ�� �ο��ؾ� �մϴ�.
 * 2. ����Ⱑ ����Ǹ� ������� �̸��� ��ȣ�� �°� �ο��Ǿ����� Ȯ�� ���(���� ���)
 * 3.  ����Ⱑ ��� �ɶ����� ������� ��������� Ȯ�� �� �� �ֽ��ϴ�.
 */
public class AirPlane {
	
	
	public  String airName;
	public int airNum;
	public static int airCount;
	
	public void airInfo() {
		airCount ++;
		System.out.printf("����� �̸�:%s, ����� ��ȣ:%d, �������:%d\n",airName,airNum,airCount);
		
	}

}
