package kr.or.bit;
/*
 * 우리 회사는 카드를 만들어서 판매하는 회사입니다.
 * 고객의 요청에 따라 카드 53장을 제작하게 되었습니다.
 * 
 * 요구사항
 * 카드는 각각 카드번호를 가지고 있고 그리고 모양도 가지고 있다.
 * 카드는 크기를 가지고 있다. 크기의 정의는 높이와 너비를 가지고 있다.
 * 카드의 정보를 확인하는 기능을 가지고 있다.
 * 
 */
public class Card {

	public int number;
	public String kind;
	
	//모든 카드의 크기는 고정!
	//public int h=50;
	//public int w=20;
	
	public static int h=50;
	public static int w=20;
	
	
	//기능(정보)
	public void cardInfo() {
		System.out.printf("번호:%d, 모양:%s, 높이:%d, 너비:%d\n", number, kind, h, w);
		
		
		
		
		
		
		
	}
	
	
}
