package kr.or.bit;
/*
 * å�� å�̸��� ������ ������ �ִ�.
 * å�� ���ǵǸ� �ݵ�� å�� å�� �̸��� ������ ������ �־�� �Ѵ�.
 * å�� �̸��� ���� ������ Ư�� ����� ���ؼ� �� �� �ְ� ���ǵ� ���Ŀ��� ������ �� ����.
 * å �̸��� ���������� ���� ������ ���� �� �ִ�. (getter)
 */
public class Book {

	private String name;
	private int price;
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Book(String name, int price){	// �ݵ�� å�� �����ɶ� �̸��� ������ ���´�.
		this.name=name;
		this.price=price;
	
	}
	
	public void BookInfo() {
		System.out.println("å�̸�:"+this.name);
		System.out.println("å����:"+this.price);
	}
}




