import kr.or.bit.Phoneclass;

public class Start {

	public static void main(String[] args) {
		

		Phoneclass ph = new Phoneclass();
		ph.vol_up();
		ph.vol_up();
		ph.vol_douw();
		System.out.println(ph.vol);
		
		ph.phoneNum(1,2,3);
	
		
		ph.lock(1049);
		
		//ph.money(101);
		System.out.println(ph.money(1011));
		ph.camera();
		
	}
	

}
