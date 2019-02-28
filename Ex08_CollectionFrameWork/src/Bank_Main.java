
public class Bank_Main {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.addAccount("1", "최병현");
		b.addAccount("2", "신선화");
		b.addAccount("3", "이노진");
		
		b.getAccount("2");
		
	}

}
