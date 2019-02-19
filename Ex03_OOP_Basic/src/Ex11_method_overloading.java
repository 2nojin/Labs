/*
 * ��ü ���� ��� Ư¡
 * ���, ĸ��ȭ, ������....
 * 
 * ĸ��ȭ(����ȭ) -> private
 * 
 * [method overloading]
 * [�ϳ��� �̸�]���� [�������� ���]�� �ϴ� �Լ�
 * ��� : System.out.println()	��ǥ���� ��
 * Ư¡ : �����ε��� ������� ������ ���� �ʴ´�. �����ڰ� ���ϰ� ����Ϸ��� ���
 * 		 ����� � ���� ��� : �Լ��� Ȱ���� ���� ���
 * 
 * ���� : �Լ��� �̸��� ���� parameter�� ������ Ÿ���� �޸��ϴ� ���
 * 1. �Լ��� �̸��� ���ƾ� �Ѵ�.
 * 2. [parameter]������ �Ǵ�[Type]�� �޶�� �Ѵ�.
 * 3. return Type�� overloading�� �Ǵ� ������ �ƴϴ�.
 * 4. parameter ������ �ٸ��� �����Ѵ�.
 * 
 */

class Human{
	String name;
	int age;
}

class OverTest{
	
	void add(Human h) { //class == Type
		h.name="ȫ�浿";
		h.age=100;
		System.out.println(h);
	}
	
	
	int add(int i) {
		return 100+i;
	}
	
	String add(String s) {
		return "hello" +s;
	}
	
	//void add(int k) {	} (parameter type �浹);
	int add(int i, int j) {
		return i+j;
	}
	
	void add(int i, String s) {
		System.out.println("�����ε�");
	}
	
	void add(String s, int i) { //parameter ������ �޶� �����ε� OK
		System.out.println("���� ���� : overloading");
		
	}
	
	//�迭(Array) �������
	//�����߱�...
	//int[] source = {1,2,3,4,5};
	int[] add(int[] param) { //parameter �� int �迭�� �ּҰ��� �ްڴ�.
		int[] target = new int[param.length];
		for(int i=0; i<param.length; i++) {
			target[i] = param[i]+1;
		}
		
		return target;	//int Ÿ���� �迭�� �ּҰ��� return
		
	}
	
	int[] add(int[] so, int[] so2) {
		//������� �ڵ� �ۼ�(error�� ������ �˴ϴ�.)
		
		int num[] = new int[so.length];
		
		
		for(int i=0; i<so.length; i++) {
			num[i]=so[i]+so2[i];
		}
		/*for(int i=0; i<so2.length; i++) {
			num2[i]=so2[i];
		}*/
		
		
		
		
		
		return null;
	}
	
	Human[] add(Human[] human) {
		//......
		Human[] h = new Human[human.length];
		//......
		return h;
	}
	
}

public class Ex11_method_overloading {

	public static void main(String[] args) {
		/*
		System.out.println(100);
		System.out.println("HELLO");
		
		OverTest ot = new OverTest();
		System.out.println(ot.add(100));
		//ot.add(3.14f);	//add(float f) ����(X)
		
		ot.add(100,"H");
		
		Human human = new Human();
		ot.add(human);
		System.out.println(human.name);
		System.out.println(human.age);
		
		
		ot.add(new Human());
		
		ot.add(100,"HELLO");
		*/
		
		
		OverTest ot = new OverTest();
		//int Ÿ���� �迭�� �ּҸ� �־���Ѵ�.
		int[] source = {10,20,30,40,50};
		System.out.println(source);
		int[] target = ot.add(source); //I@15db9742 �ּҰ�
		for(int i=0; i<target.length; i++) {
			System.out.println(target[i]);
		}
		
		
		//int[] add(int[] so, int[] so2) ����� error�� �������
		int[] sso = {1,2,3,4,5};
		int[] sso2 = {9,8,7,6,5};
		int[] num=ot.add(sso, sso2);
		for(int i=0; i<sso.length; i++) {
			System.out.print(sso[i]+sso2[i]+"\t");
		}
		
		
		
	}

}
