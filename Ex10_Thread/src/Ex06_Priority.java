//�켱���� : CPU �������� ���̰ڴ�.
//��� Thread : ����� 5 (default)
//MAX : 10, MIN : 1(�����..)

class Pth extends Thread{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("~~~~~~~~~~~~~~");
		}
	}
}

class Pth2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("||||||||||||||");
		}
	}
}


class Pth3 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("**************");
		}
	}
}


public class Ex06_Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pth ph = new Pth();
		Pth2 ph2 = new Pth2();
		Pth3 ph3 = new Pth3();
		
		System.out.println(ph.getPriority());
		System.out.println(ph2.getPriority());
		System.out.println(ph3.getPriority());
		
		ph.setPriority(10);	//"~~~~~~~~~~~~~~" ���� ������ Ȯ���� �ö�
		
		ph.start();
		ph2.start();
		ph3.start();
		
		System.out.println("MAIN END &&&&&&&&&");
		
	}

}
