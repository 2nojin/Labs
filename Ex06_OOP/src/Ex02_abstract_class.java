/*
 * ��Ÿũ����Ʈ
 * 
 * ����(unit)
 * 
 * unit ������(�̵���ǥ, �̵�, ����)
 * unit �̵������ �ٸ���
 * 
 * ���� : unit Ŭ���� ���� �����鿡�� ����.. ������ unit�� �����
 * 
 * �߻�Ŭ������ ������ ����
 */


	abstract class Unit{
	
	int x,y;
	
	
	
	void stop() {
		System.out.println("Unit Stop");
	}
	
	
	//��� ������ �̵��� ������ ������ ���ָ��� ����� �ٸ���.
	abstract void move(int x, int y);	//{ }������� ������ �ʴ´�. ���ư��� / �ɾ��
	//�߻��ڿ� -> ��üȭ, Ư��ȭ, ��üȭ
	
	
}

	
class Tank extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("Tank �̵�:" +this.x +"," +this.y);
	}
	//Tank ��üȭ Ư��ȭ..
	void changeMode() {
		System.out.println("��ũ ��ȯ ��� ����");
	}
	//�ʿ��ϴٸ� .. ����
	
}




class Marine extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("���� �̵�:" +this.x +"," +this.y);
	}
	
	void stimpack() {
		System.out.println("������ ��� ���");
	}
}



class Dropship extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("����� ���� �̵�:" +this.x +"," +this.y);
	}
	
	void load() {
		System.out.println("Unit load");
	}
	void unload() {
		System.out.println("Unit unload");
	}
}







public class Ex02_abstract_class {
	public static void main(String[] args) {
		
		
		Tank t = new Tank();
		t.move(100, 200);
		t.stop();
		t.changeMode();
		
		Marine m = new Marine();
		m.move(300, 200);
		m.stop();
		m.stimpack();
		
		
		//1. Quiz ��ũ 3�븦 ����� [������ǥ]�� �̵�
		Tank[] tank = {new Tank(), new Tank(),new Tank()};
		
		for(Tank ta : tank) {
			ta.move(10, 200);
		}
		
		for(int i=0; i<tank.length; i++) {
			
			tank[i].move(111, 333);
		}
		
		System.out.println("--------------------");
		
		//2. Quiz
		//Tank, Marine, DropShip 3���� unit�� ��ǥ�� �̵���Ű����
		//void Buy(Product p)
		//cart >> Product[] cart
		
		Unit[] unit = {new Tank(), new Marine(), new Dropship()};
		
		for(int i=0; i<unit.length; i++) {
			unit[i].move(100, 200);
		}
		
		//Today Point
		//���� �ٸ� �͵��� ���� �θ�� ����� Ȱ��
		//������............
		
		
		
		
	}
}
