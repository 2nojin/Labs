import java.util.Arrays;

import kr.or.bit.Emp;

class Test extends Object{
	void print() {
		System.out.println("�θ��Լ�_TEST");
	}
}


class Test2 extends Test{

	@Override
	void print() {
		System.out.println("�ڽ��Լ�_TEST2_������ ����");
	}
	
	void print(String s) {	//�����ε�
		System.out.println("���� �����ε� �Լ���!");
	}
	
}


public class Ex05_Inherit_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 test = new Test2();
		test.print();	//������
		test.print("�����ε�");
		
		System.out.println(test);	//default toString()
		System.out.println(test.toString());
		
		
		//Emp Ŭ�������� Object ������ toString() ������
		Emp e = new Emp(9999,"�̳���");
		String str = e.toString();
		System.out.println(str);
		
		//Arrays �̳༮�� Object�� ������ toString() ������
		int[]arr = {11,22,33,44,55};
		String result =	Arrays.toString(arr);
		System.out.println(result);
	}

}
