import java.util.Scanner;

public class CoffeMachine2 {

	public static void main(String[] args) {

		
		InputMoney input = new InputMoney();
		Button button = new Button();
		//Material material = new Material();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("���� �Է��ϼ���:");
		int coin = sc.nextInt();
		
		int returnCoin = input.inpmny(coin);
		if(returnCoin>=1000) {
		System.out.println("Ŀ�Ǹ� �����ϼ���");
		System.out.println("1.�Ƹ޸�ī��(1000��)");
		if(returnCoin>=2000) {
			System.out.println("2.������(2000��)");
		}
		if(returnCoin>=3000) {
			System.out.println("3.��ũĿ��(3000��)");
		}
		
		System.out.println("Ŀ�Ǹ� ������");
		int select = sc.nextInt();
		button.btn(select);
		}
		
		}
	}

}


class InputMoney{
	
	private int americano=1000;
	private int hazelnuts=2000;
	private int milkcoffee=3000;
	
	private int totalMoney=0;
	
	public int inpmny(int coin) {
		totalMoney+=coin;
		System.out.println("�� �ݾ�:" +totalMoney);
		return coin;
		}
	
	
}


class Button{
	Material material = new Material();
	
	public final int americano=1;
	public final int hazelnuts=2;
	public final int milkcoffee=3;
	public int change;
	public int ice_hot;
	
	public void btn(int selcet) {
		switch(selcet) {
		case americano:
			material.makeAmericano();
			break;
		case hazelnuts:
			material.makehazelnuts();
			break;
		case milkcoffee:
			material.makemilkcoffee();
			break;
			default :
				System.out.println("�߸��������ϴ�.");
		}
	}
}


class Material{
	
	private int water=100;
	private int coffee=100;
	private int haz=100;
	private int milk=100;
	private int ice=100;
	private int cup=100;
	
	
	void makeAmericano() {
		water--;
		coffee--;
		cup--;
		System.out.println("�Ƹ޸�ī�밡 ���Խ��ϴ�.");
	}
	
	void makehazelnuts() {
		water--;
		coffee--;
		cup--;
		haz--;
		System.out.println("�������� ���Խ��ϴ�.");
	}
	
	void makemilkcoffee() {
		water--;
		coffee--;
		cup--;
		milk--;
		System.out.println("��ũĿ�ǰ� ���Խ��ϴ�.");
	}
	
	
}