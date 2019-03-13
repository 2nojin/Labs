//���� : Daemon Thread(����) : �ѱ��۾��� 3�ʸ��� �ڵ�����

public class Ex07_Daemon_Thread implements Runnable{
	static boolean autosave = false;
	
	@Override
	public void run() {	//Daemon Thread...'
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				
			}
			if(autosave) {	//true���̸�
				autoSaveFuntion();
			}
		}
		
	}
	
	public void autoSaveFuntion() {
		System.out.println("������ 3�� �������� �ڵ� ���� �˴ϴ�.");
	}
	
	
	public static void main(String[] args) {	//�Ϲ� ������ (non-daemon)
		Thread th = new Thread(new Ex07_Daemon_Thread());	//implements Runnable
		th.setDaemon(true);	//�ʴ� ���� �������..
		th.start();
		
		//main�Լ�(Ex07_Daemon_Thread ����)
		//main�Լ� ����(�۾���)
		
		for(int i=0; i<=30; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				
			}
			System.out.println("MAIN Thread : " +i);
			if(i == 5) {	//i�� 5�Ǵ� ��������
				System.out.println(i);
				autosave = true;
				
			}
		}
	}
}
