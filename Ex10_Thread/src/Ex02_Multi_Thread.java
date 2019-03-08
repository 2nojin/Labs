//Tread : ���μ������� �ϳ��� �ּ� �������(method�� ���)

//Thread : ������� (�������� stack ��� ����ϱ�?)
//1. Thread Ŭ������ ��� -> class Test extends Thread()
//�ݵ�� Thread Ŭ������ ����� ��� run() �Լ� ������  >> �ٸ� stack main() ����

//2. implements Runnable ���� -> class Test implements Runnable
//�ݵ�� run() �߻��Լ� ������

//why 2������ �����ұ�...?
//class Test extends Car implements Runnable{  }
//�ٸ� �ڿ��� �̹� ����ϰ� �ִ� Ŭ������ ���ؼ� Thread ����� ���� ���
//���߻���� �ȵǴϱ�..




//Thread �߻�Ŭ���� �ƴ� �Ϲ� Ŭ����
//Thread ���������� ��ü ���� ����
class Thread_1 extends Thread{ //������ stack �����
	
	@Override
	public void run() {	//main�Լ� ����  >> ������ stack�� run()�� ���� ���� �ö󰣴�.
		for(int i=0; i<1000;i++) {
			System.out.println("Tread_1 " +i +" " +this.getName());
		}
		System.out.println("Thread_1 run() END...." );
	}
		
}

class Thread_2 implements Runnable{	//�� ���´� �Ϲ� Ŭ����
	@Override
	public void run() {	//main�Լ� ����  >> ������ stack�� run()�� ���� ���� �ö󰣴�.
		for(int i=0; i<1000;i++) {
			System.out.println("Tread_2 " +i);
		}
		System.out.println("Thread_2 run() END...." );
		aaa();
	}
	
	public void aaa() {
		System.out.println("aaa");
	}
}


public class Ex02_Multi_Thread {
	public static void main(String[] args) {
		System.out.println("Main Strat");
		
		
		//1.Thread_1 ��ü ����
		Thread_1 th = new Thread_1();
		th.start();	//POINT >> stack �޸𸮸� �����(�����ϰ�) stack�� run()���� �÷�����...
		
		
		//2.Thread_2
		Thread_2 th2 = new Thread_2();	// �Ϲ� ��ü
		Thread thread = new Thread(th2);
		thread.start(); //POINT >> stack �޸𸮸� �����(�����ϰ�) stack�� run()���� �÷�����...
		
		
		
		
		for(int i=0;i<1000; i++) {
			System.out.println("main : " +i);
		}
		
		System.out.println("Main End");
		
		
	}
}