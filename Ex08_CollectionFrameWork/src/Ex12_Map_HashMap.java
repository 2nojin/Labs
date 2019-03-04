import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * Map 인터페이스를 구현하는 클래스
 * Map >> 키(key), 값(value) 쌍배열
 * ex) 지역번호 : (02-서울)....
 * key 값 : 중복허용X
 * value : 중복허용O
 * 
 * Map >> Generic 지원
 * 
 * HashTable(구버전) : 동기화 보장
 * HashMap(신버전) : 동기화 강제하지 않음(필요하면 동기화 가능)
 * 
 */
public class Ex12_Map_HashMap {
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("Tiger", "1004");
		map.put("scott", "1004");
		map.put("superman", "1004");
		//활용 : 회원ID, 회원PWD 담는다.(memory에)
		//메모리(heap) >> 종료되도 데이터보존(파일기반) login.txt저장 but,관리 문제 >> RDBMS
		
		System.out.println("tiger Key : " +map.containsKey("tiger"));	// 대소문자 구분
		System.out.println("scott Key : " +map.containsKey("scott"));
		System.out.println("1004 Value : " +map.containsValue("1004"));
		
		
		//(key, value)
		//POINT : key 값을 가지고 value 값을 찾는다
		System.out.println("Tiger의 Value : " +map.get("Tiger"));
		System.out.println("hong의 Value : " +map.get("hong")); // hong이라는 key값을 map이 가지고 있지 않다.
		
		
		//put
//		map.put("Tiger", "1004");
//		map.put("scott", "1004");
//		map.put("superman", "1004");

		map.put("Tiger", "1008");	//Key가 같은 경우 Value : Overwrite
		
		System.out.println("Tiger의 새 Value값 : " +map.get("Tiger"));
		System.out.println("berfore : " +map.size());
		Object returnvalue = map.remove("superman");	//Key값을 이용해 삭제
		System.out.println(returnvalue);	//필요하다면 써....
		System.out.println("after : " +map.size());
		
		
		Set set = map.keySet();	// 이해
		//Set 인터페이스를 구현하는 객체(HashSet)를 내부적으로 new 하고 거기에 key값을 담고
		//그 주소값을 리턴한다... 다형성을 적용한다 >> keySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
		//Quiz Map에서 value값들을 모아서 출력하세요
		//map.values()
		Collection vlist = map.values();
		System.out.println("value값들만 : " +vlist);
		
		
		
		
	}
}
