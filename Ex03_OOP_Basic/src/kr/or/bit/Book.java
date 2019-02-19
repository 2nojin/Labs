package kr.or.bit;
/*
 * 책은 책이름과 가격을 가지고 있다.
 * 책이 출판되면 반드시 책은 책의 이름과 가격을 가지고 있어야 한다.
 * 책의 이름과 가격 정보는 특정 기능을 통해서 볼 수 있고 출판된 이후에는 수정할 수 없다.
 * 책 이름과 가격정보는 각각 정보를 읽을 수 있다. (getter)
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

	public Book(String name, int price){	// 반드시 책이 생성될때 이름과 가격을 갖는다.
		this.name=name;
		this.price=price;
	
	}
	
	public void BookInfo() {
		System.out.println("책이름:"+this.name);
		System.out.println("책가격:"+this.price);
	}
}




