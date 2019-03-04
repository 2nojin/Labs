import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


//Set 인터페이스를 구현하고 있는 클래스
//Set 순서(X), 중복데이터(X), 데이터 집합을 다룰때.........................
//구현하는 클래스 : HashSet, TreeSet
//순서 보장하지 않아요(넣은 순서를 보장하지 않아요)

public class Ex10_Set_Interface {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(100);
		hs.add(55);
		
		System.out.println(hs.toString());
		
		//1. 중복 데이터 처리(POINT)
		
		boolean bo = hs.add(1);	//기존에 같은 데이터가 있으면 추가(X)
		System.out.println(bo);
		
		hs.add(2);
		System.out.println(hs.toString());
		
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("z");
		System.out.println(hs2.toString());
		//순서를 유지하지 않는다(순차적으로)
		
		
		//1. 중복데이터 허락하지 않아요(일상 생활에서 중복데이터 안되요)
		String[] obj = {"A","B","A","C","D","B","A"};
		
		HashSet<String> hs3 = new HashSet<String>();
		for(int i=0; i<obj.length; i++) {
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString());
		
		//4조. 로또번호...
		
		//Quiz
		//HashSet 사용해서 1~45까지 난수 6개를 넣으세요(add)
		//(int)(Math.random()*45)+1
		
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		//lotto.add((int)(Math.random()*45)+1);
		for (int i=0; lotto.size()<6; i++) {	//size()가 포인트
			int num = (int)(Math.random()*45)+1;
			lotto.add(num);
			lotto.add((int)(Math.random()*45)+1);
		}
		
		System.out.println(lotto);
		
		
		//while 횟수
		int index = 0;
		while(lotto2.size()<6) {	//set2.size() < 6
			System.out.println("index : " + ++index);
			lotto2.add((int)(Math.random()*45)+1);
		}
		System.out.println(lotto2);
		

		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFFF");
		System.out.println(set3);
		
		Iterator<String> s = set3.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		//add된 순서를 보장하지 않아요(배열이 아니에요)
		
		
		
//		Collections.sort(List<T> list);	List 인터페이스를 구현하는 모든 객체 parameter로
		
		//Set 인터페이스를 구현하는 HashSet 가지고 놀다가 
		
		List list = new ArrayList(set3);
		System.out.println("before : 무작위 >>" + list.toString());
		Collections.sort(list);
		System.out.println("after : 정렬 >>" + list.toString());
		
		
	}
}
