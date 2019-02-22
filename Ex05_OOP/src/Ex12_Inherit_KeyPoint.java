//import kr.or.bit.Product;

/*
 �ó�����(�䱸����)
 ����� ������ǰ ���� �ַ���� �����ϴ� ������Դϴ�
 A��� ������ǰ ������ ���µǸ�
 [Ŭ���̾�Ʈ �䱸����]
 ������ǰ�� ��ǰ�� ����, ��ǰ�� ����Ʈ ������ ���������� ������ �ֽ��ϴ�
 ������ ������ǰ�� ��ǰ�� ������ �̸��� ������ �ִ�
 ex)
 ������ ������ǰ�� �̸��� ������ �ִ�(ex: Tv , Audio, Computer)
 ������ ������ǰ�� �ٸ� ������ ������ �ִ�. ( TV:5000, Audio:6000)
 ��ǰ�� ����Ʈ�� ������ 10% �����Ѵ�.
 
 �ùķ��̼� �ó�����
 ������ : ��ǰ�� �����ϱ� ���� �ݾ�����, ����Ʈ������ ������ �ִ�
 ���� ��� : 10����, ����Ʈ 0
 �����ڴ� ��ǰ�� ������ �� �ִ�. ���������� �ϰԵǸ� ������ �ִ� ���� �����ϰ� ����Ʈ�� �ö󰣴�.
 �����ڴ� ó�� �ʱ� �ݾ��� ���� �� �ִ�.
 */

class Product { // ������ǰ
	int price;
	int bonuspoint;

	Product(int price) {
		this.price = price;
		this.bonuspoint = (int) (this.price / 10.0);
	}
	
}


class KtTv extends Product {
	KtTv() {
	    super(2000); // Product(2000)
	}
	
	@Override
	public String toString() {

		return "KtTv";
	}
}


class Audio extends Product {
	Audio() {
		super(100);
	}

	@Override
	public String toString() {

		return "Audio";
	}
}


class Notebook extends Product {
	Notebook() {
		super(100);
	}

	@Override
	public String toString() {

		return "Notebook";
	}
}


class Buyer {
	int money = 5000;
	int bonuspoint=0;

	
	// 3�� ���� (������)
	void Buy(Product p) { // ���� (��ǰ����) //KtTv parameter �� ...
		if (this.money < p.price) {
			System.out.println("���� �ܾ��� �����մϴ� ^^");
			return; // ���� ������ ���� ����
		}
		// �� ��������
		this.money -= p.price;
		this.bonuspoint += p.bonuspoint;
		System.out.println("������ ������ : " + p.toString());
		
		}
}


public class Ex12_Inherit_KeyPoint {

	public static void main(String[] args) {

		KtTv tv = new KtTv();
		Audio audio = new Audio();
		Notebook notebook = new Notebook();
//		Product p;
		Buyer buyer = new Buyer();
		
		buyer.Buy(tv);
		buyer.Buy(audio);
//		p = tv;
//		buyer.Buy(p);
//		buyer.Buy(p);
//		
//		p = notebook;
//		buyer.Buy(p);
//		
//		p = audio;
//		buyer.Buy(p);
		
		System.out.println("�����ݾ�:" +buyer.money);
		System.out.println("��������Ʈ:" +buyer.bonuspoint);
				
		
	}

}