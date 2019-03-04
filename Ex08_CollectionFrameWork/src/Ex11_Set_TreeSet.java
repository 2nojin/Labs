import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

//TreeSet 추가적으로,,, 알고 있으면 좋을 것 같아요


public class Ex11_Set_TreeSet {
	public static void main(String[] args) {
		//Set은 순서X, 중복X,
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		hs.add("A");
		System.out.println(hs);
		
		
		//HashSet 확장 > LinkedHashSet(순서유지) : > Linked(주소값) > node개념
		
		Set<String> hs2 = new LinkedHashSet<String>();
		//add한 순서지 데이터 [정렬]되는 것은 아니다
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("D");
		hs2.add("P");
		hs2.add("A");
		System.out.println(hs2);
		
		
		//순서X, 중복데이터X, 정렬(sort) :오름차순 기본적 제공
		//TreeSet : 검색과 정렬 두 가지 요소를 필요로 하는 구조
		//이진트리 : 정렬되고 많은 양의 데이터 저장 효율적
		//Lotto의 조건 : 1~45 난수 6개 생성 > 중복X > 정렬O
		
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(int i=0; lotto.size()<6; i++) {
			lotto.add((int)(Math.random()*45)+1);
			
		}
		
		System.out.println(lotto);
		
		//iterator() 출력
		int sum=0;
		Iterator<Integer> lotto2 = lotto.iterator();
		while(lotto2.hasNext()) {
//			System.out.print(lotto2.next() +" ");
			sum+=lotto2.next();
		}
		
		System.out.println("sum : "+sum);
		
		
		
		
		
	}
}
