package kr.or.bit;
/*
 * 자동차를 만들떄는 이름과 가격이 책정되어야 합니다
최고속도 및 최대출력 그리고 연비가 정해져야합니다.
자동차 금액은 판매가자 생산시 정해지며 조정될 수 없습니다.
자동차 최대 출력과 연비는 사용자에 따라 조정할 수 있다
자동차는 음악을 출력할 수 있고 usb, 블루투스, 와이파이 형식으로 음악을 출력 할 수 있습니다.
차량의 금액, 연비, 최고속도 및 출력 등을 한번에 확인할 수 있습니다.
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
		System.out.println(Music+"으로 출력합니다.");
	}
	
	
}

 