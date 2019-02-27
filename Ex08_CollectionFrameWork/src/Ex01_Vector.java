import java.util.Vector;

/*
 * Collection FrameWork
 * [�ټ��� �����͸� �ٷ�� [ǥ��ȭ]�� [�������̽�]�� �����ϰ� �ִ� Ŭ���� ����]
 * 			Collection
 * 				|
 * List(���)	 	Set(���)		Map(�������̽�)
 * 		|				|				|
 * Vector			HashSet			[HashMap]
 * [ArrayList]		TreeSet
 * 
 * 
 * List Interface [���� ���ÿ�]
 * :����(O), �ߺ�(O)	->	���������� ������ ����	->	Array[0][1][2]...
 * 
 * 1. Vector(������) -> ����ȭ(��Ƽ ������) -> Lock ����(default) -> ������ ��ȣ
 * 2. ArrayList(�Ź���) -> ����ȭ(��Ƽ ������) -> Lock ���� X -> �ʿ信 ���� Lock -> ����
 * ex)����ȭ
 * �Ѱ� ������� ȭ��� �Ѱ�(100���� ���ÿ�) >> Lock �����ϰ�...
 * �Ѱ� ������� ����� ���� (100�κ�)(100���� ���ÿ� ) >> Lock X >> ����
 * 
 *  
 *  Array(�迭) : �����迭(ũ�Ⱑ ������)
 *  ���� 10�� �����ϸ� ����Ұ�(����)
 *  int[] arr = new int[10];
 *  int[] arr = {10,20,30};
 *  
 *  Array(����, ����)
 *  1. �迭�� ũ�� ���� : Car[] casrs = {new Car(), new Car()};		//�� 2��¥��..
 *  2. �迭�� ���� ��� : index(÷��) : cars[0],  cars[0].color
 *  3. �ʱ� ������ ũ�� ���� �Ұ�
 *  
 *  List �������̽� ������ Ŭ����(Vector, ArrayList) : ����
 *  1. �迭�� ũ�⸦ ���� Ȯ�� ����, ��� ���� => �迭�� ���Ҵ� => ���� ���� �ڵ����� ����
 *  2. ������ ����(Array), ����(index), �ߺ��� ���
 *  3. ������ ���� ���� (Array ���)
 *  4. List �������̽��� ������ Ŭ���� (new �� ���� ��ü ���� ���)
 *  5. ���� Ŭ����(ArrayList)�� ������ ������ Ÿ�� : ���� Ÿ�� Object
 *     Object[] arr = new Object[10]
 *     ���� : ��� Ÿ���� �θ� Ÿ��(int, Car, String...) ��� �ڷ� ����
 *     ���� : Object�� DownCasting ���
 *  6. ������ �غ��ϱ� ���� ��� ���ʸ�(Ÿ�� ����) ���� ���� �ذ�
 *   
 * 
 */
public class Ex01_Vector {

	public static void main(String[] args) {

		Vector v = new Vector();
		System.out.println("�ʱ� default �뷮 : " +v.capacity());		//default 10
		v.add("AA"); //[0]	>>	AA
		v.add("BB"); //[1]
		v.add("AA"); //[2]
		v.add(100); //[3]
		System.out.println(v.toString());	//[AA, BB, AA, 100] ������ ��� ���
		System.out.println(v);	//toString() �����Ǿ� �ִ�.
		
		//Array >> length() >> Car[index]
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));	//get... �Լ��� return type : Object
			
		}
		
		for(Object obj : v) {
			System.out.println(obj);
		}
		//for(int i=0; i<v.size(); i++) { v[i] }
		//���� : Object ���� ū Ÿ���� ��� : add(), get()
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
