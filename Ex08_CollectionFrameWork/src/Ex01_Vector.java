import java.util.Vector;

/*
 * Collection FrameWork
 * [다수의 데이터를 다루는 [표준화]된 [인터페이스]를 구현하고 있는 클래스 집합]
 * 			Collection
 * 				|
 * List(상속)	 	Set(상속)		Map(인터페이스)
 * 		|				|				|
 * Vector			HashSet			[HashMap]
 * [ArrayList]		TreeSet
 * 
 * 
 * List Interface [줄을 서시오]
 * :순서(O), 중복(O)	->	내부적으로 데이터 관리	->	Array[0][1][2]...
 * 
 * 1. Vector(구버전) -> 동기화(멀티 쓰래드) -> Lock 보장(default) -> 데이터 보호
 * 2. ArrayList(신버전) -> 동기화(멀티 쓰래드) -> Lock 보장 X -> 필요에 따라 Lock -> 성능
 * ex)동기화
 * 한강 고수부지 화장실 한개(100명이 동시에) >> Lock 안전하게...
 * 한강 고수부지 비빔밥 축제 (100인분)(100명이 동시에 ) >> Lock X >> 성능
 * 
 *  
 *  Array(배열) : 정적배열(크기가 고정됨)
 *  방을 10개 생성하면 변경불가(고정)
 *  int[] arr = new int[10];
 *  int[] arr = {10,20,30};
 *  
 *  Array(고정, 정적)
 *  1. 배열의 크기 고정 : Car[] casrs = {new Car(), new Car()};		//방 2개짜리..
 *  2. 배열의 접근 방법 : index(첨자) : cars[0],  cars[0].color
 *  3. 초기 설정한 크기 변경 불가
 *  
 *  List 인터페이스 구현한 클래스(Vector, ArrayList) : 동적
 *  1. 배열의 크기를 동적 확장 가능, 축소 가능 => 배열의 재할당 => 내가 직접 코딩하지 않음
 *  2. 순서를 유지(Array), 순서(index), 중복값 허용
 *  3. 데이터 저장 공간 (Array 사용)
 *  4. List 인터페이스를 구현한 클래스 (new 를 통해 객체 생성 사용)
 *  5. 구현 클래스(ArrayList)가 가지는 데이터 타입 : 방의 타입 Object
 *     Object[] arr = new Object[10]
 *     장점 : 모든 타입의 부모 타입(int, Car, String...) 모든 자료 삽입
 *     단점 : Object를 DownCasting 사용
 *  6. 단점을 극복하기 위한 방법 제너릭(타입 강제) 통해 문제 해결
 *   
 * 
 */
public class Ex01_Vector {

	public static void main(String[] args) {

		Vector v = new Vector();
		System.out.println("초기 default 용량 : " +v.capacity());		//default 10
		v.add("AA"); //[0]	>>	AA
		v.add("BB"); //[1]
		v.add("AA"); //[2]
		v.add(100); //[3]
		System.out.println(v.toString());	//[AA, BB, AA, 100] 재정의 결과 출력
		System.out.println(v);	//toString() 생략되어 있다.
		
		//Array >> length() >> Car[index]
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));	//get... 함수의 return type : Object
			
		}
		
		for(Object obj : v) {
			System.out.println(obj);
		}
		//for(int i=0; i<v.size(); i++) { v[i] }
		//문제 : Object 가장 큰 타입을 사용 : add(), get()
		Vector<String> v2 = new Vector<String>();
		v2.add("HELLO");
		v2.add("WORLD");
		
		for(String str : v2) {
			System.out.println(str);
		}
		
		System.out.println(v2.toString());
		System.out.println("v2.get(0) : " +v2.get(0));
		System.out.println("v2.get(1) : " +v2.get(1));
		System.out.println("Size : " +v2.size());
		System.out.println("Capacity :" +v2.capacity());
		
		Vector v3 = new Vector();
		System.out.println(v3.capacity());
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println(v3.capacity());
		v3.add("A");
		
		System.out.println("size : " +v3.size());
		System.out.println("capacity : " +v3.capacity());
		}

}
