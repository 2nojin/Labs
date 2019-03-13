//개념 : Daemon Thread(보조) : 한글작업시 3초마다 자동저장

public class Ex07_Daemon_Thread implements Runnable{
	static boolean autosave = false;
	
	@Override
	public void run() {	//Daemon Thread...'
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				
			}
			if(autosave) {	//true값이면
				autoSaveFuntion();
			}
		}
		
	}
	
	public void autoSaveFuntion() {
		System.out.println("문서가 3초 간격으로 자동 저장 됩니다.");
	}
	
	
	public static void main(String[] args) {	//일반 쓰레드 (non-daemon)
		Thread th = new Thread(new Ex07_Daemon_Thread());	//implements Runnable
		th.setDaemon(true);	//너는 보조 쓰레드야..
		th.start();
		
		//main함수(Ex07_Daemon_Thread 보조)
		//main함수 역할(글쓰기)
		
		for(int i=0; i<=30; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				
			}
			System.out.println("MAIN Thread : " +i);
			if(i == 5) {	//i가 5되는 시점부터
				System.out.println(i);
				autosave = true;
				
			}
		}
	}
}
