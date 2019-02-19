/*
 * ���Ǽ��� ... ���赵�� ������(������)
 * 
 * �������� ���赵 �ۼ��� ������ ���赵�� ���谡 �־���Ѵ�.(������)
 * 
 * 
 *  ������
 * - ��Ӱ���(is ~ a:���) �� ~ �̴�(�θ����� �ڷ�)
 *  >>���� �����̴�.(O)
 *  >>�簢���� �����̴�(O);
 *  
 * - ���԰���(has ~ a:����) �� ~ �� ������ �ִ�.
 * >>���� ������ ������ �ִ�.(x)
 * >>�簢���� ������ ������ �ִ�.(X)
 * ---------------------------------------
 * 
 * ��Ŭ����
 * 
 * ����Ŭ����
 * 
 * >>��� (�� extends ����)
 * 
 * ���� ���̴�(X)
 * ���� ����(X,Y)
 * ���� ���� ������ �ִ� (has ~ a) ���԰���
 * >> class ��{ �� ������;}
 * 
 * 
 * ����, ��
 * ������ ���̴�(is ~ )(X)
 * ������ ���� ������ �ִ�(has ~ a)(O)
 * class ����{}
 * class ��{}
 * 
 * class ����{ �� gun;}
 * -----------------------------------
 * ���� ���
 * ��, �簢��, �ﰢ�� ����� ���赵�� �ۼ��ϰ� �;��
 * �� : ������ ������
 * �ﰢ�� : 3���� ��
 * �簢�� : 4���� ��
 * �� :  (x,y)
 * 
 * ���� 
 * ���� �����̴�.
 * �ﰢ���� �����̴�
 * �簢���� �����̴�
 * 
 * ���� : (�Ϲ�ȭ, �߻�ȭ) �и� : ����, �׸���
 * ��(��üȭ, Ư��ȭ) -> ��, ������
 * 
 * �� ����(x,y)
 * ���� ���̴� ...(X)
 * �ﰢ���� ���̴�..(X)
 * 
 * ���� ���� ������ �ִ�.
 * �ﰢ���� ���� ������ �ִ�.
 * �簢���� ���� ������ �ִ�. (has ~ a)
 * 
 * �Ϲ�ȭ, �߻�ȭ(����и�) : shape(����, �׸���)
 * 						: point(x,y)
 * class Shape{}
 * class Point{}
 *
 * ��üȭ, Ư��ȭ(circle, triangle)
 *
 */

// �߻�ȭ, �Ϲ�ȭ
class Shape{
	String color="gold";
	void draw() {
		System.out.println("������ �׸���");
	}
}

class Point{
	int x;
	int y;
	
	Point() {
		//this.x=1;
		//this.y=2;
		this(1,2);	//������ ȣ���ϴ� this
	}
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}


//���� ���弼��(���� : �� ���� �������� ������ �ִ�. ���� ������ ������ �ְ�...)
//���� �����̴�(is ~ a) extends
//���� ���� ������ �ִ�(has ~ a) ��������

//���� Ư����,��ü�� : ������

class Circle extends Shape{
	Point center;	//member field(��ǰ) has ~ a
	int r;	//member field(Ư����, ��üȭ)
	
	public Circle() {
		this.center = new Point(5, 8);
		this.r=10;
	}
	public Circle(Point center, int r) {
		this.center=center;
		this.r=r;
	}
}
//���� 1)
//�ﰢ�� Ŭ���� ���弼��
//���� : �ﰢ���� 3���� ���� ���� �׸��� �׸��� ��� ����� ������ �ִ�
//Shape, point Ȱ���ؼ� �۾� �ϼ���
//3���� (x,y) , (x,y) , (x,y) �ǹ�
//default �ﰢ���� �׸� �� �ְ� 3���� ��ǥ���� �޾Ƽ� �׸��� �׸� ���� �ִ�.


public class Ex02_Inherit_Composite {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.draw();
		System.out.println(c.color);
		System.out.println(c.r);
		System.out.println(c.center.x);
		System.out.println(c.center.y);
		
		Point point = new Point(10, 15);
		Circle c2 = new Circle(point, 20);
		System.out.println(c2.color);
		System.out.println(c2.r);
		System.out.println(c2.center.x);
		System.out.println(c2.center.y);
		c2.draw();
	}

}
