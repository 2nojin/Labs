
public class Bank_Main {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.addAccount("1", "�ֺ���");
		b.addAccount("2", "�ż�ȭ");
		b.addAccount("3", "�̳���");
		
		b.getAccount("2");
		
	}

}
