package kr.or.bit;

/*
 * �䱸��������
 * tv�� ä�� ������ ������ �ִ�.(���� ��� 1~250ä��)
 * tv�� �귣�� �̸��� ������ �ִ�.(���� ��� �Ｚ, ����)
 * tv�� ä�� ��ȯ ����� ������ �ִ�.(ä���� ������ �� �ִ�. �Ѵܰ辿)
 * ��� 2��(++���, --���)
 * tv�� ���������� ������ �ִ�.
 * tv�� ������ On �Ҽ��� �ְ� Off �Ҽ��� �ִ�.
 */

public class Tv {
	public int ch;	//public int ch=1;
	public String brandname;
	public boolean power;	//true(on), false(off)
	
	public void ch_up() {
		//member field ���°�
		ch++;
	}
	public void ch_down() {
		ch--;
	}
	
	public void power_on() {
		power = true;
	}
	public void power_off() {
		power = false;
	}
	

}
