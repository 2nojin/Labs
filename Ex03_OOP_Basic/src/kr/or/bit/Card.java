package kr.or.bit;
/*
 * �츮 ȸ��� ī�带 ���� �Ǹ��ϴ� ȸ���Դϴ�.
 * ���� ��û�� ���� ī�� 53���� �����ϰ� �Ǿ����ϴ�.
 * 
 * �䱸����
 * ī��� ���� ī���ȣ�� ������ �ְ� �׸��� ��絵 ������ �ִ�.
 * ī��� ũ�⸦ ������ �ִ�. ũ���� ���Ǵ� ���̿� �ʺ� ������ �ִ�.
 * ī���� ������ Ȯ���ϴ� ����� ������ �ִ�.
 * 
 */
public class Card {

	public int number;
	public String kind;
	
	//��� ī���� ũ��� ����!
	//public int h=50;
	//public int w=20;
	
	public static int h=50;
	public static int w=20;
	
	
	//���(����)
	public void cardInfo() {
		System.out.printf("��ȣ:%d, ���:%s, ����:%d, �ʺ�:%d\n", number, kind, h, w);
		
		
		
		
		
		
		
	}
	
	
}
