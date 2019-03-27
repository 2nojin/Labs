class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("Drive 시작");
	}
	
	void stop() {
		System.out.println("Stop 멈춤");
	}
	
}

class FireEngine extends Car{
	void water() {
		System.out.println("Water 물뿌림");
	}
}
public class CastingTest0326 {

	public static void main(String[] args) {

		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
//		car.water();		컴파일에러!! Car타입의 참조변수로는 water()를 호출할 수 없다.
		fe2=(FireEngine)car;
		fe2.water();
	}

}
