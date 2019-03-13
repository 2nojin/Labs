//동기화
//한강 화장실(공유자원) : 다수의 사용자가 화장실을 사용 10명(10개의 Thread)
//LOCK 잠금장치

//잠금장치 대상 : 객체로도 가능
//POINT 잠금대상 : 함수(method)

//김씨가 화장실에서 일 보다가 손을 씻고 싶어서 문 열고 나가서 손을 씻고 들어왔어요.
//다른 녀석이 화장실에 못들어가게 막는다.
class Wroom{
	public synchronized void openDoor(String name) {
		System.out.println(name + "님 화장실 입장");
		for(int i=0; i<50; i++) {
			System.out.println(name + "사용:" +i);
			if(i==10) {
				System.out.println(name +"님 끙!!");
				
			}
		}
		System.out.println("시원!");
	}
}

class User extends Thread{
	private Wroom wr;
	private String who;
	
	public User(String name, Wroom w) {
		this.who = name;
		this.wr = w;	//화장실 주소값
		
	}
	@Override
	public void run() {
		wr.openDoor(this.who);
	}
	
}


public class Ex09_Sync_Thread {

	public static void main(String[] args) {
		//한강둔치
		Wroom w = new Wroom();	//화장실 1개
		
		//사람들
		User kim = new User("김씨", w);
		User lee = new User("이씨", w);
		User park = new User("박씨", w);
		
		//모든 사람들이 배탈
		kim.start();
		lee.start();
		park.start();
		
		
		
	}

}
