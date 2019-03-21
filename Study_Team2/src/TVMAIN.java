import java.util.HashMap;

//클래스 TV와 클래스 TVMAIN을 선언하고
//TVMAIN에서 TV의 채널과 전원을 관리할 수 있도록 만드시오
class TV{
	private int ch;
	
	private boolean power;
	
	private void ch_Up() {
		ch++;
		System.out.println("채널번호 : " +ch);
		
	}
	private void ch_Down() {
		ch--;
		System.out.println("채널번호 : " +ch);
	}
	
	private void power_On() {
		power=true;
		System.out.println("전원On");
	}
	private void power_Off() {
		power=false;
		System.out.println("전원Off");
	}
	
	public int getCh() {
		System.out.println("채널번호 : " +ch);
		return ch;
		
	}
	
	public void setCh(int ch) {
		this.ch = ch;
	}
	
	public boolean isPower() {
		if(power==false) {
			power_Off();
		}else {
			power_On();
		}
		return power;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void like(int ch) {
//		int ch_like;
		HashMap<Integer, String> like = new HashMap<Integer, String>();
		like.put(ch, "선호채널 : "+ch);
		
		System.out.println(like.get(ch));
	}
	
	
}

public class TVMAIN {
	public static void main(String[] args) {
		
		TV tv = new TV();
		//선호하는 채널을 저장하시오 해쉬맵
//		tv.power_On();
//		tv.ch_Up();
//		tv.ch_Down();
//		tv.power_Off();
		
		tv.like(2);
		tv.like(33);
		
//		tv.setCh(1);
//		tv.getCh();
//		
//		tv.setCh(2);
//		tv.getCh();
//		
//		tv.setPower(true);
//		tv.isPower();
//		
//		tv.setPower(false);
//		tv.isPower();
	}
}
