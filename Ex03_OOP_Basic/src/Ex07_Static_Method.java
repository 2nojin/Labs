//static method

class StaticClass {
	int iv;
	static int cv;

	// �Ϲ��Լ�
	void m() {
		// �Ϲ��Լ� m()���� iv���� ó�������ϴ� O
		iv = 100;
		// �Ϲ��Լ� m()���� cv���� ó�������ϴ� O
		// POINT!!
		// Static �ڿ��� �Ϲ��ڿ� ���� ����(�׻�) memory�� �ε� �ȴ�.
		cv = 200;
		// StaticClass.cv = 200;
		System.out.println("iv:" + iv + ", " + "cv:" + cv);
	}

	static void sm() {
		// �Ϲ��ڿ��� iv�ڿ���(member field) ���Ұ� X
		// iv=200; sm()�Լ��� �Ϲ� �ڿ����� memory ���� �ε�
		// ���� ������ ���� ����
		cv = 201;
		// �������� ��ƶ� �׷��� error�� ���� ���̴�
		// static�� static ���� ��ƶ�
		System.out.println("static ����:" + cv);
	}
}

/*
 * �Ϲ��Լ� : �Ϲ��ڿ�, static �ڿ� ��� ��� static �Լ� : static �ڿ��� ��� ���� (static���� ��ƶ�)
 */

public class Ex07_Static_Method {

	public static void main(String[] args) {
		/*
		 * StaticClass s = new StaticClass(); s.m(); s.sm();
		 */

		StaticClass.sm(); // �� �ڵ��� ����
	}
}
