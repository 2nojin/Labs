package kr.or.bit;
/*
 * �ڵ����� ���鋚�� �̸��� ������ å���Ǿ�� �մϴ�
�ְ�ӵ� �� �ִ���� �׸��� ���� ���������մϴ�.
�ڵ��� �ݾ��� �ǸŰ��� ����� �������� ������ �� �����ϴ�.
�ڵ��� �ִ� ��°� ����� ����ڿ� ���� ������ �� �ִ�
�ڵ����� ������ ����� �� �ְ� usb, �������, �������� �������� ������ ��� �� �� �ֽ��ϴ�.
������ �ݾ�, ����, �ְ�ӵ� �� ��� ���� �ѹ��� Ȯ���� �� �ֽ��ϴ�.
 */
public class Car1 {
	String name;
	private String price;
	int speed, output, oil;
	String Music;
	
	public int getOutput() {
		return output;
	}


	public void setOutput(int output) {
		this.output = output;
	}


	public int getOil() {
		return oil;
	}


	public void setOil(int oil) {
		this.oil = oil;
	}


	public void Cardisplay(){
		System.out.println(speed);
		System.out.println(output);
		System.out.println(oil);
		System.out.println(price);
	}
	public void Car1(String name, String price, int speed, int output, int oil){
		this.name=name;
		this.price=price;
		this.speed=speed;
		this.output=output;
		this.oil=oil;
		
	}
	
	public void Music(String Music) {
		System.out.println(Music+"���� ����մϴ�.");
	}
	
	
}

 