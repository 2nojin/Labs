import java.util.HashMap;

//Ŭ���� TV�� Ŭ���� TVMAIN�� �����ϰ�
//TVMAIN���� TV�� ä�ΰ� ������ ������ �� �ֵ��� ����ÿ�
class TV{
	private int ch;
	
	private boolean power;
	
	private void ch_Up() {
		ch++;
		System.out.println("ä�ι�ȣ : " +ch);
		
	}
	private void ch_Down() {
		ch--;
		System.out.println("ä�ι�ȣ : " +ch);
	}
	
	private void power_On() {
		power=true;
		System.out.println("����On");
	}
	private void power_Off() {
		power=false;
		System.out.println("����Off");
	}
	
	public int getCh() {
		System.out.println("ä�ι�ȣ : " +ch);
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
		like.put(ch, "��ȣä�� : "+ch);
		
		System.out.println(like.get(ch));
	}
	
	
}

public class TVMAIN {
	public static void main(String[] args) {
		
		TV tv = new TV();
		//��ȣ�ϴ� ä���� �����Ͻÿ� �ؽ���
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
