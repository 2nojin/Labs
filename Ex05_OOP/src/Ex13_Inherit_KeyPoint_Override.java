import java.util.Arrays;

/*
�䱸����
īƮ (Cart)
īƮ���� ���忡 �ִ� ��� ������ǰ�� ���� �� �ִ� 
īƮ�� ũ��� �����Ǿ� �ִ� (10��) : 1��  , 2�� ���� �� �ְ� �ִ� 10������ ���� �� �ִ�
���� ������ ���� �ϸ� ... īƮ�� ��´�

���뿡 ���� ��ü ���
������� �ʿ�
summary() ��� �߰��� �ּ���
����� ������ �����̸� �� �������� ����
�� �����ݾ� ��� ���
hint) īƮ ������ ��� ���� (Buy())
hint) Buyer ..>> summary()  main �Լ����� ����Ҷ�

�����ڴ� default �ݾ��� ������ �ְ� �ʱ�ݾ��� ������ �� �� �ִ�
*/

class Product2{  //������ǰ
	int price;
	int bonuspoint;
	
	//Product() {	}
	Product2(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price /10.0);
	}
}
class KtTv2 extends Product2 {
	KtTv2(){
		super(5000);
	}
	@Override
	public String toString() {
		return "KtTv2";
	}
}

class Audio2 extends Product2 {
	Audio2(){
		super(100);
	}
	@Override
	public String toString() {
		return "Audio2";
	}
}

class NoteBook2 extends Product2 {
	NoteBook2(){
		super(100);
	}
	@Override
	public String toString() {
		return "NoteBook2";
	}
}
/*
�䱸����
īƮ (Cart)
īƮ���� ���忡 �ִ� ��� ������ǰ�� ���� �� �ִ� 
īƮ�� ũ��� �����Ǿ� �ִ� (10��) : 1��  , 2�� ���� �� �ְ� �ִ� 10������ ���� �� �ִ�
���� ������ ���� �ϸ� ... īƮ�� ��´�

*/

class Buyer2{
	int money=10000;
	int bonuspoint=0;
	
		//��ٱ��� ����
		Product2[] Cart = new Product2[10];
		int index=0;
		
		Buyer2(){
			
		}
	Buyer2(int money, int bonuspoint){
		this.money=money;
		this.bonuspoint=bonuspoint;
	}
		
		
	void Buy(Product2 product) { //���� (��ǰ����) //KtTv parameter �� ...
		
		
		if(this.money < product.price) {
			System.out.println("���� �ܾ��� �����մϴ� ^^");
			return; //���� ������ ���� ����
		}
		
		
		//Cart ��������
		if(this.index>=10) {
			System.out.println("��ٱ��ϸ� �� �̻� ä�� �� �����ϴ�.");
			return;
		}
		
		//Cart���
		Cart[index++] = product;	//++index���ϸ� �ȉ�
		
		
		//�� ��������
		this.money -= product.price;
		this.bonuspoint += product.bonuspoint;
		System.out.println("������ ������ : " + product.toString());
		System.out.println("���� �ܾ� : " +this.money);
		System.out.println("���� ����Ʈ : " +this.bonuspoint);
		
		
		
	}
	/*���뿡 ���� ��ü ���
	������� �ʿ�
	summary() ��� �߰��� �ּ���
	����� ������ �����̸� �� �������� ����
	�� �����ݾ� ��� ���
	hint) īƮ ������ ��� ���� (Buy())
	hint) Buyer ..>> summary()  main �Լ����� ����Ҷ�

	�����ڴ� default �ݾ��� ������ �ְ� �ʱ�ݾ��� ������ �� �� �ִ�
	*/
	void Summary(){
		int totalprice=0;
		int totalpoint=0;
		String productlist="";
		
		for(int i=0; i<index; i++) {
			totalprice += Cart[i].price;
			totalpoint += Cart[i].bonuspoint;
			productlist += Cart[i].toString() +" ";
		}
		System.out.println("**********************");
		System.out.printf("���Ź��� �Ѿ� : %d\n",totalprice);
		System.out.printf("���Ź��� ����Ʈ : %d\n", +totalpoint);
		System.out.printf("���Ź��� ����Ʈ : %s\n", productlist);
	}
}


public class Ex13_Inherit_KeyPoint_Override {
	public static void main(String[] args) {
		
		Buyer2 buyer = new Buyer2(2000,0);
		KtTv2 tv = new KtTv2();
		Audio2 audio = new Audio2();
		NoteBook2 notebook = new NoteBook2();
		
		buyer.Buy(tv);
		buyer.Buy(tv);
		buyer.Buy(audio);
		buyer.Buy(audio);
		buyer.Buy(notebook);
		
		buyer.Summary();
		
		
		
		
		
		
	}

}
