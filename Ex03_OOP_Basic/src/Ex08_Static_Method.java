
public class Ex08_Static_Method {
	int iv=100;
	static int cv=200;
	void method() {
		System.out.println("나 일반함수");
	}
	
	static void smethod() {
		System.out.println("나 static 함수야");
	}
	
	public static void main(String[] args) {
		
		Ex08_Static_Method ex = new Ex08_Static_Method();
		System.out.println(ex.iv);
		ex.method();
		
		Ex08_Static_Method.smethod();
		
		//static 함수는 사용 목적은?
		//목적 : 많이 쓰는 자원을 편하게 사용
		//여러분이 설계도를 만들 때 많이 쓰는 자원은 static 설계....!
		
		
	}

}
