public class Coffe_Machine {

	public static void main(String[] args) {
			
	}
}

class 현금투입구{
	private int 동전투입구=0;
	private Long 지폐투입구=0L;
	private Long 현재금액=0L;
	
	public 현금투입구(int 동전투입구) {
		this.동전투입구=동전투입구;
		현재금액+=동전투입구;
	}
	public 현금투입구(Long 지폐투입구) {
		this.지폐투입구=지폐투입구;
		현재금액+=지폐투입구;
	}
	public 현금투입구(int 동전투입구, Long 지폐투입구){
		this.동전투입구=동전투입구;
		this.지폐투입구=지폐투입구;
		
		동전투입구+=동전투입구;
		지폐투입구+=지폐투입구;
		
		현재금액=동전투입구+지폐투입구;
	}
}
class 버튼{
	재료 n = new 재료();
	boolean 아메리카노버튼;
	boolean 헤이즐넛버튼;
	boolean 밀크커피버튼;
	boolean 잔돈반환버튼;
	boolean 아이스_핫_선택버튼;
	
	void 아메리카노() {
		n.아메리카노만들기();
	}
	void 헤이즐넛() {
		n.헤이즐넛만들기();
	}
	void 밀크커피() {
		n.밀크커피만들기();
	}
	void  잔돈반환() {
		n.잔돈반환();
	}
	
}
class 재료{
	int 뜨거운물;
	int 헤이즐넛시럽;
	int 커피가루;
	int 우유;
	int 얼음;
	int 종이컵;
	void 아메리카노만들기() {
		종이컵--;
		얼음--;
		커피가루--;
		뜨거운물--;
		System.out.println("아메리카노");
	}
	void 헤이즐넛만들기() {
		헤이즐넛시럽--;
		종이컵--;
		커피가루--;
		뜨거운물--;
		System.out.println("헤이즐넛");
	}
	void 밀크커피만들기() {
		우유--;
		종이컵--;
		커피가루--;
		뜨거운물--;
		System.out.println("밀크커피");
	}
	void 잔돈반환() {
		System.out.println("잔돈반환");
	}
}