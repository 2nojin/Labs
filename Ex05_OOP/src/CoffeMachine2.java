//import java.util.Scanner;
//
//public class CoffeMachine2 {
//
//	public static void main(String[] args) {
//
//		
//		InputMoney input = new InputMoney();
//		Button button = new Button();
//		//Material material = new Material();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//		System.out.println("돈을 입력하세요:");
//		int coin = sc.nextInt();
//		
//		coin = input.inpmny(coin);
//		
//		int reCoin=0;
//		reCoin += coin;
//		
//		if(reCoin>=1000) {
//			System.out.println("커피를 선택하세요");
//			
//		}
//		
//		/*
//		if(coin>=1000) {
//		System.out.println("커피를 선택하세요");
//		
//		coin=coin-1000;
//		System.out.println("1.아메리카노(1000원)");
//		
//		if(coin>=2000) {
//			
//			coin=coin-2000;
//			System.out.println("2.헤이즐럿(2000원)");
//		}
//		
//		if(coin>=3000) {
//			coin=coin-3000;
//			System.out.println("3.밀크커피(3000원)");
//		}
//		
//		System.out.println("커피를 고르세요");
//		int select = sc.nextInt();
//		button.btn(select);
//		
//		}*/
//		}
//	}
//
//}
//
//
//class InputMoney{
//	/*
//	private int americano=1000;
//	private int hazelnuts=2000;
//	private int milkcoffee=3000;
//	*/
//	private int totalMoney=0;
//	
//	public int inpmny(int coin) {
//		totalMoney+=coin;
//		System.out.println("총 금액:" +totalMoney);
//		return coin;
//		}
//	
//	
//}
//
//
//class Button{
//	Material material = new Material();
//	
//	public final int americano=1;
//	public final int hazelnuts=2;
//	public final int milkcoffee=3;
//	public int change;
//	//public int ice_hot;
//	
//	public void btn(int selcet) {
//		switch(selcet) {
//		case americano:
//			material.makeAmericano();
//			break;
//		case hazelnuts:
//			material.makehazelnuts();
//			break;
//		case milkcoffee:
//			material.makemilkcoffee();
//			break;
//			default :
//				System.out.println("잘못눌렀습니다.");
//		}
//	}
//}
//
//
//class Material{
//	
//	private int water=100;
//	private int coffee=100;
//	private int haz=100;
//	private int milk=100;
//	//private int ice=100;
//	private int cup=100;
//	
//	
//	void makeAmericano() {
//		water--;
//		coffee--;
//		cup--;
//		System.out.println("아메리카노가 나왔습니다.");
//	}
//	
//	void makehazelnuts() {
//		water--;
//		coffee--;
//		cup--;
//		haz--;
//		System.out.println("헤이즐럿이 나왔습니다.");
//	}
//	
//	void makemilkcoffee() {
//		water--;
//		coffee--;
//		cup--;
//		milk--;
//		System.out.println("밀크커피가 나왔습니다.");
//	}
//	
//	
//}