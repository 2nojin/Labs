import kr.or.bit.Pclass;

//������(������) : default, private, public, ��Ӱ��迡�� Protected
//��Ӱ��迡���� ����
//��鼺 : default, public(��Ӱ��迡��)

//��Ӱ��迡�� Protected (�ڽ�Ŭ���� ���� �Լ���..)

//why? 
//���� ����ϴ� ����� �ڿ��� ������ ������ ���ڴµ�..(�ǵ�)


class Child2 extends Pclass{
	void method() {
		this.p=1000;	//��Ӱ��迡�� protected�� public
		System.out.println(this.p);
	}

}




public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Pclass pc = new Pclass();
		System.out.println("�ٸ� ���������� public:" +pc.j);
		
		Child2 ch = new Child2();
		ch.method();
	}

}