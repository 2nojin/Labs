//������� �ϳ�(012-16541-0233) >> 1000�Ա�
//����� ó��

//ģ�� 5��(�Ȱ��� ī�� ����)
// ���ÿ� ���� ���

//ATM ���ÿ� ���

//������ (��� ����) ���� LOCK ��� (�ٸ� ��� ���)

class Account{ //����
	int balance = 1000;	//�ܾ�
	void withdraw(int money) {	//���	//�����ġ�� �ʿ��� ���
		//����Ȯ��, ����Ȯ��...(ȣ��)
		System.out.println("�� : " +Thread.currentThread().getName());
		System.out.println("���� �ܾ� ���� : " +this.balance);
		System.out.println("�� : " +Thread.currentThread().getName().toString());
		
		if(this.balance >= money) {
			try {
				Thread.sleep(1000); //������� ó���Ǵ� ����(����,���� ���) : �ٸ� �Լ� ȣ��
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			this.balance -= money;
		}
		System.out.println("����ݾ� : " +money);
		System.out.println("�����ݾ� : " +this.balance);
	}
	
}

class Bank implements Runnable{
	
	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.balance > 0) {
			int money = ((int)Math.random()*3+1)*100;
			//100, 200, 300
			//�� ��� ó��
			acc.withdraw(money);
		}
	}
}

public class Ex10_Sync_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank();
		
		Thread thread = new Thread(bank, "Park");
		Thread thread2 = new Thread(bank, "Park");
		Thread thread3 = new Thread(bank, "Park");
		
		thread.start();
		thread2.start();
		thread3.start();
	}

}
