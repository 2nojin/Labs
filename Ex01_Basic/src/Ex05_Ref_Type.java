//Ŭ������ ���赵�̴�, Ŭ������ Ÿ���̴�.
//Ŭ���� == ���赵 == Ÿ��
//Ŭ������ �ݵ�� �޸𸮿� �÷��� ��밡�� (���赵�� ������� ���� ����Ʈ�� �����)
//new ���ؼ� ���赵�� ������� ��üȭ�� �깰(��ü)�� �����.

//���赵 (�Ӽ�(��������) + ����(���))
class Apt2{
	
	int door=10;	//��ü����(instance variable) : �ʱ�ȭ
	int window;
}

public class Ex05_Ref_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100;	//i�� 100�̶�� ���� ���´�.
		//Apt2 Ÿ��(����� ���� Ÿ�� : �������� Ÿ���� ��Ƴ��� ū Ÿ��)
		Apt2 lg = new Apt2();	//lg ������ Apt2 ��ü�� �ּҰ��� ���´�.)
		//lg : �ּҰ��� ������ �ִ� ���� : ��������, ��ü����
		
		System.out.println("lg������ ���� : �ּ� : " +lg);
		
		Apt2 ssapt=lg;	//lg ������ �ּҸ� ssapt ����
		//ssapt�� lg�� ���� ������ ���.
		//���������� �Ҵ��� �ּҰ� �Ҵ�
		ssapt.window = 50;
		
		System.out.println("â���� ������ : " +lg.window);

	}

}
