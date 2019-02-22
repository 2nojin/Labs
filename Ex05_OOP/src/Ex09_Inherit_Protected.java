import kr.or.bit.Bird;

class Ostrich extends Bird{
	void run(){
		System.out.println("달린다");
	}

	@Override
	protected void movefast() {
		// TODO Auto-generated method stub
		//super.movefast();
		run();
		System.out.println("나는 타조");
	}
	
	
}

class bi extends Bird{

	@Override
	protected void movefast() {
		// TODO Auto-generated method stub
		super.movefast();
	}
	
}

public class Ex09_Inherit_Protected {

	public static void main(String[] args) {

		Ostrich ost = new Ostrich();
		ost.run();
		ost.movefast();
		
		bi bi = new bi();
		bi.fly();
		bi.movefast();
		
		
		
	}

}
