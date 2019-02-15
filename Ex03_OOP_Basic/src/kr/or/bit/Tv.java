package kr.or.bit;

/*
 * 요구사항정의
 * tv는 채널 정보를 가지고 있다.(예를 들면 1~250채널)
 * tv는 브랜드 이름을 가지고 있다.(예를 들면 삼성, 엘지)
 * tv는 채널 전환 기능을 가지고 있다.(채널을 변경할 수 있다. 한단계씩)
 * 기능 2개(++기능, --기능)
 * tv는 전원정보를 가지고 있다.
 * tv의 전원은 On 할수도 있고 Off 할수도 있다.
 */

public class Tv {
	public int ch;	//public int ch=1;
	public String brandname;
	public boolean power;	//true(on), false(off)
	
	public void ch_up() {
		//member field 상태값
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
