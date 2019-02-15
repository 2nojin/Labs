import kr.or.bit.Card;

public class Ex05_Static_CardMake {
	
	public static void main(String [] args) {
		//53카드 생성...
		
		Card c = new Card();
		c.number=1;
		c.kind="heart";
		//c.h=500;
		//c.w=200;
		
		//변경사항
		//c.h=501;
		//c.w=501;
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number=10;
		c2.kind="heart";
		
		c.h=502;
		c.w=502;
		c2.cardInfo();
		
		Card c3 = new Card();
		c3.number=20;
		c3.kind="clover";
		c3.cardInfo();
		//...............
		//이때 고객이 카드가 .......
		//카드 크기를 늘려주세요 h=500, w=200
		//53번 각각 카드를 수정해야함
		
	}
}
