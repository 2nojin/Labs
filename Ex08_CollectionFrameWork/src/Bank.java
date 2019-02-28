import java.util.ArrayList;





public class Bank {
	private ArrayList<Account> accounts = new ArrayList<Account>();
	private int totalAccount=0;
	
	public void addAccount(String accountNo, String name) {

		accounts.add(new Account(accountNo, name));
		totalAccount++;
		System.out.println("°èÁÂ¹øÈ£:"+accountNo);
		System.out.println("ÀÌ¸§:"+name);
	}
	
	public ArrayList<Account> getAccount(String accountNo) {
		
		for(int i=0; i<accounts.size(); i++) {
			if(accounts.get(i).getAccountNo() == accountNo) {
				System.out.println("ÀÌ¸§ : " + accounts.get(i).getName());
				System.out.println("°èÁÂ : " + accounts.get(i).getAccountNo());
				System.out.println("ÀÜ°í : " + accounts.get(i).getBalance());
			}
		}
		return null;
	}
	
	
	public ArrayList<Account> findAccounts(String name) {
		 ArrayList<Account> a = new ArrayList<Account>(); 
		for(int i=0; i<accounts.size(); i++) {
			if(accounts.get(i).getName().equals(name)) {
				a.add(accounts.get(i));
			}
		}
		return a;
	}
	
	public ArrayList<Account> getAccounts() {
		
		return this.accounts;
	}
	
	public int getTotalAccount() {
		return totalAccount;
	}
	
}









class Account {
	private String accountNo;
	private String name;
	private long balance;
	private ArrayList transactions = new ArrayList();
	
	public Account(String accountNo, String name) {
	}

	public void deposit(long amount) {
		
	}
	
	public void withdraw(long amount) {
		
	}
	
	public long getBalance() {
		return 0;
	}

	public ArrayList getTransactions() {
		return transactions;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + "]";
	}
	
	
}








class Transaction {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;
	
	
	
	
}
